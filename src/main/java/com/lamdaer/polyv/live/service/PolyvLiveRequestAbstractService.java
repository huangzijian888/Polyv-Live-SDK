package com.lamdaer.polyv.live.service;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpStatus;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.lamdaer.polyv.live.bean.result.PolyvLiveCommonResult;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 请求发起抽象类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public abstract class PolyvLiveRequestAbstractService {

    private static final Logger LOG = LoggerFactory.getLogger(PolyvLiveRequestAbstractService.class);

    /**
     * get 请求
     *
     * @param url    接口地址
     * @param params 请求参数
     * @return 响应结果
     */
    protected PolyvLiveCommonResult getRequest(String url, Map<String, Object> params) {
        String result = HttpUtil.get(url, params);
        return getPlLiveCommonResult(result);
    }

    /**
     * post 请求
     *
     * @param url    接口地址
     * @param params 请求参数
     * @return 响应结果
     */
    protected PolyvLiveCommonResult postRequest(String url, Map<String, Object> params) {
        String result = HttpRequest.post(url).form(params).execute().body();
        return getPlLiveCommonResult(result);
    }

    /**
     * 返回信息处理
     *
     * @param result 原始返回信息
     * @return 处理后的返回信息
     */
    public PolyvLiveCommonResult getPlLiveCommonResult(String result) {
        JSON jsonResult = null;
        int code = 0;
        String status = null;
        String message = null;
        try {
            jsonResult = JSONUtil.parse(result);
            code = (int) jsonResult.getByPath("code");
            status = (String) jsonResult.getByPath("status");
            message = (String) jsonResult.getByPath("message");
        } catch (Exception e) {
            LOG.error("json parse error.");
            return new PolyvLiveCommonResult(ErrorCodeEnum.JSON_PARSE_ERROR.getCode(), "error", ErrorCodeEnum.JSON_PARSE_ERROR.getMsg(), null);
        }
        if (HttpStatus.HTTP_OK == code) {
            return new PolyvLiveCommonResult(code, status, message, jsonResult.getByPath("data"));
        }
        return new PolyvLiveCommonResult(code, status, message, null);
    }
}

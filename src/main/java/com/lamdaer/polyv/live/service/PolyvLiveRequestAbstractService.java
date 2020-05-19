package com.lamdaer.polyv.live.service;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpStatus;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.lamdaer.polyv.live.bean.result.PolyvLiveCommonResult;

import java.util.Map;

/**
 * 请求发起抽象类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public abstract class PolyvLiveRequestAbstractService {

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
    private PolyvLiveCommonResult getPlLiveCommonResult(String result) {
        JSON jsonResult = JSONUtil.parse(result);
        int code = (int) jsonResult.getByPath("code");
        String status = (String) jsonResult.getByPath("status");
        String message = (String) jsonResult.getByPath("message");
        if (HttpStatus.HTTP_OK == code) {
            return new PolyvLiveCommonResult(code, status, message, jsonResult.getByPath("data"));
        }
        return new PolyvLiveCommonResult(code, status, message, null);
    }
}

package com.lamdaer.polyv.live.bean.request;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;

import java.util.*;

/**
 * 请求基础类
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public abstract class PolyvLiveBaseRequest {

    /**
     * <pre>
     * 字段名：账号应用ID
     * 变量名：appId
     * 是否必填：是
     * </pre>
     */
    protected String appId;

    /**
     * <pre>
     * 字段名：密钥
     * 变量名：appSecret
     * 是否必填：是
     * </pre>
     */
    protected String appSecret;

    /**
     * <pre>
     * 字段名：时间戳
     * 变量名：timestamp
     * 是否必填：是
     * </pre>
     */
    protected Long timestamp;

    /**
     * <pre>
     * 字段名：签名
     * 变量名：sign
     * 是否必填：是
     * </pre>
     */
    protected String sign;

    public PolyvLiveBaseRequest(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * 获取处理后的请求参数
     *
     * @return 请求参数集合
     */
    public Map<String, Object> getParams() {
        Map<String, Object> paramMap = BeanUtil.beanToMap(this);
        Map<String, Object> params = paraFilter(paramMap);
        this.sign = this.generateSign(params, this.appSecret);
        params.put("sign", this.sign);
        return params;
    }

    /**
     * 签名生成函数
     *
     * @param parameter 需要参与签名的参数集合
     * @param appSecret 直播后台-开发设置-身份认证-AppSecret
     * @return 签名值
     */
    protected String generateSign(Map<String, Object> parameter, String appSecret) {
        String concatStr = concatParams(parameter);
        String plain = appSecret + concatStr + appSecret;
        String encrypted = SecureUtil.md5(plain);
        String upperCase = encrypted.toUpperCase();
        return upperCase;
    }

    /**
     * 参数过滤
     *
     * @param parameter 需要过滤的参数集合
     * @return 过滤后的参数集合
     */
    protected Map<String, Object> paraFilter(Map<String, Object> parameter) {
        Map<String, Object> result = new HashMap<>();
        if (parameter == null || parameter.size() <= 0) {
            return result;
        }
        for (String key : parameter.keySet()) {
            String value = parameter.get(key) + "";
            if (value.equalsIgnoreCase("null")
                    || StrUtil.hasBlank(value)
                    || key.equalsIgnoreCase("appSecret")
                    || key.equalsIgnoreCase("sign")
                    || value.equals(String.valueOf(ErrorCodeEnum.DEFAULT.getCode()))
            ) {
                continue;
            }
            result.put(key, value);
        }
        return result;
    }

    /**
     * 参数拼接
     *
     * @param params 需要进行拼接的参数集合
     * @return 拼接后的参数集合
     */
    private String concatParams(Map<String, Object> params) {
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = (String) params.get(key);
            sb.append(key).append(value);
        }
        return sb.toString();
    }


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "PolyvLiveBaseRequest{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

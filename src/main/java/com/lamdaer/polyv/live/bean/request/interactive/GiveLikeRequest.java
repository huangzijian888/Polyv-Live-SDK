package com.lamdaer.polyv.live.bean.request.interactive;

import cn.hutool.core.bean.BeanUtil;
import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;

import java.util.Map;

/**
 * 发送点赞请求类
 *
 * @author lamdaer
 * createTime 2020/5/8
 */
public class GiveLikeRequest extends PolyvLiveBaseRequest {

    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 是否必填：是
     * 备注：该参数属于路径参数 不需要参与签名
     * </pre>
     */
    private int channelId;

    /**
     * <pre>
     * 字段名：观众ID
     * 变量名：viewerId
     * 是否必填：是
     * </pre>
     */
    private String viewerId;

    /**
     * <pre>
     * 字段名：点赞的数目
     * 变量名：times
     * 是否必填：否
     * 注意：点赞的数目，不能超过30，提交后在times-1秒后才能再点赞
     * </pre>
     */
    private int times = ErrorCodeEnum.DEFAULT.getCode();


    public GiveLikeRequest(String appId, String appSecret, int channelId, String viewerId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.viewerId = viewerId;
    }

    public GiveLikeRequest(String appId, String appSecret, int channelId, String viewerId, int times) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.viewerId = viewerId;
        this.times = times;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getViewerId() {
        return viewerId;
    }

    public void setViewerId(String viewerId) {
        this.viewerId = viewerId;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> paramMap = BeanUtil.beanToMap(this);
        Map<String, Object> params = this.paraFilter(paramMap);
        this.sign = super.generateSign(params, this.appSecret);
        params.put("sign", this.sign);
        return params;
    }


    @Override
    protected Map<String, Object> paraFilter(Map<String, Object> parameter) {
        parameter.put("channelId", "");
        return super.paraFilter(parameter);
    }


    @Override
    public String toString() {
        return "GiveLikeRequest{" +
                "viewerId='" + viewerId + '\'' +
                ", times=" + times +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

package com.lamdaer.polyv.live.bean.request.interactive;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;

/**
 * 获取频道抽奖记录列表
 *
 * @author lamdaer
 * createTime 2020/5/6
 */
public class GetChannelLotteryRecordRequest extends PolyvLiveBaseRequest {

    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 是否必填：是
     * </pre>
     */
    private int channelId;

    /**
     * <pre>
     * 字段名：直播场次id
     * 变量名：sessionId
     * 是否必填：否
     * </pre>
     */
    private String sessionId;

    /**
     * <pre>
     * 字段名：查询开始日期时间戳
     * 变量名：startTime
     * 是否必填：是
     * </pre>
     */
    private long startTime;

    /**
     * <pre>
     * 字段名：查询结束日期时间戳
     * 变量名：endTime
     * 是否必填：是
     * </pre>
     */
    private long endTime;

    /**
     * <pre>
     * 字段名：查询的页数
     * 变量名：page
     * 是否必填：否
     * </pre>
     */
    private int page = ErrorCodeEnum.DEFAULT.getCode();

    /**
     * <pre>
     * 字段名：每页数量
     * 变量名：limit
     * 是否必填：否
     * </pre>
     */
    private int limit = ErrorCodeEnum.DEFAULT.getCode();

    public GetChannelLotteryRecordRequest(String appId, String appSecret, int channelId, long startTime, long endTime) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public GetChannelLotteryRecordRequest(String appId, String appSecret, int channelId, String sessionId, long startTime, long endTime) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public GetChannelLotteryRecordRequest(String appId, String appSecret, int channelId, long startTime, long endTime, int page) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.page = page;
    }

    public GetChannelLotteryRecordRequest(String appId, String appSecret, int channelId, String sessionId, long startTime, long endTime, int page) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.page = page;
    }

    public GetChannelLotteryRecordRequest(String appId, String appSecret, int channelId, String sessionId, long startTime, long endTime, int page, int limit) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.sessionId = sessionId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.page = page;
        this.limit = limit;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "GetLotteryRecordRequest{" +
                "channelId=" + channelId +
                ", sessionId='" + sessionId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", page=" + page +
                ", limit=" + limit +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

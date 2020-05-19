package com.lamdaer.polyv.live.bean.request.interactive;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;

/**
 * 查询频道问卷列表
 * 文档地址：http://dev.polyv.net/2019/liveproduct/l-api/zbhd/list-questionaire/
 *
 * @author lamdaer
 * createTime 2020/5/9
 */
public class GetChannelQuestionnaireListRequest extends PolyvLiveBaseRequest {

    /**
     * <pre>
     * 字段名：频道号
     * 变量名：channelId
     * 是否必填：是
     * </pre>
     */
    private String channelId;

    /**
     * <pre>
     * 字段名：开始时间
     * 变量名：startTime
     * 是否必填：否
     * </pre>
     */
    private long startTime;

    /**
     * <pre>
     * 字段名：结束时间
     * 变量名：endTime
     * 是否必填：否
     * </pre>
     */
    private long endTime;

    /**
     * <pre>
     * 字段名：查询的页数
     * 变量名：page
     * 是否必填：否
     * 默认值：1
     * 注意：初始化赋值 -99999 用于生成签名时过滤参数
     * </pre>
     */
    private int page = ErrorCodeEnum.DEFAULT.getCode();

    /**
     * <pre>
     * 字段名：每页数量
     * 变量名：pageSize
     * 是否必填：否
     * 默认值：10
     * 注意：初始化赋值 -99999 用于生成签名时过滤参数
     * </pre>
     */
    private int pageSize = ErrorCodeEnum.DEFAULT.getCode();


    public GetChannelQuestionnaireListRequest(String appId, String appSecret, String channelId) {
        super(appId, appSecret);
        this.channelId = channelId;
    }

    public GetChannelQuestionnaireListRequest(String appId, String appSecret, String channelId, long startTime, long endTime) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public GetChannelQuestionnaireListRequest(String appId, String appSecret, String channelId, long startTime, long endTime, int page, int pageSize) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.page = page;
        this.pageSize = pageSize;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "GetChannelQuestionnaireListRequest{" +
                "channelId='" + channelId + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

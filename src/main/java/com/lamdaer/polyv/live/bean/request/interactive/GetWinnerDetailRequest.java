package com.lamdaer.polyv.live.bean.request.interactive;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;

/**
 * 获取频道单场抽奖的中奖记录
 *
 * @author lamdaer
 * createTime 2020/5/6
 */
public class GetWinnerDetailRequest extends PolyvLiveBaseRequest {

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
     * 字段名：抽奖ID
     * 变量名：lotteryId
     * 是否必填：是
     * </pre>
     */
    private String lotteryId;

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

    public GetWinnerDetailRequest(String appId, String appSecret, int channelId, String lotteryId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.lotteryId = lotteryId;
    }

    public GetWinnerDetailRequest(String appId, String appSecret, int channelId, String lotteryId, int page, int limit) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.lotteryId = lotteryId;
        this.page = page;
        this.limit = limit;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId;
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
        return "GetWinnerDetailRequest{" +
                "channelId=" + channelId +
                ", lotteryId='" + lotteryId + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

package com.lamdaer.polyv.live.bean.request.interactive;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;

/**
 * 查询指定签到ID的签到记录
 * https://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-checkin/
 *
 * @author lamdaer
 * createTime 2020/7/1
 */
public class GetCheckInsRequest extends PolyvLiveBaseRequest {
    private Integer channelId;
    private String checkinId;

    public GetCheckInsRequest(String appId, String appSecret, Integer channelId, String checkinId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.checkinId = checkinId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getCheckinId() {
        return checkinId;
    }

    public void setCheckinId(String checkinId) {
        this.checkinId = checkinId;
    }

    @Override
    public String toString() {
        return "GetCheckInsRequest{" +
                "channelId=" + channelId +
                ", checkinId='" + checkinId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

package com.lamdaer.polyv.live.bean.request.interactive;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;

/**
 * 发送打赏消息
 *
 * @author lamdaer
 * createTime 2020/5/8
 */
public class SendRewardMessageRequest extends PolyvLiveBaseRequest {

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
     * 字段名：昵称
     * 变量名：nickname
     * 是否必填：是
     * </pre>
     */
    private String nickname;

    /**
     * <pre>
     * 字段名：头像
     * 变量名：avatar
     * 是否必填：是
     * </pre>
     */
    private String avatar;

    /**
     * <pre>
     * 字段名：打赏者id
     * 变量名：viewerId
     * 是否必填：是
     * </pre>
     */
    private String viewerId;

    /**
     * <pre>
     * 字段名：打赏类型
     * 变量名：donateType
     * 是否必填：是
     * </pre>
     */
    private String donateType;

    /**
     * <pre>
     * 字段名：打赏内容
     * 变量名：content
     * 是否必填：是
     * </pre>
     */
    private String content;

    /**
     * <pre>
     * 字段名：礼物图片
     * 变量名：goodImage
     * 是否必填：否
     * </pre>
     */
    private String goodImage;

    /**
     * <pre>
     * 字段名：场次id
     * 变量名：sessionId
     * 是否必填：否
     * </pre>
     */
    private String sessionId;

    public SendRewardMessageRequest(String appId, String appSecret, int channelId, String nickname, String avatar, String viewerId, String donateType, String content) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.nickname = nickname;
        this.avatar = avatar;
        this.viewerId = viewerId;
        this.donateType = donateType;
        this.content = content;
    }

    public SendRewardMessageRequest(String appId, String appSecret, int channelId, String nickname, String avatar, String viewerId, String donateType, String content, String goodImage) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.nickname = nickname;
        this.avatar = avatar;
        this.viewerId = viewerId;
        this.donateType = donateType;
        this.content = content;
        this.goodImage = goodImage;
    }

    public SendRewardMessageRequest(String appId, String appSecret, int channelId, String nickname, String avatar, String viewerId, String donateType, String content, String goodImage, String sessionId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.nickname = nickname;
        this.avatar = avatar;
        this.viewerId = viewerId;
        this.donateType = donateType;
        this.content = content;
        this.goodImage = goodImage;
        this.sessionId = sessionId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getViewerId() {
        return viewerId;
    }

    public void setViewerId(String viewerId) {
        this.viewerId = viewerId;
    }

    public String getDonateType() {
        return donateType;
    }

    public void setDonateType(String donateType) {
        this.donateType = donateType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGoodImage() {
        return goodImage;
    }

    public void setGoodImage(String goodImage) {
        this.goodImage = goodImage;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "SendRewardMessageRequest{" +
                "channelId=" + channelId +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                ", viewerId='" + viewerId + '\'' +
                ", donateType='" + donateType + '\'' +
                ", content='" + content + '\'' +
                ", goodImage='" + goodImage + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

package com.lamdaer.polyv.live.bean.request.interactive;

import cn.hutool.json.JSONUtil;
import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;

import java.util.ArrayList;

/**
 * 设置抽奖中奖者信息
 * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/tjzjxx/
 *
 * @author lamdaer
 * createTime 2020/5/22
 */
public class SetLotteryWinnersRequest extends PolyvLiveBaseRequest {
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
     * 字段名：抽奖场次ID
     * 变量名：lotteryId
     * 是否必填：是
     * </pre>
     */
    private String lotteryId;
    /**
     * <pre>
     * 字段名：中奖码
     * 变量名：winnerCode
     * 是否必填：是
     * </pre>
     */
    private String winnerCode;
    /**
     * <pre>
     * 字段名：中奖者ID
     * 变量名：viewerId
     * 是否必填：是
     * </pre>
     */
    private String viewerId;
    /**
     * <pre>
     * 字段名：中奖者姓名
     * 变量名：name
     * 是否必填：否
     * </pre>
     */
    private String name;
    /**
     * <pre>
     * 字段名：中奖者手机号
     * 变量名：telephone
     * 是否必填：否
     * </pre>
     */
    private String telephone;
    /**
     * <pre>
     * 字段名：自定义字段数据
     * 变量名：receiveInfo
     * 是否必填：否
     * </pre>
     */
    private String receiveInfo;

    public SetLotteryWinnersRequest(String appId, String appSecret, String channelId, String lotteryId, String winnerCode, String viewerId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.lotteryId = lotteryId;
        this.winnerCode = winnerCode;
        this.viewerId = viewerId;
    }

    public SetLotteryWinnersRequest(String appId, String appSecret, String channelId, String lotteryId, String winnerCode, String viewerId, String name, String telephone) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.lotteryId = lotteryId;
        this.winnerCode = winnerCode;
        this.viewerId = viewerId;
        this.name = name;
        this.telephone = telephone;
    }

    public SetLotteryWinnersRequest(String appId, String appSecret, String channelId, String lotteryId, String winnerCode, String viewerId, ArrayList<ReceiveInfoBody> receiveInfo) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.lotteryId = lotteryId;
        this.winnerCode = winnerCode;
        this.viewerId = viewerId;
        this.receiveInfo = JSONUtil.toJsonStr(receiveInfo);
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getWinnerCode() {
        return winnerCode;
    }

    public void setWinnerCode(String winnerCode) {
        this.winnerCode = winnerCode;
    }

    public String getViewerId() {
        return viewerId;
    }

    public void setViewerId(String viewerId) {
        this.viewerId = viewerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getReceiveInfo() {
        return receiveInfo;
    }

    public void setReceiveInfo(String receiveInfo) {
        this.receiveInfo = receiveInfo;
    }

    @Override
    public String toString() {
        return "SetLotteryWinnersRequest{" +
                "channelId='" + channelId + '\'' +
                ", lotteryId='" + lotteryId + '\'' +
                ", winnerCode='" + winnerCode + '\'' +
                ", viewerId='" + viewerId + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", receiveInfo=" + receiveInfo +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

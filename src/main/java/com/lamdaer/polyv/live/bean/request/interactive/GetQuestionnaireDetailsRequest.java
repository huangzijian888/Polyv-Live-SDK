package com.lamdaer.polyv.live.bean.request.interactive;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;

/**
 * 查询频道问卷详情
 * 文档地址：http://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-questionnaire-detail/
 *
 * @author lamdaer
 * createTime 2020/5/9
 */
public class GetQuestionnaireDetailsRequest extends PolyvLiveBaseRequest {

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
     * 字段名：问卷id
     * 变量名：questionnaireId
     * 是否必填：是
     * </pre>
     */
    private String questionnaireId;

    public GetQuestionnaireDetailsRequest(String appId, String appSecret, int channelId, String questionnaireId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.questionnaireId = questionnaireId;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public String getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(String questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    @Override
    public String toString() {
        return "QueryDetailsQuestionnaireRequest{" +
                "channelId=" + channelId +
                ", questionnaireId='" + questionnaireId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

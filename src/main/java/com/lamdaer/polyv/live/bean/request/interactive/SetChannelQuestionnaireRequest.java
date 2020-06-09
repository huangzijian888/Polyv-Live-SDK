package com.lamdaer.polyv.live.bean.request.interactive;

import cn.hutool.core.bean.BeanUtil;
import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;

import java.util.List;
import java.util.Map;

/**
 * 设置频道问卷信息
 * 文档地址：http://dev.polyv.net/2019/liveproduct/l-api/zbhd/add-edit-questionnaire/
 *
 * @author lamdaer
 * createTime 2020/5/29
 */
public class SetChannelQuestionnaireRequest extends PolyvLiveBaseRequest {
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
     * 字段名：问卷id,修改问卷时需要
     * 变量名：questionnaireId
     * 是否必填：否
     * </pre>
     */
    private String questionnaireId;

    /**
     * <pre>
     * 字段名：客户自定义问卷id
     * 变量名：customQuestionnaireId
     * 是否必填：否
     * </pre>
     */
    private String customQuestionnaireId;

    /**
     * <pre>
     * 字段名：问卷标题
     * 变量名：questionnaireTitle
     * 是否必填：是
     * </pre>
     */
    private String questionnaireTitle;

    /**
     * <pre>
     * 字段名：题目数组
     * 变量名：questions
     * 是否必填：是
     * </pre>
     */
    private List<QuestionBody> questions;

    public SetChannelQuestionnaireRequest(String appId, String appSecret, int channelId, String questionnaireTitle, List<QuestionBody> questions) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.questionnaireTitle = questionnaireTitle;
        this.questions = questions;
    }

    public SetChannelQuestionnaireRequest(String appId, String appSecret, int channelId, String questionnaireId, String questionnaireTitle, List<QuestionBody> questions) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.questionnaireId = questionnaireId;
        this.questionnaireTitle = questionnaireTitle;
        this.questions = questions;
    }

    public SetChannelQuestionnaireRequest(String appId, String appSecret, int channelId, String questionnaireId, String customQuestionnaireId, String questionnaireTitle, List<QuestionBody> questions) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.questionnaireId = questionnaireId;
        this.customQuestionnaireId = customQuestionnaireId;
        this.questionnaireTitle = questionnaireTitle;
        this.questions = questions;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> paramMap = BeanUtil.beanToMap(this);
        Map<String, Object> params = super.paraFilter(paramMap);
        super.sign = super.generateSign(params, super.appSecret);
        params.put("sign", this.sign);
        params.remove("appId");
        params.remove("timestamp");
        params.remove("sign");
        params.remove("channelId");
        return params;
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

    public String getCustomQuestionnaireId() {
        return customQuestionnaireId;
    }

    public void setCustomQuestionnaireId(String customQuestionnaireId) {
        this.customQuestionnaireId = customQuestionnaireId;
    }

    public String getQuestionnaireTitle() {
        return questionnaireTitle;
    }

    public void setQuestionnaireTitle(String questionnaireTitle) {
        this.questionnaireTitle = questionnaireTitle;
    }

    public List<QuestionBody> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionBody> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "SetChannelQuestionnaireRequest{" +
                "channelId=" + channelId +
                ", questionnaireId='" + questionnaireId + '\'' +
                ", customQuestionnaireId='" + customQuestionnaireId + '\'' +
                ", questionnaireTitle='" + questionnaireTitle + '\'' +
                ", questions=" + questions +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

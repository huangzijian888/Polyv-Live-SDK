package com.lamdaer.polyv.live.bean.request.interactive;

import java.util.List;

/**
 * 问卷题目
 *
 * @author lamdaer
 * createTime 2020/5/29
 */
public class QuestionBody {
    /**
     * <pre>
     * 字段名：题目id，修改问卷时需要传
     * 变量名：questionId
     * 是否必填：否
     * </pre>
     */
    private String questionId;

    /**
     * <pre>
     * 字段名：题目
     * 变量名：name
     * 是否必填：是
     * </pre>
     */
    private String name;

    /**
     * <pre>
     * 字段名：题目类型,R为单选，C为多选，Q为问答
     * 变量名：type
     * 是否必填：是
     * </pre>
     */
    private String type;

    /**
     * <pre>
     * 字段名：需要评分的选择题才有答案，填入对应选项序号，如：A或AB
     * 变量名：answer
     * 是否必填：否
     * </pre>
     */
    private String answer;

    /**
     * <pre>
     * 字段名：题目是否需要评分，Y为需要，N为不需要
     * 变量名：scoreEnabled
     * 是否必填：否
     * </pre>
     */
    private String scoreEnabled;

    /**
     * <pre>
     * 字段名：分数
     * 变量名：score
     * 是否必填：否
     * </pre>
     */
    private Integer score;

    /**
     * <pre>
     * 字段名：题目是否为必答，Y为必答，N为非必答
     * 变量名：required
     * 是否必填：否
     * </pre>
     */
    private String required;

    /**
     * <pre>
     * 字段名：题目为单选题或多选题为必填，选项数组下标0-9对应答案A-J
     * 变量名：options
     * 是否必填：否
     * </pre>
     */
    private List<String> options;



    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getScoreEnabled() {
        return scoreEnabled;
    }

    public void setScoreEnabled(String scoreEnabled) {
        this.scoreEnabled = scoreEnabled;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "QuestionBody{" +
                "questionId='" + questionId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", answer='" + answer + '\'' +
                ", scoreEnabled='" + scoreEnabled + '\'' +
                ", score=" + score +
                ", required='" + required + '\'' +
                ", options=" + options +
                '}';
    }
}

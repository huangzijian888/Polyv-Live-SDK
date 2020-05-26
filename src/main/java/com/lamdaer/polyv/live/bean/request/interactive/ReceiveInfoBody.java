package com.lamdaer.polyv.live.bean.request.interactive;

/**
 * 设置中奖者信息-自定义字段
 *
 * @author lamdaer
 * createTime 2020/5/22
 */
public class ReceiveInfoBody {
    /**
     * <pre>
     * 字段名：字段
     * 变量名：field
     * 是否必填：是
     * </pre>
     */
    private String field;

    /**
     * <pre>
     * 字段名：值
     * 变量名：value
     * 是否必填：是
     * </pre>
     */
    private String value;

    public ReceiveInfoBody(String field, String value) {
        this.field = field;
        this.value = value;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReceiveInfoBody{" +
                "field='" + field + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

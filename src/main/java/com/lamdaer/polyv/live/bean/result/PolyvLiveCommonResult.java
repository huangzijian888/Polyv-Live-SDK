package com.lamdaer.polyv.live.bean.result;

/**
 * 响应结果公共类
 *
 * @author lamdaer
 * createTime 2020/05/03
 */
public class PolyvLiveCommonResult extends PolyvLiveBaseResult {

    /**
     * <pre>
     * 字段名：请求返回的数据
     * 变量名：data
     * 是否必填：是
     * </pre>
     */
    private Object data;

    public PolyvLiveCommonResult(int code, String status, String message, Object data) {
        this.setData(data);
        super.code = code;
        super.status = status;
        super.setMessage(message);
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = "".equals(data) ? "null" : data;
    }

    @Override
    public String toString() {
        return "PLLiveCommonResult{" +
                "data=" + data +
                ", code=" + code +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

package com.lamdaer.polyv.live.bean.request.interactive;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;
import com.lamdaer.polyv.live.enumeration.ErrorCodeEnum;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 查询签到结果
 *
 * @author lamdaer
 * createTime 2020/6/4
 */
public class GetCheckResultRequest extends PolyvLiveBaseRequest {
    private int channelId;
    private int page;
    private int pageSize;

    /**
     * <pre>
     * 字段名：指定的日期
     * 变量名：date
     * 是否必填：否
     * 注意：直接传 Date 对象，代码中已做处理会自动转成 yyyy-MM-dd 格式
     * </pre>
     */
    private Date date;

    /**
     * <pre>
     * 字段名：场次id
     * 变量名：sessionId
     * 是否必填：否
     * </pre>
     */
    private String sessionId;

    public GetCheckResultRequest(String appId, String appSecret, int channelId) {
        super(appId, appSecret);
        this.channelId = channelId;
    }

    public GetCheckResultRequest(String appId, String appSecret, int channelId, int page, int pageSize) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.page = page;
        this.pageSize = pageSize;
    }

    public GetCheckResultRequest(String appId, String appSecret, int channelId, int page, int pageSize, Date date) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.page = page;
        this.pageSize = pageSize;
        this.date = date;
    }

    public GetCheckResultRequest(String appId, String appSecret, int channelId, int page, int pageSize, String sessionId) {
        super(appId, appSecret);
        this.channelId = channelId;
        this.page = page;
        this.pageSize = pageSize;
        this.sessionId = sessionId;
    }

    @Override
    public Map<String, Object> getParams() {
        Map<String, Object> paramMap = BeanUtil.beanToMap(this);
        Map<String, Object> params = this.paraFilter(paramMap);
        super.sign = super.generateSign(params, super.appSecret);
        params.put("sign", super.sign);
        return params;
    }

    @Override
    protected Map<String, Object> paraFilter(Map<String, Object> parameter) {
        Map<String, Object> result = new HashMap<>();
        if (parameter == null || parameter.size() <= 0) {
            return result;
        }
        for (String key : parameter.keySet()) {
            String value = parameter.get(key) + "";
            if (value.equalsIgnoreCase("null")
                    || StrUtil.hasBlank(value)
                    || key.equalsIgnoreCase("appSecret")
                    || key.equalsIgnoreCase("sign")
                    || value.equals(String.valueOf(ErrorCodeEnum.DEFAULT.getCode()))
            ) {
                continue;
            }
            if (key.equals("date")) {
                DateTime dateTime = DateUtil.parse(value);
                String dateStr = DateUtil.format(dateTime, "yyyy-MM-dd");
                result.put(key, dateStr);
            } else {
                result.put(key, value);
            }
        }
        return result;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "GetCheckResultRequest{" +
                "channelId=" + channelId +
                ", page=" + page +
                ", pageSize=" + pageSize +
                ", date=" + date +
                ", sessionId='" + sessionId + '\'' +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

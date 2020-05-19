package com.lamdaer.polyv.live.bean.request.account;

import com.lamdaer.polyv.live.bean.request.PolyvLiveBaseRequest;

/**
 * 修改直播频道分类名称
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class ChangeChannelClassificationNameRequest extends PolyvLiveBaseRequest {

    /**
     * <pre>
     * 字段名：分类名称
     * 变量名：categoryName
     * 是否必填：是
     * </pre>
     */
    private String categoryName;

    /**
     * <pre>
     * 字段名：分类id
     * 变量名：categoryId
     * 是否必填：是
     * </pre>
     */
    private int categoryId;

    public ChangeChannelClassificationNameRequest(String appId, String appSecret, String categoryName, int categoryId) {
        super(appId, appSecret);
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "ChangeChannelClassificationNameRequest{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryId=" + categoryId +
                ", appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                ", timestamp=" + timestamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}

package com.lamdaer.polyv.live.service.account.impl;

import com.lamdaer.polyv.live.bean.request.account.ChangeChannelClassificationNameRequest;
import com.lamdaer.polyv.live.bean.result.PolyvLiveCommonResult;
import com.lamdaer.polyv.live.constant.ApiConstants;
import com.lamdaer.polyv.live.service.PolyvLiveRequestAbstractService;
import com.lamdaer.polyv.live.service.account.PolyvLiveAccountService;

/**
 * 账户 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class PolyvLiveAccountServiceImpl extends PolyvLiveRequestAbstractService implements PolyvLiveAccountService {
    @Override
    public PolyvLiveCommonResult changeChannelClassificationName(ChangeChannelClassificationNameRequest request) {
        String url = ApiConstants.CHANGE_CHANNEL_CLASSIFICATION_NAME;
        PolyvLiveCommonResult result = postRequest(url, request.getParams());
        return result;
    }
}

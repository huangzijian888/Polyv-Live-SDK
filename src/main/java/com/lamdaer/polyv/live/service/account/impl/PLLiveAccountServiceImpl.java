package com.lamdaer.polyv.live.service.account.impl;

import com.lamdaer.polyv.live.bean.request.account.ChangeChannelClassificationNameRequest;
import com.lamdaer.polyv.live.bean.result.PLLiveCommonResult;
import com.lamdaer.polyv.live.constant.ApiConstants;
import com.lamdaer.polyv.live.service.PLLiveRequestAbstractService;
import com.lamdaer.polyv.live.service.account.PLLiveAccountService;

/**
 * 账户 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class PLLiveAccountServiceImpl extends PLLiveRequestAbstractService implements PLLiveAccountService {
    @Override
    public PLLiveCommonResult changeChannelClassificationName(ChangeChannelClassificationNameRequest request) {
        String url = ApiConstants.CHANGE_CHANNEL_CLASSIFICATION_NAME;
        PLLiveCommonResult result = postRequest(url, request.getParams());
        return result;
    }
}

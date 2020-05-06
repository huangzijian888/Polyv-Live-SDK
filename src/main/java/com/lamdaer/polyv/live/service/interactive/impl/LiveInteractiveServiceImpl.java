package com.lamdaer.polyv.live.service.interactive.impl;

import com.lamdaer.polyv.live.bean.request.interactive.GetChannelLotteryRecordRequest;
import com.lamdaer.polyv.live.bean.result.PLLiveCommonResult;
import com.lamdaer.polyv.live.constant.ApiConstants;
import com.lamdaer.polyv.live.service.PLLiveRequestAbstractService;
import com.lamdaer.polyv.live.service.interactive.LiveInteractiveService;

/**
 * 直播互动 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/6
 */
public class LiveInteractiveServiceImpl extends PLLiveRequestAbstractService implements LiveInteractiveService {

    @Override
    public PLLiveCommonResult getLotteryRecord(GetChannelLotteryRecordRequest request) {
        PLLiveCommonResult result = getRequest(ApiConstants.GET_CHANNEL_LOTTERY_RECORD, request.getParams());
        return result;
    }
}

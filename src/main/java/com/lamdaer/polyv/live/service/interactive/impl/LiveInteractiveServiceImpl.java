package com.lamdaer.polyv.live.service.interactive.impl;

import com.lamdaer.polyv.live.bean.request.interactive.*;
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

    @Override
    public PLLiveCommonResult getWinnerDetail(GetWinnerDetailRequest request) {
        PLLiveCommonResult result = getRequest(ApiConstants.GET_WINNER_DETAIL, request.getParams());
        return result;
    }

    @Override
    public PLLiveCommonResult giveLike(GiveLikeRequest request) {
        PLLiveCommonResult result = postRequest(ApiConstants.GIVE_LIKE.replace("{channelId}", String.valueOf(request.getChannelId())), request.getParams());
        return result;
    }

    @Override
    public PLLiveCommonResult sendRewardMessage(SendRewardMessageRequest request) {
        PLLiveCommonResult result = postRequest(ApiConstants.SEND_REWARD_MESSAGE, request.getParams());
        return result;
    }

    @Override
    public PLLiveCommonResult getDetailsQuestionnaire(GetQuestionnaireDetailsRequest request) {
        PLLiveCommonResult result = getRequest(ApiConstants.GET_DETAILS_QUESTIONNAIRE, request.getParams());
        return result;
    }

    @Override
    public PLLiveCommonResult getChannelQuestionnaireList(GetChannelQuestionnaireListRequest request) {
        PLLiveCommonResult result = getRequest(ApiConstants.GET_CHANNEL_QUESTIONNAIRE_LIST, request.getParams());
        return result;
    }

}

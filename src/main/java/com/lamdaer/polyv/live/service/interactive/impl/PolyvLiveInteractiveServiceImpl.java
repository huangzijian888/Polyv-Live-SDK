package com.lamdaer.polyv.live.service.interactive.impl;

import com.lamdaer.polyv.live.bean.request.interactive.*;
import com.lamdaer.polyv.live.bean.result.PolyvLiveCommonResult;
import com.lamdaer.polyv.live.constant.ApiConstants;
import com.lamdaer.polyv.live.service.PolyvLiveRequestAbstractService;
import com.lamdaer.polyv.live.service.interactive.PolyvLiveInteractiveService;

/**
 * 直播互动 Service 实现类
 *
 * @author lamdaer
 * createTime 2020/5/6
 */
public class PolyvLiveInteractiveServiceImpl extends PolyvLiveRequestAbstractService implements PolyvLiveInteractiveService {
    @Override
    public PolyvLiveCommonResult getLotteryRecord(GetChannelLotteryRecordRequest request) {
        PolyvLiveCommonResult result = getRequest(ApiConstants.GET_CHANNEL_LOTTERY_RECORD, request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult getWinnerDetail(GetWinnerDetailRequest request) {
        PolyvLiveCommonResult result = getRequest(ApiConstants.GET_WINNER_DETAIL, request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult giveLike(GiveLikeRequest request) {
        PolyvLiveCommonResult result = postRequest(ApiConstants.GIVE_LIKE.replace("{channelId}", String.valueOf(request.getChannelId())), request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult sendRewardMessage(SendRewardMessageRequest request) {
        PolyvLiveCommonResult result = postRequest(ApiConstants.SEND_REWARD_MESSAGE, request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult getDetailsQuestionnaire(GetQuestionnaireDetailsRequest request) {
        PolyvLiveCommonResult result = getRequest(ApiConstants.GET_DETAILS_QUESTIONNAIRE, request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult getChannelQuestionnaireList(GetChannelQuestionnaireListRequest request) {
        PolyvLiveCommonResult result = getRequest(ApiConstants.GET_CHANNEL_QUESTIONNAIRE_LIST, request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult setLotteryWinners(SetLotteryWinnersRequest request) {
        PolyvLiveCommonResult result = postRequest(ApiConstants.SET_LOTTERY_WINNERS, request.getParams());
        return result;
    }

    @Override
    public PolyvLiveCommonResult setChannelQuestionnaire(SetChannelQuestionnaireRequest request) {
        return postRequest(ApiConstants.SET_CHANNEL_QUESTIONNAIRE
                .replace("{{channelId}}", String.valueOf(request.getChannelId()))
                .replace("{{appId}}", request.getAppId())
                .replace("{{timestamp}}", String.valueOf(request.getTimestamp()))
                .replace("{{sign}}", request.getSign()), request.getParams());
    }

    @Override
    public PolyvLiveCommonResult getCheckResultRequest(GetCheckResultRequest resultRequest) {
        return getRequest(ApiConstants.GET_CHECK_RESULT, resultRequest.getParams());
    }

    @Override
    public PolyvLiveCommonResult getCheckIns(GetCheckInsRequest getCheckInsRequest) {
        return getRequest(ApiConstants.GET_CHECK_IN, getCheckInsRequest.getParams());
    }

}

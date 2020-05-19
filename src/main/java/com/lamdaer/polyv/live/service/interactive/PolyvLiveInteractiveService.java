package com.lamdaer.polyv.live.service.interactive;

import com.lamdaer.polyv.live.bean.request.interactive.*;
import com.lamdaer.polyv.live.bean.result.PolyvLiveCommonResult;

/**
 * 直播互动 Service
 *
 * @author lamdaer
 * createTime 2020/5/6
 */
public interface PolyvLiveInteractiveService {

    /**
     * 获取频道抽奖记录列表
     *
     * @param request 请求
     * @return 查询结果
     */
    PolyvLiveCommonResult getLotteryRecord(GetChannelLotteryRecordRequest request);

    /**
     * 获取频道单场抽奖的中奖记录
     *
     * @param request
     * @return 查询结果
     */
    PolyvLiveCommonResult getWinnerDetail(GetWinnerDetailRequest request);

    /**
     * 发送点赞
     *
     * @param request
     * @return 响应结果
     */
    PolyvLiveCommonResult giveLike(GiveLikeRequest request);

    /**
     * 发送打赏消息
     *
     * @param request
     * @return 响应结果
     */
    PolyvLiveCommonResult sendRewardMessage(SendRewardMessageRequest request);

    /**
     * 查询频道问卷详情
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-questionnaire-detail/
     *
     * @param request
     * @return 查询结果
     */
    PolyvLiveCommonResult getDetailsQuestionnaire(GetQuestionnaireDetailsRequest request);

    /**
     * 查询频道问卷列表
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/list-questionaire/
     *
     * @param request
     * @return 查询结果
     */
    PolyvLiveCommonResult getChannelQuestionnaireList(GetChannelQuestionnaireListRequest request);

}

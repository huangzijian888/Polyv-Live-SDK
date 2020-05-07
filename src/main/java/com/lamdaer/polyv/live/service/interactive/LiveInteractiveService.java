package com.lamdaer.polyv.live.service.interactive;

import com.lamdaer.polyv.live.bean.request.interactive.GetChannelLotteryRecordRequest;
import com.lamdaer.polyv.live.bean.request.interactive.GetWinnerDetailRequest;
import com.lamdaer.polyv.live.bean.request.interactive.GiveLikeRequest;
import com.lamdaer.polyv.live.bean.result.PLLiveCommonResult;

/**
 * 直播互动 Service
 *
 * @author lamdaer
 * createTime 2020/5/6
 */
public interface LiveInteractiveService {

    /**
     * 获取频道抽奖记录列表
     *
     * @param request 请求
     * @return 查询结果
     */
    PLLiveCommonResult getLotteryRecord(GetChannelLotteryRecordRequest request);

    /**
     * 获取频道单场抽奖的中奖记录
     *
     * @param request
     * @return 查询结果
     */
    PLLiveCommonResult getWinnerDetail(GetWinnerDetailRequest request);

    /**
     * 发送点赞
     *
     * @param request
     * @return 响应结果
     */
    PLLiveCommonResult giveLike(GiveLikeRequest request);
}

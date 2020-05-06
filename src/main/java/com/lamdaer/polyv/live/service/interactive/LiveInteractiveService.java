package com.lamdaer.polyv.live.service.interactive;

import com.lamdaer.polyv.live.bean.request.interactive.GetChannelLotteryRecordRequest;
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
}

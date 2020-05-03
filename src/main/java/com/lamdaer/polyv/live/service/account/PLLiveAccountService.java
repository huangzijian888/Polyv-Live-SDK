package com.lamdaer.polyv.live.service.account;

import com.lamdaer.polyv.live.bean.request.account.ChangeChannelClassificationNameRequest;
import com.lamdaer.polyv.live.bean.result.PLLiveCommonResult;

/**
 * 账户 Service
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public interface PLLiveAccountService {

    /**
     * 修改直播频道分类名称
     *
     * @param request 修改直播频道分类名称请求类
     * @return
     */
    PLLiveCommonResult changeChannelClassificationName(ChangeChannelClassificationNameRequest request);
}

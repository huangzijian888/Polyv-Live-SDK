package com.lamdaer.polyv.live.service.account;

import com.lamdaer.polyv.live.bean.request.account.ChangeChannelClassificationNameRequest;
import com.lamdaer.polyv.live.bean.result.PolyvLiveCommonResult;

/**
 * 账户 Service
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public interface PolyvLiveAccountService {

    /**
     * 修改直播频道分类名称
     *
     * @param request 修改直播频道分类名称请求类
     * @return 响应结果
     */
    PolyvLiveCommonResult changeChannelClassificationName(ChangeChannelClassificationNameRequest request);
}

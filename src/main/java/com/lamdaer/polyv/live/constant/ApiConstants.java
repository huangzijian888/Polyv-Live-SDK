package com.lamdaer.polyv.live.constant;

/**
 * 接口地址
 *
 * @author lamdaer
 * createTime 2020/5/4
 */
public class ApiConstants {

    /**
     * 修改直播频道分类名称
     */
    public static final String CHANGE_CHANNEL_CLASSIFICATION_NAME = "http://api.polyv.net/live/v3/user/category/update-name";

    /**
     * 获取频道抽奖记录列表
     */
    public static final String GET_CHANNEL_LOTTERY_RECORD = "http://api.polyv.net/live/v3/channel/lottery/list-lottery";

    /**
     * 获取频道单场抽奖的中奖记录
     */
    public static final String GET_WINNER_DETAIL = "http://api.polyv.net/live/v3/channel/lottery/get-winner-detail";

    /**
     * 发送点赞
     */
    public static final String GIVE_LIKE = "http://api.polyv.net/live/v2/channels/{channelId}/like";

    /**
     * 发送打赏消息
     */
    public static final String SEND_REWARD_MESSAGE = "http://api.polyv.net/live/v3/channel/chat/send-reward-msg";

    /**
     * 查询频道问卷详情
     * 文档地址：http://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-questionnaire-detail/
     */
    public static final String GET_DETAILS_QUESTIONNAIRE = "https://api.polyv.net/live/v3/channel/questionnaire/detail";

    /**
     * 查询频道问卷列表
     * 文档地址：http://dev.polyv.net/2019/liveproduct/l-api/zbhd/list-questionaire/
     */
    public static final String GET_CHANNEL_QUESTIONNAIRE_LIST = "https://api.polyv.net/live/v3/channel/questionnaire/list";

    /**
     * 设置抽奖中奖者信息
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/tjzjxx/
     */
    public static final String SET_LOTTERY_WINNERS = "http://api.polyv.net/live/v3/channel/chat/add-receive-info";

    /**
     * 设置频道问卷信息
     * http://dev.polyv.net/2019/liveproduct/l-api/zbhd/add-edit-questionnaire/
     */
    public static final String SET_CHANNEL_QUESTIONNAIRE = "https://api.polyv.net/live/v3/channel/questionnaire/add-edit-questionnaire?channelId={{channelId}}&appId={{appId}}&timestamp={{timestamp}}&sign={{sign}}";

    /**
     * 查询签到结果
     * http://dev.polyv.net/2018/liveproduct/l-api/zbhd/checkin-list/
     */
    public static final String GET_CHECK_RESULT = "https://api.polyv.net/live/v3/channel/checkin/list";

    /**
     * 查询指定签到ID的签到记录
     * https://dev.polyv.net/2019/liveproduct/l-api/zbhd/get-checkin/
     */
    public static final String GET_CHECK_IN = "https://api.polyv.net/live/v3/channel/chat/get-checkins";

    private ApiConstants() {
    }
}

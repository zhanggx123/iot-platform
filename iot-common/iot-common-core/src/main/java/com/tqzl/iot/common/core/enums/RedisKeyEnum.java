package com.tqzl.iot.common.core.enums;

/**
 * @Author ZhangGuoXiang
 * @Date [2024/3/6 11:24]
 * @Version [1.0]
 * @see [相关类/方法]
 * @since [产品/模板版本号]
 */
public enum RedisKeyEnum {

    /**
     * 供应商信息
     */
    SUPPLIER_INFO("supplier:info:", "供应商信息"),
    /**
     * 注册手机号验证码
     */
    REGISTER_MOBILE_CODE("mobileCode:register:", "注册手机号验证码"),
    /**
     * 手机注册成功
     */
    NOTICE_MOBILE_CODE("mobileCode:notice:", "注册成功手机短信通知"),
    /**
     * 登陆手机号验证码
     */
    LOGIN_MOBILE_CODE("mobileCode:login:", "登陆手机号验证码"),
    /**
     * 注册邮箱验证码
     */
    REGISTER_EMAIL_CODE("emailCode:register:", "注册邮箱验证码"),
    /**
     * 修改手机号验证码
     */
    UPDATE_MOBILE_CODE("mobileCode:update:", "修改手机号验证码"),
    /**
     * 修改密码验证码
     */
    UPDATE_PASSWORD_CODE("passWordCode:update:", "修改密码验证码"),
    /**
     * 修改邮箱验证码
     */
    UPDATE_EMAIL_CODE("emailCode:update:", "修改邮箱验证码"),
    /**
     * 公有云手机号验证码
     */
    PUBLIC_CLOUD_MOBILE_CODE("mobileCode:publicCloud:", "公有云手机号验证码"),
    /**
     * 客户审批相关
     */
    CUSTOMER_APPROVAL("customer:approval:", "客户审批相关"),

    AUTHENTICATION_EMAIL("emailCode:authentication", "实名认证"),

    /**
     * 教育认证
     */
    EDUCATION_EMAIL("emailCode:education", "教育认证"),
    /**
     * 申请CPG
     */
    CPG_APPROVAL("mobileCode:applyCpg", "申请CPG"),
    /**
     * 手机号发送短信次数
     */
    SEND_EMS_COUNT("send:ems:count:", "手机号发送短信次数"),

    /**
     * 手机号验证码是否在规定范围内发送
     */
    HAS_SEND_EMS("send:ems:already:", "手机号验证码是否在规定范围内发送"),

    /**
     * 邮箱验证码是否在规定范围内发送
     */
    HAS_SEND_EMAIL("send:email:already:", "邮箱验证码是否在规定范围内发送"),

    IMAGE_VERIFY_CODE_REQUEST("image:verify:code:request:", "图片验证码请求码"),
    /**
     * 找回密码手机号验证码
     */
    FIND_PWD_MOBILE_CODE("mobileCode:findPwd:", "找回密码手机号验证码"),
    /**
     * 微信SDK配置
     */
    WX_SDK_CONFIG("wx:sdk:config", "微信SDK配置"),
    /**
     * 微信二维码uuid
     */
    WX_QRCODE_UUID_CODE("wx:qrcode:uuid:", "微信二维码uuid"),
    /**
     * 微信二维码ticket
     */
    WX_QRCODE_TICKET_CODE("wx:qrcode:ticket:", "微信二维码ticket"),

    /**
     * 余额预警
     */
    BALANCE_EARLY_WARNING_CODE("balance:early:warning:", "余额预警"),

    /**
     * 系统设置
     */
    SYSTEM_MANAGE("sysManage", "系统设置"),

    /**
     * 教育邮箱白名单
     */
    SYSTEM_MANAEGE_WHITE_EDUCATION_EMAIL("sys:whitelistEdu:", "教育邮箱白名单"),

    /**
     * 客服企微二维码
     */
    SYSTEM_MANAEGE_CUSTOMER_SERVICE_QR_CODE("sys:wx:qrcode:", "客服企微二维码"),

    /**
     * 教育认证发放体验券
     */
    SYSTEM_MANAEGE_COUPON_BY_EDU_AUTHENTICATION("sys:ec:edu:", "教育认证发放体验券"),

    /**
     * 实名认证发放体验券
     */
    SYSTEM_MANAEGE_COUPON_BY_REALNAME_AUTHENTICATION("sys:ec:name:", "实名认证发放体验券"),

    /**
     * 云多多会员折扣
     */
    SYSTEM_MANAEGE_VIP_DISCOUNTS("sys:vip:dis:", "云多多会员折扣"),

    /**
     * 云账号最低余额
     */
    SYSTEM_MANAEGE_CLOUD_ACCOUNT_BALANCE_MIN("sys:ca:minBal:", "云账号最低余额"),

    /**
     * 服务费率（只绑定云账号）
     */
    SYSTEM_MANAEGE_SERVICE_CONST_FOR_BINDING("sys:ffs:bind:", "服务费率（只绑定云账号）"),

    /**
     * 服务费率（通过云多多注册并绑定云账号）
     */
    SYSTEM_MANAEGE_SERVICE_CONST_FOR_REGISTER("sys:ffs:reg:", "服务费率（通过云多多注册并绑定云账号）"),

    /**
     * 云多多余额预警线
     */
    SYSTEM_MANAEGE_BALANCE_WARNING("sys:minBal:", "云多多余额预警线"),

    /**
     * 统计环境实例即将续期个数的时间基准（单位分钟）
     */
    SYSTEM_MANAEGE_ENV_WAITING_RENEW("sys:stcRenew:", "统计环境实例即将续期个数的时间基准（单位分钟）"),

    /**
     * 统计环境实例即将销毁个数的时间基准（单位分钟）
     */
    SYSTEM_MANAEGE_ENV_WAITING_DESTROY("sys:stcDestroy:", "统计环境实例即将销毁个数的时间基准（单位分钟）"),

    /**
     * 注册发放体验券
     */
    SYSTEM_MANAEGE_COUPON_BY_REGISTER("sys:ec:reg:", "注册发放体验券"),

    /**
     * 订单号生成
     */
    ORDER_ORDERNO_CREATE("order:no:", "订单号生成"),

    /**
     * 延时云环境实例销毁
     */
    ENV_DELAY_TASK("env:delay:destroy", "延时云环境实例销毁"),

    /**
     * 延时云环境实例销毁预警
     */
    ENV_DELAY_TASK_WARNING("env:delay:destroyW", "延时云环境实例销毁预警"),

    /**
     * 用户信息
     */
    JWT_TOKEN_USER_INFO("uc:user:token:", "用户信息"),

    /**
     * 体验卡使用件数
     */
    OP_COUPON_CARD_USE_COUNT("op:couponCard:useCount:", "体验卡使用件数"),

    /**
     * 体验卡生成
     */
    CARD_CODE_CREATE("card:code:", "体验卡生成"),
    ;


    RedisKeyEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}

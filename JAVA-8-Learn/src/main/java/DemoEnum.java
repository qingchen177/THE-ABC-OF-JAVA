package main.java;

import lombok.Getter;

/**
 * @author qingchen
 * @date 22/9/2022 上午 10:46
 */
@Getter
public enum DemoEnum {
    SMS("短信", 0),
    EMAIL("邮件", 1),
    DINGTALK("钉钉", 2),
    WECHAT("微信", 3);
    // 成员变量
    private final String name;
    private final Integer code;

    // 构造方法
    DemoEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

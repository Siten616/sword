package com.st.common.enums;

/**
 * @author shent
 */
public enum UserStatus implements BaseEnum {
    /**
     * 性别 gender
     */
    MAN("男", 0),
    WOMAN("女", 1),
    /**
     * 状态 status
     */
    FORBIDDEN("禁用", 0),
    NORMAL("正常", 1),
    /**
     * 用户类型 type
     */
    ADMIN("管理员", 0),
    COMMON("普通", 1);

    private Integer value;
    private String name;

    UserStatus(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getValue() {
        return value;
    }

    public static UserStatus fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        for (UserStatus type : UserStatus.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }
}

package com.xn.manage.Enum;


public enum ContentTypeEnum {
	TEXT("text/xml", 0),APPLICATION("application/json", 1);
    // 成员变量
    private String name;
    private int id;

    // 构造方法
    private ContentTypeEnum(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 普通方法
    public static String getName(int id) {
        for (ContentTypeEnum c : ContentTypeEnum.values()) {
            if (c.getId() == id) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }
}
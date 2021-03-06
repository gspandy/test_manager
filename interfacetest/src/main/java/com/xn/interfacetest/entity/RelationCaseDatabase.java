/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.interfacetest.entity;


import com.xn.common.base.BaseEntity;

/**
 * RelationCaseDatabase 实体类
 *
 * @author Carol
 * @date 2017-03-02
 */
public class RelationCaseDatabase extends BaseEntity {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键列
     * id
     */
    private Long id;

    /**
     *
     * caseId
     */
    private Long caseId;

    /**
     *
     * 数据库名称
     */
    private String databaseName;

    /**
     *
     * 操作类型（1-数据准备，2-数据清除）
     */
    private Integer operateType;

    /**
     *
     * sqlStr
     */
    private String sqlStr;

    /**
     *
     * 1-接口数据处理，2-用例数据处理
     */
    private Integer type;

    /**
     *
     * 接口id
     */
    private Long interfaceId;

    /**
     * 是否被删除0-否，1-是
     */
    private Integer isDelete;

    public RelationCaseDatabase(){
        // default constructor
    }

    public RelationCaseDatabase(Long id){
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCaseId() {
        return this.caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Integer getOperateType() {
        return this.operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getSqlStr() {
        return this.sqlStr;
    }

    public void setSqlStr(String sqlStr) {
        this.sqlStr = sqlStr;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getInterfaceId() {
        return this.interfaceId;
    }

    public void setInterfaceId(Long interfaceId) {
        this.interfaceId = interfaceId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}

/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.performance.api;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import com.xn.performance.mybatis.PageInfo;
import com.xn.performance.mybatis.PageResult;

import com.xn.performance.dto.PerformanceScriptDto;

/**
 * PerformanceScript Service
 * 
 * @author zhouxi
 * @date 2017-02-21
 */
public interface PerformanceScriptService {

    /**
     * 查询单个记录
     * 主键：id 
     * @param condition 主键/Map/查询对象
     * @return 
     */
    PerformanceScriptDto get(Object condition);

    /**
     * 统计数量
     * 
     * @param condition 查询条件对象
     * @return 统计数量
     */
    long count(PerformanceScriptDto condition);

    /**
     * 根据组合条件查询
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    List<PerformanceScriptDto> list(PerformanceScriptDto condition);
    /**
     * 根据组合条件查询
     *
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    PageResult<PerformanceScriptDto> listByPage(PerformanceScriptDto condition, PageInfo pageInfo) throws IllegalAccessException, IntrospectionException, InvocationTargetException;

    /**
     * 根据组合条件查询,不建议用该方法进行分页  
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    List<PerformanceScriptDto> list(Map<String, Object> condition);
    
    /**
     * 根据组合条件做分页查询,需要condition中包含分页对象page  
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    PageResult<PerformanceScriptDto> page(Map<String, Object> condition);
    

    /**
     * 保存
     * 
     * @param performanceScript 
     * @return 带主键的DTO
     */
    PerformanceScriptDto save(PerformanceScriptDto performanceScriptDto);

    /**
     * 批量保存
     * 
     * @param performanceScripts 
     * @return 带主键的DTO
     */
    int save(List<PerformanceScriptDto> performanceScriptDtos);

    /**
     * 更新
     * 
     * @param performanceScript 
     * @return 操作影响行数
     */
    int update(PerformanceScriptDto performanceScriptDto);
    
    /**
     * 根据主键删除
     * 不建议，建议使用delete(PerformanceScript performanceScript)
     * @param id 主键
     * @return 操作影响行数
     */
    int deleteByPK(Integer id);
    
    /**
     * 删除
     * 
     * @param id 主键
     * @return 操作影响行数
     */
    int delete(PerformanceScriptDto performanceScriptDto);
    
    /**
     * 根据主键删除
     * 不建议，建议使用delete(PerformanceScriptDto performanceScript)
     * @param id 主键
     * @return 操作影响行数
     */
    public int deleteBatchByPK(List<Integer> ids);
    
    
    /**
     * 批量删除
     * 
     * @param id 主键
     * @return 操作影响行数
     */
    int deleteBatch(List<PerformanceScriptDto> performanceScripts);
}

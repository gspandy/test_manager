/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.autotest.bean.properties.dubbo.service;

import com.xn.autotest.bean.properties.dubbo.dto.DubboServicePropertiesDto;
import com.xn.autotest.mybatis.PageResult;

import java.util.List;
import java.util.Map;


/**
 * DubboServiceProperties Service
 * 
 * @author xn056839
 * @date 2016-12-22
 */
public interface DubboServicePropertiesService {

    /**
     * 查询单个记录
     * 主键：id 
     * @param condition 主键/Map/查询对象
     * @return 
     */
    DubboServicePropertiesDto get(Object condition);

    /**
     * 统计数量
     * 
     * @param condition 查询条件对象
     * @return 统计数量
     */
    long count(DubboServicePropertiesDto condition);

    /**
     * 根据组合条件查询
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    List<DubboServicePropertiesDto> list(DubboServicePropertiesDto condition);

    /**
     * 根据组合条件查询,不建议用该方法进行分页  
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    List<DubboServicePropertiesDto> list(Map<String,Object> condition);
    
    /**
     * 根据组合条件做分页查询,需要condition中包含分页对象page  
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    PageResult<DubboServicePropertiesDto> page(Map<String,Object> condition);
    

    /**
     * 保存
     * 
     * @param dubboServiceProperties 
     * @return 带主键的DTO
     */
    DubboServicePropertiesDto save(DubboServicePropertiesDto dubboServicePropertiesDto);

    /**
     * 批量保存
     * 
     * @param dubboServicePropertiess 
     * @return 带主键的DTO
     */
    int save(List<DubboServicePropertiesDto> dubboServicePropertiesDtos);

    /**
     * 更新
     * 
     * @param dubboServiceProperties 
     * @return 操作影响行数
     */
    int update(DubboServicePropertiesDto dubboServicePropertiesDto);
    
    /**
     * 根据主键删除
     * 不建议，建议使用delete(DubboServiceProperties dubboServiceProperties)
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
    int delete(DubboServicePropertiesDto dubboServicePropertiesDto);
    
    /**
     * 根据主键删除
     * 不建议，建议使用delete(DubboServicePropertiesDto dubboServiceProperties)
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
    int deleteBatch(List<DubboServicePropertiesDto> dubboServicePropertiess);
}
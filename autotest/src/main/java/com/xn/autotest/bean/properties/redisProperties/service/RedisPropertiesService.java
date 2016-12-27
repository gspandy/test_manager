/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.autotest.bean.properties.redisProperties.service;

import com.xn.autotest.bean.properties.redisProperties.dto.RedisPropertiesDto;
import com.xn.autotest.mybatis.PageResult;

import java.util.List;
import java.util.Map;

/**
 * RedisProperties Service
 * 
 * @author xn056839
 * @date 2016-12-22
 */
public interface RedisPropertiesService {

    /**
     * 查询单个记录
     * 主键：id 
     * @param condition 主键/Map/查询对象
     * @return 
     */
    RedisPropertiesDto get(Object condition);

    /**
     * 统计数量
     * 
     * @param condition 查询条件对象
     * @return 统计数量
     */
    long count(RedisPropertiesDto condition);

    /**
     * 根据组合条件查询
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    List<RedisPropertiesDto> list(RedisPropertiesDto condition);
    /**
     * 根据组合条件查询
     *
     * @return 集合,如果不存在,返回Empty List
     */
    List<RedisPropertiesDto> list();
    /**
     * 根据组合条件查询,不建议用该方法进行分页  
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    List<RedisPropertiesDto> list(Map<String,Object> condition);
    
    /**
     * 根据组合条件做分页查询,需要condition中包含分页对象page  
     * 
     * @param condition 查询对象
     * @return 集合,如果不存在,返回Empty List
     */
    PageResult<RedisPropertiesDto> page(Map<String,Object> condition);
    

    /**
     * 保存
     * 
     * @param redisProperties 
     * @return 带主键的DTO
     */
    RedisPropertiesDto save(RedisPropertiesDto redisPropertiesDto);

    /**
     * 批量保存
     * 
     * @param redisPropertiess 
     * @return 带主键的DTO
     */
    int save(List<RedisPropertiesDto> redisPropertiesDtos);

    /**
     * 更新
     * 
     * @param redisProperties 
     * @return 操作影响行数
     */
    int update(RedisPropertiesDto redisPropertiesDto);
    
    /**
     * 根据主键删除
     * 不建议，建议使用delete(RedisProperties redisProperties)
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
    int delete(RedisPropertiesDto redisPropertiesDto);
    
    /**
     * 根据主键删除
     * 不建议，建议使用delete(RedisPropertiesDto redisProperties)
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
    int deleteBatch(List<RedisPropertiesDto> redisPropertiess);
}

/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.interfacetest.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xn.common.utils.BeanUtils;
import com.xn.common.utils.CollectionUtils;
import com.xn.common.utils.PageInfo;
import com.xn.common.utils.PageResult;
import com.xn.interfacetest.dao.TestSystemMapper;
import com.xn.interfacetest.dto.TestSystemDto;
import com.xn.interfacetest.entity.TestSystem;
import com.xn.interfacetest.service.TestSystemService;



/**
 * TestSystem Service实现
 * 
 * @author Carol
 * @date 2017-02-14
 */
@Service("testSystemService")
@Transactional
public class TestSystemServiceImpl implements TestSystemService {

    /**
     *  Dao
     */
    @Autowired
    private TestSystemMapper testSystemMapper;

    @Override
    @Transactional(readOnly = true)
    public TestSystemDto get(Object condition)
	{  
        TestSystem testSystem = testSystemMapper.get(condition);
        TestSystemDto testSystemDto = BeanUtils.toBean(testSystem,TestSystemDto.class);
	    return testSystemDto;  
	}  

    @Override
    @Transactional(readOnly = true)
    public long count(TestSystemDto condition) {
        return testSystemMapper.count(condition);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestSystemDto> list(TestSystemDto condition) {
        List<TestSystem> list = testSystemMapper.list(condition);
        List<TestSystemDto> dtoList = CollectionUtils.transform(list, TestSystemDto.class);
        return dtoList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestSystemDto> list(Map<String,Object> condition) {
        List<TestSystem> list = testSystemMapper.list(condition);
        List<TestSystemDto> dtoList = CollectionUtils.transform(list, TestSystemDto.class);
        return dtoList;
    }
    
    @Override
    @Transactional(readOnly = true)
    public PageResult<TestSystemDto> page(Map<String,Object> condition){
        return PageResult.wrap((PageInfo) condition.get("page"), list(condition));
    }

    @Override
    public TestSystemDto save(TestSystemDto testSystemDto) {
        TestSystem testSystem = BeanUtils.toBean(testSystemDto,TestSystem.class);
        testSystemMapper.save(testSystem);
        testSystemDto.setId(testSystem.getId());
        return testSystemDto;
    }

    @Override
    public int save(List<TestSystemDto> testSystemDtos) {
        if (testSystemDtos == null || testSystemDtos.isEmpty()) {
            return 0;
        }
        List<TestSystem> testSystems = CollectionUtils.transform(testSystemDtos, TestSystem.class);
        return testSystemMapper.saveBatch(testSystems);
    }

    @Override
    public int update(TestSystemDto testSystemDto) {
        TestSystem testSystem = BeanUtils.toBean(testSystemDto,TestSystem.class);
        return testSystemMapper.update(testSystem);
    }
    
    @Override
    public int deleteByPK(Long id) {
        return testSystemMapper.deleteByPK(id);
    }

    @Override
    public int delete(TestSystemDto testSystemDto) {
        TestSystem testSystem = BeanUtils.toBean(testSystemDto,TestSystem.class);
        return testSystemMapper.delete(testSystem);
    }
    
    @Override
    public int deleteBatchByPK(List<Long> ids) {
        return testSystemMapper.deleteBatchByPK(ids);
    }
    
    @Override
    public int deleteBatch(List<TestSystemDto> testSystems) {
        return 0;
    }

}
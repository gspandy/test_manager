/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.interfacetest.service.impl;

import com.xn.common.entity.BeanUtils;
import com.xn.common.utils.CollectionUtils;
import com.xn.common.utils.PageInfo;
import com.xn.common.utils.PageResult;
import com.xn.interfacetest.dao.TestCaseMapper;
import com.xn.interfacetest.dto.TestCaseDto;
import com.xn.interfacetest.entity.TestCase;
import com.xn.interfacetest.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * TestCase Service实现
 * 
 * @author Carol
 * @date 2017-02-14
 */
@Service
@Transactional
public class TestCaseServiceImpl implements TestCaseService {

    /**
     *  Dao
     */
    @Autowired
    private TestCaseMapper testCaseMapper;

    @Override
    @Transactional(readOnly = true)
    public TestCaseDto get(Object condition)
	{  
        TestCase testCase = testCaseMapper.get(condition);
        TestCaseDto testCaseDto = BeanUtils.toBean(testCase,TestCaseDto.class);
	    return testCaseDto;  
	}  

    @Override
    @Transactional(readOnly = true)
    public long count(TestCaseDto condition) {
        return testCaseMapper.count(condition);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestCaseDto> list(TestCaseDto condition) {
        List<TestCase> list = testCaseMapper.list(condition);
        List<TestCaseDto> dtoList = CollectionUtils.transform(list, TestCaseDto.class);
        return dtoList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestCaseDto> list(Map<String,Object> condition) {
        List<TestCase> list = testCaseMapper.list(condition);
        List<TestCaseDto> dtoList = CollectionUtils.transform(list, TestCaseDto.class);
        return dtoList;
    }
    
    @Override
    @Transactional(readOnly = true)
    public PageResult<TestCaseDto> page(Map<String,Object> condition){
        return PageResult.wrap((PageInfo) condition.get("page"), list(condition));
    }

    @Override
    public TestCaseDto save(TestCaseDto testCaseDto) {
        TestCase testCase = BeanUtils.toBean(testCaseDto,TestCase.class);
        testCaseMapper.save(testCase);
        testCaseDto.setId(testCase.getId());
        return testCaseDto;
    }

    @Override
    public int save(List<TestCaseDto> testCaseDtos) {
        if (testCaseDtos == null || testCaseDtos.isEmpty()) {
            return 0;
        }
        List<TestCase> testCases = CollectionUtils.transform(testCaseDtos, TestCase.class);
        return testCaseMapper.saveBatch(testCases);
    }

    @Override
    public int update(TestCaseDto testCaseDto) {
        TestCase testCase = BeanUtils.toBean(testCaseDto,TestCase.class);
        return testCaseMapper.update(testCase);
    }
    
    @Override
    public int deleteByPK(Long id) {
        return testCaseMapper.deleteByPK(id);
    }

    @Override
    public int delete(TestCaseDto testCaseDto) {
        TestCase testCase = BeanUtils.toBean(testCaseDto,TestCase.class);
        return testCaseMapper.delete(testCase);
    }
    
    @Override
    public int deleteBatchByPK(List<Long> ids) {
        return testCaseMapper.deleteBatchByPK(ids);
    }
    
    @Override
    public int deleteBatch(List<TestCaseDto> testCases) {
        return 0;
    }

}
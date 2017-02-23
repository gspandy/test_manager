/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.interfacetest.service.impl;

import com.xn.common.entity.BeanUtils;
import com.xn.common.utils.CollectionUtils;
import com.xn.common.utils.PageInfo;
import com.xn.common.utils.PageResult;
import com.xn.interfacetest.dao.TestParamsMapper;
import com.xn.interfacetest.dto.TestParamsDto;
import com.xn.interfacetest.entity.TestParams;
import com.xn.interfacetest.service.TestParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * TestParams Service实现
 * 
 * @author Carol
 * @date 2017-02-14
 */
@Service
@Transactional
public class TestParamsServiceImpl implements TestParamsService {

    /**
     *  Dao
     */
    @Autowired
    private TestParamsMapper testParamsMapper;

    @Override
    @Transactional(readOnly = true)
    public TestParamsDto get(Object condition)
	{  
        TestParams testParams = testParamsMapper.get(condition);
        TestParamsDto testParamsDto = BeanUtils.toBean(testParams,TestParamsDto.class);
	    return testParamsDto;  
	}  

    @Override
    @Transactional(readOnly = true)
    public long count(TestParamsDto condition) {
        return testParamsMapper.count(condition);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestParamsDto> list(TestParamsDto condition) {
        List<TestParams> list = testParamsMapper.list(condition);
        List<TestParamsDto> dtoList = CollectionUtils.transform(list, TestParamsDto.class);
        return dtoList;
    }

    @Override
    @Transactional(readOnly = true)
    public List<TestParamsDto> list(Map<String,Object> condition) {
        List<TestParams> list = testParamsMapper.list(condition);
        List<TestParamsDto> dtoList = CollectionUtils.transform(list, TestParamsDto.class);
        return dtoList;
    }
    
    @Override
    @Transactional(readOnly = true)
    public PageResult<TestParamsDto> page(Map<String,Object> condition){
        return PageResult.wrap((PageInfo) condition.get("page"), list(condition));
    }

    @Override
    public TestParamsDto save(TestParamsDto testParamsDto) {
        TestParams testParams = BeanUtils.toBean(testParamsDto,TestParams.class);
        testParamsMapper.save(testParams);
        testParamsDto.setId(testParams.getId());
        return testParamsDto;
    }

    @Override
    public int save(List<TestParamsDto> testParamsDtos) {
        if (testParamsDtos == null || testParamsDtos.isEmpty()) {
            return 0;
        }
        List<TestParams> testParamss = CollectionUtils.transform(testParamsDtos, TestParams.class);
        return testParamsMapper.saveBatch(testParamss);
    }

    @Override
    public int update(TestParamsDto testParamsDto) {
        TestParams testParams = BeanUtils.toBean(testParamsDto,TestParams.class);
        return testParamsMapper.update(testParams);
    }
    
    @Override
    public int deleteByPK(Long id) {
        return testParamsMapper.deleteByPK(id);
    }

    @Override
    public int delete(TestParamsDto testParamsDto) {
        TestParams testParams = BeanUtils.toBean(testParamsDto,TestParams.class);
        return testParamsMapper.delete(testParams);
    }
    
    @Override
    public int deleteBatchByPK(List<Long> ids) {
        return testParamsMapper.deleteBatchByPK(ids);
    }
    
    @Override
    public int deleteBatch(List<TestParamsDto> testParamss) {
        return 0;
    }

}
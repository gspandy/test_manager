/*
 * Copyright (c) 2014-2015, Yunnex and/or its affiliates. All rights reserved. Use, Copy is subject to authorized license.
 */
package com.xn.performance.dao;


import com.xn.performance.entity.PerformancePlan;
import com.xn.performance.entity.PerformancePlanShow;
import com.xn.performance.mybatis.BaseMapper;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * PerformancePlan Dao 接口
 * 
 * @author zhouxi
 * @date 2017-02-21
 */
@Service
public interface PerformancePlanMapper extends BaseMapper<PerformancePlan, Integer> {
    List<PerformancePlanShow> show(Object condition);


}

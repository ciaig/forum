package com.yc.service.impl;

import com.yc.dao.FatherCategoryMapper;
import com.yc.domain.FatherCategory;
import com.yc.domain.FatherCategoryExample;
import com.yc.service.FatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FatherServiceImpl implements FatherService {
    @Autowired
    private FatherCategoryMapper fatherCategoryMapper;

    @Override
    public List<FatherCategory> getAll() {
        FatherCategoryExample example = new FatherCategoryExample();
        example.createCriteria().andFIdGreaterThan(0);
        List<FatherCategory> categoryList = fatherCategoryMapper.selectByExample(example);
        return categoryList;
    }
}

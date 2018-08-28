package com.yc.service.impl;

import com.yc.dao.ChildCategoryMapper;
import com.yc.domain.ChildCategory;
import com.yc.domain.ChildCategoryExample;
import com.yc.service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildServiceImpl implements ChildService {
    @Autowired
    private ChildCategoryMapper childCategoryMapper;

    @Override
    public List<ChildCategory> getAll() {
        ChildCategoryExample example = new ChildCategoryExample();
        example.createCriteria().andCIdGreaterThan(0);
        List<ChildCategory> categoryList = childCategoryMapper.selectByExample(example);
        return categoryList;
    }

    @Override
    public List<ChildCategory> getByfId(Integer getfId) {
        ChildCategoryExample example = new ChildCategoryExample();
        example.createCriteria().andFIdEqualTo(getfId);
        List<ChildCategory> categoryList = childCategoryMapper.selectByExample(example);
        return categoryList;
    }
    @Override
    public List<ChildCategory> getAllChild() {
        ChildCategoryExample childCategoryExample = new ChildCategoryExample();
        childCategoryExample.createCriteria().andCIdGreaterThan(0);
        List<ChildCategory> categoryList = childCategoryMapper.selectByExample(childCategoryExample);
        return categoryList;
    }
}

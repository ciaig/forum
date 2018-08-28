package com.yc.dao;

import com.yc.domain.ChildCategory;
import com.yc.domain.ChildCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChildCategoryMapper {
    long countByExample(ChildCategoryExample example);

    int deleteByExample(ChildCategoryExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(ChildCategory record);

    int insertSelective(ChildCategory record);

    List<ChildCategory> selectByExample(ChildCategoryExample example);

    ChildCategory selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") ChildCategory record, @Param("example") ChildCategoryExample example);

    int updateByExample(@Param("record") ChildCategory record, @Param("example") ChildCategoryExample example);

    int updateByPrimaryKeySelective(ChildCategory record);

    int updateByPrimaryKey(ChildCategory record);
}
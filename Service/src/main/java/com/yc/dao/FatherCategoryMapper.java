package com.yc.dao;

import com.yc.domain.FatherCategory;
import com.yc.domain.FatherCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FatherCategoryMapper {
    long countByExample(FatherCategoryExample example);

    int deleteByExample(FatherCategoryExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(FatherCategory record);

    int insertSelective(FatherCategory record);

    List<FatherCategory> selectByExample(FatherCategoryExample example);

    FatherCategory selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") FatherCategory record, @Param("example") FatherCategoryExample example);

    int updateByExample(@Param("record") FatherCategory record, @Param("example") FatherCategoryExample example);

    int updateByPrimaryKeySelective(FatherCategory record);

    int updateByPrimaryKey(FatherCategory record);
}
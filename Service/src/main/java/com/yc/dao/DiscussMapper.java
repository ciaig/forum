package com.yc.dao;

import com.yc.domain.Discuss;
import com.yc.domain.DiscussExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussMapper {
    long countByExample(DiscussExample example);

    int deleteByExample(DiscussExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(Discuss record);

    int insertSelective(Discuss record);

    List<Discuss> selectByExample(DiscussExample example);

    Discuss selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") Discuss record, @Param("example") DiscussExample example);

    int updateByExample(@Param("record") Discuss record, @Param("example") DiscussExample example);

    int updateByPrimaryKeySelective(Discuss record);

    int updateByPrimaryKey(Discuss record);
}
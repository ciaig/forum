package com.yc.dao;

import com.yc.domain.Follow;
import com.yc.domain.FollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowMapper {
    long countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExample(FollowExample example);

    Follow selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}
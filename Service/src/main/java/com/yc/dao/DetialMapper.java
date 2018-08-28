package com.yc.dao;

import com.yc.domain.Detial;
import com.yc.domain.DetialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetialMapper {
    long countByExample(DetialExample example);

    int deleteByExample(DetialExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Detial record);

    int insertSelective(Detial record);

    List<Detial> selectByExample(DetialExample example);

    Detial selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Detial record, @Param("example") DetialExample example);

    int updateByExample(@Param("record") Detial record, @Param("example") DetialExample example);

    int updateByPrimaryKeySelective(Detial record);

    int updateByPrimaryKey(Detial record);
}
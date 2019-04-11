package com.hzh.mapper;

import com.hzh.pojo.Tb;
import com.hzh.pojo.TbExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbMapper {
    int countByExample(TbExample example);

    int deleteByExample(TbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb record);

    int insertSelective(Tb record);

    List<Tb> selectByExample(TbExample example);

    Tb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb record, @Param("example") TbExample example);

    int updateByExample(@Param("record") Tb record, @Param("example") TbExample example);

    int updateByPrimaryKeySelective(Tb record);

    int updateByPrimaryKey(Tb record);
}
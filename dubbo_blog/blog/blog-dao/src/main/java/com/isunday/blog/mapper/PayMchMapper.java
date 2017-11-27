package com.isunday.blog.mapper;

import com.isunday.blog.model.PayMch;
import com.isunday.blog.model.PayMchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayMchMapper {
    int countByExample(PayMchExample example);

    int deleteByExample(PayMchExample example);

    int deleteByPrimaryKey(Integer payMchId);

    int insert(PayMch record);

    int insertSelective(PayMch record);

    List<PayMch> selectByExample(PayMchExample example);

    PayMch selectByPrimaryKey(Integer payMchId);

    int updateByExampleSelective(@Param("record") PayMch record, @Param("example") PayMchExample example);

    int updateByExample(@Param("record") PayMch record, @Param("example") PayMchExample example);

    int updateByPrimaryKeySelective(PayMch record);

    int updateByPrimaryKey(PayMch record);
}
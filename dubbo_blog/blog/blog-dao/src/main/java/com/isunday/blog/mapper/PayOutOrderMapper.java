package com.isunday.blog.mapper;

import com.isunday.blog.model.PayOutOrder;
import com.isunday.blog.model.PayOutOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayOutOrderMapper {
    int countByExample(PayOutOrderExample example);

    int deleteByExample(PayOutOrderExample example);

    int deleteByPrimaryKey(Integer payOutOrderId);

    int insert(PayOutOrder record);

    int insertSelective(PayOutOrder record);

    List<PayOutOrder> selectByExample(PayOutOrderExample example);

    PayOutOrder selectByPrimaryKey(Integer payOutOrderId);

    int updateByExampleSelective(@Param("record") PayOutOrder record, @Param("example") PayOutOrderExample example);

    int updateByExample(@Param("record") PayOutOrder record, @Param("example") PayOutOrderExample example);

    int updateByPrimaryKeySelective(PayOutOrder record);

    int updateByPrimaryKey(PayOutOrder record);
}
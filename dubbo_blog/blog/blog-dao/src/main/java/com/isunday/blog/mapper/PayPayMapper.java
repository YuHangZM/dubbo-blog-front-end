package com.isunday.blog.mapper;

import com.isunday.blog.model.PayPay;
import com.isunday.blog.model.PayPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayPayMapper {
    int countByExample(PayPayExample example);

    int deleteByExample(PayPayExample example);

    int deleteByPrimaryKey(Integer payPayId);

    int insert(PayPay record);

    int insertSelective(PayPay record);

    List<PayPay> selectByExample(PayPayExample example);

    PayPay selectByPrimaryKey(Integer payPayId);

    int updateByExampleSelective(@Param("record") PayPay record, @Param("example") PayPayExample example);

    int updateByExample(@Param("record") PayPay record, @Param("example") PayPayExample example);

    int updateByPrimaryKeySelective(PayPay record);

    int updateByPrimaryKey(PayPay record);
}
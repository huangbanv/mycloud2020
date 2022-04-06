package com.zhangjun.springcloud.dao;

import com.zhangjun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

/**
 * @author 张钧
 * @Description
 * @create 2022-04-06 15:08
 */
@Mapper
public interface PaymentDao {
    /**
     * 创建
     * @param payment
     * @return
     */
    @Insert({"INSERT INTO payment(SERIAL) VALUES(#{serial})"})
    @Options(useGeneratedKeys = true)
    public int create(Payment payment);

    /**
     * 传入id查询订单
     * @param id
     * @return
     */
    @Select("SELECT * FROM payment WHERE id=#{id}")
    @Results(
            id = "paymentMap",
            value = {
                    @Result(column = "id",property = "id",jdbcType = JdbcType.BIGINT),
                    @Result(column = "serial",property = "serial",jdbcType = JdbcType.VARCHAR)
            }
    )
    public Payment getPaymentById(@Param("id") Long id);
}

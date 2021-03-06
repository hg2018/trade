package com.hbc.data.trade.transfer.mapping.pay.gen;

import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayQueue;
import com.hbc.data.trade.transfer.mapping.pay.gen.bean.PayQueueCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

public interface PayQueueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayQueueSqlProvider.class, method="countByExample")
    int countByExample(PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=PayQueueSqlProvider.class, method="deleteByExample")
    int deleteByExample(PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `pay_queue`",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `pay_queue` (ID, queue_name, ",
        "status, attempts, fireon, ",
        "payload)",
        "values (#{id,jdbcType=BIGINT}, #{queueName,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=CHAR}, #{attempts,jdbcType=INTEGER}, #{fireon,jdbcType=BIGINT}, ",
        "#{payload,jdbcType=LONGVARCHAR})"
    })
    int insert(PayQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @InsertProvider(type=PayQueueSqlProvider.class, method="insertSelective")
    int insertSelective(PayQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayQueueSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="queue_name", property="queueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="attempts", property="attempts", jdbcType=JdbcType.INTEGER),
        @Result(column="fireon", property="fireon", jdbcType=JdbcType.BIGINT),
        @Result(column="payload", property="payload", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PayQueue> selectByExampleWithBLOBsWithRowbounds(PayQueueCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayQueueSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="queue_name", property="queueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="attempts", property="attempts", jdbcType=JdbcType.INTEGER),
        @Result(column="fireon", property="fireon", jdbcType=JdbcType.BIGINT),
        @Result(column="payload", property="payload", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PayQueue> selectByExampleWithBLOBs(PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayQueueSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="queue_name", property="queueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="attempts", property="attempts", jdbcType=JdbcType.INTEGER),
        @Result(column="fireon", property="fireon", jdbcType=JdbcType.BIGINT)
    })
    List<PayQueue> selectByExampleWithRowbounds(PayQueueCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @SelectProvider(type=PayQueueSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="queue_name", property="queueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="attempts", property="attempts", jdbcType=JdbcType.INTEGER),
        @Result(column="fireon", property="fireon", jdbcType=JdbcType.BIGINT)
    })
    List<PayQueue> selectByExample(PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, queue_name, status, attempts, fireon, payload",
        "from `pay_queue`",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="queue_name", property="queueName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR),
        @Result(column="attempts", property="attempts", jdbcType=JdbcType.INTEGER),
        @Result(column="fireon", property="fireon", jdbcType=JdbcType.BIGINT),
        @Result(column="payload", property="payload", jdbcType=JdbcType.LONGVARCHAR)
    })
    PayQueue selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayQueueSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PayQueue record, @Param("example") PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayQueueSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") PayQueue record, @Param("example") PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayQueueSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PayQueue record, @Param("example") PayQueueCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=PayQueueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PayQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @Update({
        "update `pay_queue`",
        "set queue_name = #{queueName,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "attempts = #{attempts,jdbcType=INTEGER},",
          "fireon = #{fireon,jdbcType=BIGINT},",
          "payload = #{payload,jdbcType=LONGVARCHAR}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(PayQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `pay_queue`
     *
     * @mbggenerated
     */
    @Update({
        "update `pay_queue`",
        "set queue_name = #{queueName,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=CHAR},",
          "attempts = #{attempts,jdbcType=INTEGER},",
          "fireon = #{fireon,jdbcType=BIGINT}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(PayQueue record);
}
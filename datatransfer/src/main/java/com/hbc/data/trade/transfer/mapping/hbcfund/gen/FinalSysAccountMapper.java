package com.hbc.data.trade.transfer.mapping.hbcfund.gen;

import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccount;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountCriteria;
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

public interface FinalSysAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalSysAccountSqlProvider.class, method="countByExample")
    int countByExample(FinalSysAccountCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalSysAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalSysAccountCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `sysaccount`",
        "where sysAccountId = #{sysaccountid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer sysaccountid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `sysaccount` (sysAccountId, income, ",
        "expend, updated_at, ",
        "created_at)",
        "values (#{sysaccountid,jdbcType=INTEGER}, #{income,jdbcType=INTEGER}, ",
        "#{expend,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalSysAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalSysAccountSqlProvider.class, method="insertSelective")
    int insertSelective(FinalSysAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalSysAccountSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sysAccountId", property="sysaccountid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="income", property="income", jdbcType=JdbcType.INTEGER),
        @Result(column="expend", property="expend", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalSysAccount> selectByExampleWithRowbounds(FinalSysAccountCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalSysAccountSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sysAccountId", property="sysaccountid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="income", property="income", jdbcType=JdbcType.INTEGER),
        @Result(column="expend", property="expend", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalSysAccount> selectByExample(FinalSysAccountCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "sysAccountId, income, expend, updated_at, created_at",
        "from `sysaccount`",
        "where sysAccountId = #{sysaccountid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="sysAccountId", property="sysaccountid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="income", property="income", jdbcType=JdbcType.INTEGER),
        @Result(column="expend", property="expend", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalSysAccount selectByPrimaryKey(Integer sysaccountid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalSysAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalSysAccount record, @Param("example") FinalSysAccountCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalSysAccountSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalSysAccount record, @Param("example") FinalSysAccountCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalSysAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalSysAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    @Update({
        "update `sysaccount`",
        "set income = #{income,jdbcType=INTEGER},",
          "expend = #{expend,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where sysAccountId = #{sysaccountid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FinalSysAccount record);
}
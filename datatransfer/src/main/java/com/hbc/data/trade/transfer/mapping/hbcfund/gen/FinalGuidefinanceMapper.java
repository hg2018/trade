package com.hbc.data.trade.transfer.mapping.hbcfund.gen;

import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalGuidefinance;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalGuidefinanceCriteria;
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

public interface FinalGuidefinanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalGuidefinanceSqlProvider.class, method="countByExample")
    int countByExample(FinalGuidefinanceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=FinalGuidefinanceSqlProvider.class, method="deleteByExample")
    int deleteByExample(FinalGuidefinanceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `guidefinance`",
        "where guideFinanceId = #{guidefinanceid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer guidefinanceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `guidefinance` (guideFinanceId, guideId, ",
        "name, account, bank, ",
        "city, cityName, ",
        "currency, swift, ",
        "isValidated, type, ",
        "status, updated_at, ",
        "deleted_at, created_at)",
        "values (#{guidefinanceid,jdbcType=INTEGER}, #{guideid,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{account,jdbcType=VARCHAR}, #{bank,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=INTEGER}, #{cityname,jdbcType=VARCHAR}, ",
        "#{currency,jdbcType=VARCHAR}, #{swift,jdbcType=VARCHAR}, ",
        "#{isvalidated,jdbcType=TINYINT}, #{type,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{updatedAt,jdbcType=TIMESTAMP}, ",
        "#{deletedAt,jdbcType=TIMESTAMP}, #{createdAt,jdbcType=TIMESTAMP})"
    })
    int insert(FinalGuidefinance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @InsertProvider(type=FinalGuidefinanceSqlProvider.class, method="insertSelective")
    int insertSelective(FinalGuidefinance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalGuidefinanceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="guideFinanceId", property="guidefinanceid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank", property="bank", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency", property="currency", jdbcType=JdbcType.VARCHAR),
        @Result(column="swift", property="swift", jdbcType=JdbcType.VARCHAR),
        @Result(column="isValidated", property="isvalidated", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalGuidefinance> selectByExampleWithRowbounds(FinalGuidefinanceCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @SelectProvider(type=FinalGuidefinanceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="guideFinanceId", property="guidefinanceid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank", property="bank", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency", property="currency", jdbcType=JdbcType.VARCHAR),
        @Result(column="swift", property="swift", jdbcType=JdbcType.VARCHAR),
        @Result(column="isValidated", property="isvalidated", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FinalGuidefinance> selectByExample(FinalGuidefinanceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "guideFinanceId, guideId, name, account, bank, city, cityName, currency, swift, ",
        "isValidated, type, status, updated_at, deleted_at, created_at",
        "from `guidefinance`",
        "where guideFinanceId = #{guidefinanceid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="guideFinanceId", property="guidefinanceid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="guideId", property="guideid", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="account", property="account", jdbcType=JdbcType.VARCHAR),
        @Result(column="bank", property="bank", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="cityName", property="cityname", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency", property="currency", jdbcType=JdbcType.VARCHAR),
        @Result(column="swift", property="swift", jdbcType=JdbcType.VARCHAR),
        @Result(column="isValidated", property="isvalidated", jdbcType=JdbcType.TINYINT),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="deleted_at", property="deletedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP)
    })
    FinalGuidefinance selectByPrimaryKey(Integer guidefinanceid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalGuidefinanceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FinalGuidefinance record, @Param("example") FinalGuidefinanceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalGuidefinanceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FinalGuidefinance record, @Param("example") FinalGuidefinanceCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=FinalGuidefinanceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FinalGuidefinance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `guidefinance`
     *
     * @mbggenerated
     */
    @Update({
        "update `guidefinance`",
        "set guideId = #{guideid,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "account = #{account,jdbcType=VARCHAR},",
          "bank = #{bank,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=INTEGER},",
          "cityName = #{cityname,jdbcType=VARCHAR},",
          "currency = #{currency,jdbcType=VARCHAR},",
          "swift = #{swift,jdbcType=VARCHAR},",
          "isValidated = #{isvalidated,jdbcType=TINYINT},",
          "type = #{type,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
          "deleted_at = #{deletedAt,jdbcType=TIMESTAMP},",
          "created_at = #{createdAt,jdbcType=TIMESTAMP}",
        "where guideFinanceId = #{guidefinanceid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FinalGuidefinance record);
}
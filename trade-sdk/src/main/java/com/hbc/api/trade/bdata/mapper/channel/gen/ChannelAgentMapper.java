package com.hbc.api.trade.bdata.mapper.channel.gen;

import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgent;
import com.hbc.api.trade.bdata.mapper.channel.gen.bean.ChannelAgentExample;
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
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ChannelAgentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @SelectProvider(type=ChannelAgentSqlProvider.class, method="countByExample")
    int countByExample(ChannelAgentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=ChannelAgentSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChannelAgentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `channel_agent`",
        "where agent_id = #{agentId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String agentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `channel_agent` (agent_id, agent_name, ",
        "agent_admin_id, agent_admin_name, ",
        "province_id, province_name, ",
        "city_id, city_name, ",
        "fund_account_id, industry_type, ",
        "phone, comment, ",
        "status, is_config, ",
        "update_time, create_time, ",
        "fund_remain, member_num, ",
        "support_receive, support_send, ",
        "support_perday, support_pertime, ",
        "channel_service_type)",
        "values (#{agentId,jdbcType=VARCHAR}, #{agentName,jdbcType=VARCHAR}, ",
        "#{agentAdminId,jdbcType=VARCHAR}, #{agentAdminName,jdbcType=VARCHAR}, ",
        "#{provinceId,jdbcType=INTEGER}, #{provinceName,jdbcType=VARCHAR}, ",
        "#{cityId,jdbcType=INTEGER}, #{cityName,jdbcType=VARCHAR}, ",
        "#{fundAccountId,jdbcType=VARCHAR}, #{industryType,jdbcType=TINYINT}, ",
        "#{phone,jdbcType=VARCHAR}, #{comment,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{isConfig,jdbcType=TINYINT}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{fundRemain,jdbcType=INTEGER}, #{memberNum,jdbcType=INTEGER}, ",
        "#{supportReceive,jdbcType=TINYINT}, #{supportSend,jdbcType=TINYINT}, ",
        "#{supportPerday,jdbcType=TINYINT}, #{supportPertime,jdbcType=TINYINT}, ",
        "#{channelServiceType,jdbcType=TINYINT})"
    })
    int insert(ChannelAgent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @InsertProvider(type=ChannelAgentSqlProvider.class, method="insertSelective")
    int insertSelective(ChannelAgent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @SelectProvider(type=ChannelAgentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_admin_id", property="agentAdminId", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_admin_name", property="agentAdminName", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="province_name", property="provinceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fund_account_id", property="fundAccountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="industry_type", property="industryType", jdbcType=JdbcType.TINYINT),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="is_config", property="isConfig", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="fund_remain", property="fundRemain", jdbcType=JdbcType.INTEGER),
        @Result(column="member_num", property="memberNum", jdbcType=JdbcType.INTEGER),
        @Result(column="support_receive", property="supportReceive", jdbcType=JdbcType.TINYINT),
        @Result(column="support_send", property="supportSend", jdbcType=JdbcType.TINYINT),
        @Result(column="support_perday", property="supportPerday", jdbcType=JdbcType.TINYINT),
        @Result(column="support_pertime", property="supportPertime", jdbcType=JdbcType.TINYINT),
        @Result(column="channel_service_type", property="channelServiceType", jdbcType=JdbcType.TINYINT)
    })
    List<ChannelAgent> selectByExample(ChannelAgentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "agent_id, agent_name, agent_admin_id, agent_admin_name, province_id, province_name, ",
        "city_id, city_name, fund_account_id, industry_type, phone, comment, status, ",
        "is_config, update_time, create_time, fund_remain, member_num, support_receive, ",
        "support_send, support_perday, support_pertime, channel_service_type",
        "from `channel_agent`",
        "where agent_id = #{agentId,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="agent_id", property="agentId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="agent_name", property="agentName", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_admin_id", property="agentAdminId", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_admin_name", property="agentAdminName", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_id", property="provinceId", jdbcType=JdbcType.INTEGER),
        @Result(column="province_name", property="provinceName", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="city_name", property="cityName", jdbcType=JdbcType.VARCHAR),
        @Result(column="fund_account_id", property="fundAccountId", jdbcType=JdbcType.VARCHAR),
        @Result(column="industry_type", property="industryType", jdbcType=JdbcType.TINYINT),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="comment", property="comment", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="is_config", property="isConfig", jdbcType=JdbcType.TINYINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="fund_remain", property="fundRemain", jdbcType=JdbcType.INTEGER),
        @Result(column="member_num", property="memberNum", jdbcType=JdbcType.INTEGER),
        @Result(column="support_receive", property="supportReceive", jdbcType=JdbcType.TINYINT),
        @Result(column="support_send", property="supportSend", jdbcType=JdbcType.TINYINT),
        @Result(column="support_perday", property="supportPerday", jdbcType=JdbcType.TINYINT),
        @Result(column="support_pertime", property="supportPertime", jdbcType=JdbcType.TINYINT),
        @Result(column="channel_service_type", property="channelServiceType", jdbcType=JdbcType.TINYINT)
    })
    ChannelAgent selectByPrimaryKey(String agentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=ChannelAgentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ChannelAgent record, @Param("example") ChannelAgentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `channel_agent`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=ChannelAgentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ChannelAgent record);
}
package com.hbc.api.trade.order.mapping.gen;

import com.hbc.api.trade.order.mapping.gen.bean.TradeNotice;
import com.hbc.api.trade.order.mapping.gen.bean.TradeNoticeExample.Criteria;
import com.hbc.api.trade.order.mapping.gen.bean.TradeNoticeExample.Criterion;
import com.hbc.api.trade.order.mapping.gen.bean.TradeNoticeExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TradeNoticeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String countByExample(TradeNoticeExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`trade_notice`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String deleteByExample(TradeNoticeExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`trade_notice`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String insertSelective(TradeNotice record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`trade_notice`");
        
        if (record.getNoticeNo() != null) {
            sql.VALUES("notice_no", "#{noticeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserType() != null) {
            sql.VALUES("user_type", "#{userType,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeNum() != null) {
            sql.VALUES("notice_num", "#{noticeNum,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeType() != null) {
            sql.VALUES("notice_type", "#{noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getFlag() != null) {
            sql.VALUES("flag", "#{flag,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeTarget() != null) {
            sql.VALUES("notice_target", "#{noticeTarget,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeContent() != null) {
            sql.VALUES("notice_content", "#{noticeContent,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanTime() != null) {
            sql.VALUES("plan_time", "#{planTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendTime() != null) {
            sql.VALUES("send_time", "#{sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAlarmType() != null) {
            sql.VALUES("alarm_type", "#{alarmType,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmStatus() != null) {
            sql.VALUES("alarm_status", "#{alarmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String selectByExample(TradeNoticeExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("notice_no");
        } else {
            sql.SELECT("notice_no");
        }
        sql.SELECT("order_no");
        sql.SELECT("user_id");
        sql.SELECT("user_type");
        sql.SELECT("notice_num");
        sql.SELECT("notice_type");
        sql.SELECT("flag");
        sql.SELECT("notice_target");
        sql.SELECT("notice_content");
        sql.SELECT("plan_time");
        sql.SELECT("send_time");
        sql.SELECT("alarm_type");
        sql.SELECT("alarm_status");
        sql.SELECT("update_time");
        sql.SELECT("create_time");
        sql.FROM("`trade_notice`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TradeNotice record = (TradeNotice) parameter.get("record");
        TradeNoticeExample example = (TradeNoticeExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`trade_notice`");
        
        if (record.getNoticeNo() != null) {
            sql.SET("notice_no = #{record.noticeNo,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{record.userType,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeNum() != null) {
            sql.SET("notice_num = #{record.noticeNum,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeType() != null) {
            sql.SET("notice_type = #{record.noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{record.flag,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeTarget() != null) {
            sql.SET("notice_target = #{record.noticeTarget,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeContent() != null) {
            sql.SET("notice_content = #{record.noticeContent,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanTime() != null) {
            sql.SET("plan_time = #{record.planTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendTime() != null) {
            sql.SET("send_time = #{record.sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAlarmType() != null) {
            sql.SET("alarm_type = #{record.alarmType,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmStatus() != null) {
            sql.SET("alarm_status = #{record.alarmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_notice`");
        
        sql.SET("notice_no = #{record.noticeNo,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("user_type = #{record.userType,jdbcType=INTEGER}");
        sql.SET("notice_num = #{record.noticeNum,jdbcType=INTEGER}");
        sql.SET("notice_type = #{record.noticeType,jdbcType=INTEGER}");
        sql.SET("flag = #{record.flag,jdbcType=INTEGER}");
        sql.SET("notice_target = #{record.noticeTarget,jdbcType=VARCHAR}");
        sql.SET("notice_content = #{record.noticeContent,jdbcType=VARCHAR}");
        sql.SET("plan_time = #{record.planTime,jdbcType=TIMESTAMP}");
        sql.SET("send_time = #{record.sendTime,jdbcType=TIMESTAMP}");
        sql.SET("alarm_type = #{record.alarmType,jdbcType=INTEGER}");
        sql.SET("alarm_status = #{record.alarmStatus,jdbcType=INTEGER}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        
        TradeNoticeExample example = (TradeNoticeExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(TradeNotice record) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_notice`");
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getUserType() != null) {
            sql.SET("user_type = #{userType,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeNum() != null) {
            sql.SET("notice_num = #{noticeNum,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeType() != null) {
            sql.SET("notice_type = #{noticeType,jdbcType=INTEGER}");
        }
        
        if (record.getFlag() != null) {
            sql.SET("flag = #{flag,jdbcType=INTEGER}");
        }
        
        if (record.getNoticeTarget() != null) {
            sql.SET("notice_target = #{noticeTarget,jdbcType=VARCHAR}");
        }
        
        if (record.getNoticeContent() != null) {
            sql.SET("notice_content = #{noticeContent,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanTime() != null) {
            sql.SET("plan_time = #{planTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getSendTime() != null) {
            sql.SET("send_time = #{sendTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAlarmType() != null) {
            sql.SET("alarm_type = #{alarmType,jdbcType=INTEGER}");
        }
        
        if (record.getAlarmStatus() != null) {
            sql.SET("alarm_status = #{alarmStatus,jdbcType=INTEGER}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("notice_no = #{noticeNo,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_notice`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, TradeNoticeExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
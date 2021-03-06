package com.hbc.api.trade.order.mapping.gen;

import com.hbc.api.trade.order.mapping.gen.bean.TradeMoveCheck;
import com.hbc.api.trade.order.mapping.gen.bean.TradeMoveCheckExample.Criteria;
import com.hbc.api.trade.order.mapping.gen.bean.TradeMoveCheckExample.Criterion;
import com.hbc.api.trade.order.mapping.gen.bean.TradeMoveCheckExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TradeMoveCheckSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String countByExample(TradeMoveCheckExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`trade_move_check`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String deleteByExample(TradeMoveCheckExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`trade_move_check`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String insertSelective(TradeMoveCheck record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`trade_move_check`");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getOrderId() != null) {
            sql.VALUES("order_id", "#{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderSn() != null) {
            sql.VALUES("order_sn", "#{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.VALUES("order_no", "#{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getIsMoveSuccess() != null) {
            sql.VALUES("is_move_success", "#{isMoveSuccess,jdbcType=INTEGER}");
        }
        
        if (record.getIsInInfo() != null) {
            sql.VALUES("is_in_info", "#{isInInfo,jdbcType=INTEGER}");
        }
        
        if (record.getInfoFlag() != null) {
            sql.VALUES("info_flag", "#{infoFlag,jdbcType=INTEGER}");
        }
        
        if (record.getInfoDesc() != null) {
            sql.VALUES("info_desc", "#{infoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String selectByExample(TradeMoveCheckExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("order_id");
        sql.SELECT("order_sn");
        sql.SELECT("order_no");
        sql.SELECT("is_move_success");
        sql.SELECT("is_in_info");
        sql.SELECT("info_flag");
        sql.SELECT("info_desc");
        sql.SELECT("create_time");
        sql.SELECT("update_time");
        sql.FROM("`trade_move_check`");
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
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TradeMoveCheck record = (TradeMoveCheck) parameter.get("record");
        TradeMoveCheckExample example = (TradeMoveCheckExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`trade_move_check`");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{record.orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getIsMoveSuccess() != null) {
            sql.SET("is_move_success = #{record.isMoveSuccess,jdbcType=INTEGER}");
        }
        
        if (record.getIsInInfo() != null) {
            sql.SET("is_in_info = #{record.isInInfo,jdbcType=INTEGER}");
        }
        
        if (record.getInfoFlag() != null) {
            sql.SET("info_flag = #{record.infoFlag,jdbcType=INTEGER}");
        }
        
        if (record.getInfoDesc() != null) {
            sql.SET("info_desc = #{record.infoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_move_check`");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("order_id = #{record.orderId,jdbcType=VARCHAR}");
        sql.SET("order_sn = #{record.orderSn,jdbcType=VARCHAR}");
        sql.SET("order_no = #{record.orderNo,jdbcType=VARCHAR}");
        sql.SET("is_move_success = #{record.isMoveSuccess,jdbcType=INTEGER}");
        sql.SET("is_in_info = #{record.isInInfo,jdbcType=INTEGER}");
        sql.SET("info_flag = #{record.infoFlag,jdbcType=INTEGER}");
        sql.SET("info_desc = #{record.infoDesc,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        TradeMoveCheckExample example = (TradeMoveCheckExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(TradeMoveCheck record) {
        SQL sql = new SQL();
        sql.UPDATE("`trade_move_check`");
        
        if (record.getOrderId() != null) {
            sql.SET("order_id = #{orderId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderSn() != null) {
            sql.SET("order_sn = #{orderSn,jdbcType=VARCHAR}");
        }
        
        if (record.getOrderNo() != null) {
            sql.SET("order_no = #{orderNo,jdbcType=VARCHAR}");
        }
        
        if (record.getIsMoveSuccess() != null) {
            sql.SET("is_move_success = #{isMoveSuccess,jdbcType=INTEGER}");
        }
        
        if (record.getIsInInfo() != null) {
            sql.SET("is_in_info = #{isInInfo,jdbcType=INTEGER}");
        }
        
        if (record.getInfoFlag() != null) {
            sql.SET("info_flag = #{infoFlag,jdbcType=INTEGER}");
        }
        
        if (record.getInfoDesc() != null) {
            sql.SET("info_desc = #{infoDesc,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            sql.SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_move_check`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, TradeMoveCheckExample example, boolean includeExamplePhrase) {
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
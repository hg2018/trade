/**
 * @Author lukangle
 * @2015年10月14日@下午4:29:28
 */
package com.hbc.api.trade.pay.controller.req;


public class PayParam {
	private String notify_time;// 通知时间 Date 通知的发送时间。 格式为yyyy-MM-dd HH:mm:ss。 不可空
								// 2013-08-22 14:45:24
	private String notify_type;// 通知类型 String 通知的类型。 不可空 trade_status_sync
	private String notify_id;// 通知校验ID String 通知校验ID。 不可空
								// 64ce1b6ab92d00ede0ee56ade98fdf2f4c
	private String sign_type;// 签名方式 String 固定取值为RSA。 不可空 RSA
	private String sign;// 签名 String
	private String out_trade_no;// 商户网站唯一订单号
	private String subject;// 商品名称
	private String payment_type;// 支付类型
	private String trade_no;// 支付宝交易号
	private String trade_status;// 交易状态
	private String seller_id;// 卖家支付宝用户号
	private String seller_email;// 卖家支付宝账号
	private String buyer_id;// 买家支付宝用户号
	private String buyer_email;// 买家支付宝账号
	private String total_fee;// 交易金额
	private String quantity;// 购买数量 Number
	private String price;// 商品单价 Number
	private String body;// 商品描述 String(512
	private String gmt_create;// 交易创建时间 Date
	private String gmt_payment;// 交易付款时间 Date
	private String is_total_fee_adjust;// 是否调整总价 String(1)
	private String use_coupon;// 是否使用红包买家String(1)
	private String discount;// 折扣String
	private String refund_status;// 退款状态String
	private String gmt_refund;// 退款时间Date
	
	
	public String getNotify_time() {
		return notify_time;
	}
	public void setNotify_time(String notify_time) {
		this.notify_time = notify_time;
	}
	public String getNotify_type() {
		return notify_type;
	}
	public void setNotify_type(String notify_type) {
		this.notify_type = notify_type;
	}
	public String getNotify_id() {
		return notify_id;
	}
	public void setNotify_id(String notify_id) {
		this.notify_id = notify_id;
	}
	public String getSign_type() {
		return sign_type;
	}
	public void setSign_type(String sign_type) {
		this.sign_type = sign_type;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getOut_trade_no() {
		return out_trade_no;
	}
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getTrade_no() {
		return trade_no;
	}
	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}
	public String getTrade_status() {
		return trade_status;
	}
	public void setTrade_status(String trade_status) {
		this.trade_status = trade_status;
	}
	public String getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}
	public String getSeller_email() {
		return seller_email;
	}
	public void setSeller_email(String seller_email) {
		this.seller_email = seller_email;
	}
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getBuyer_email() {
		return buyer_email;
	}
	public void setBuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}
	public String getTotal_fee() {
		return total_fee;
	}
	public void setTotal_fee(String total_fee) {
		this.total_fee = total_fee;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getGmt_create() {
		return gmt_create;
	}
	public void setGmt_create(String gmt_create) {
		this.gmt_create = gmt_create;
	}
	public String getGmt_payment() {
		return gmt_payment;
	}
	public void setGmt_payment(String gmt_payment) {
		this.gmt_payment = gmt_payment;
	}
	public String getIs_total_fee_adjust() {
		return is_total_fee_adjust;
	}
	public void setIs_total_fee_adjust(String is_total_fee_adjust) {
		this.is_total_fee_adjust = is_total_fee_adjust;
	}
	public String getUse_coupon() {
		return use_coupon;
	}
	public void setUse_coupon(String use_coupon) {
		this.use_coupon = use_coupon;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getRefund_status() {
		return refund_status;
	}
	public void setRefund_status(String refund_status) {
		this.refund_status = refund_status;
	}
	public String getGmt_refund() {
		return gmt_refund;
	}
	public void setGmt_refund(String gmt_refund) {
		this.gmt_refund = gmt_refund;
	}
	
}

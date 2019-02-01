package com.jxtb.jpa.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="s_order")
public class Order {
	
	@Id
	@Column(name="orderId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	
	//订单号
	@Column(name="orderNo")
	private String orderNo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created")
	private Date created;

	//设置跟用户的多对一关联
	@ManyToOne
	//关联的外键是userId
	@JoinColumn(name="userId")
	private User user;
	
	
	public Order() {
	}
	
	public Order(String orderNo, Date created) {
		super();
		this.orderNo = orderNo;
		this.created = created;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNo=" + orderNo + ", created=" + created + ", user=" + user + "]";
	}
	
	
	
	

}

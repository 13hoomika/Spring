package com.xworkz.swiggy.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "swiggy_details")
public class FoodOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "restaurant_name")
    private String restaurantName;
    @Column(name = "order_status")
    private String orderStatus;

}

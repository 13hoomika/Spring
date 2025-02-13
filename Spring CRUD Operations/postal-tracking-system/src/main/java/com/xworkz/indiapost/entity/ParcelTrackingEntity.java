package com.xworkz.indiapost.entity;

import com.xworkz.indiapost.constants.DeliveryStatusEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Table(name = "parcel_details")
public class ParcelTrackingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parcel_id")
    private Integer parcelId;
    @Column(name = "sender_name")
    private String senderName;
    @Column(name = "receiver_name")
    private String receiverName;
    @Column(name = "current_location")
    private String currentLocation;
    @Column(name = "delivery_status")
    private DeliveryStatusEnum deliveryStatusEnum;

}

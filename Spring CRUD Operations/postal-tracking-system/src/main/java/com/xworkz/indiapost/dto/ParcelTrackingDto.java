package com.xworkz.indiapost.dto;

import com.xworkz.indiapost.constants.DeliveryStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParcelTrackingDto {
    private Integer parcelId;
    private String senderName;
    private String receiverName;
    private String currentLocation;
    private DeliveryStatusEnum deliveryStatusEnum;
}


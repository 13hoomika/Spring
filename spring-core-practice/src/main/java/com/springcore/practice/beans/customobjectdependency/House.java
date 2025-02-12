package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Rooms;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class House {
    @Value("1")
    private int houseId;
    @Value("Bhoomika")
    private String ownerName;
    @Value("Rajajinagar")
    private String city;
    @Autowired
    private Rooms rooms;
}

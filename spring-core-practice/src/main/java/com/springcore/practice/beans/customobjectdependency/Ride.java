package com.springcore.practice.beans.customobjectdependency;
import com.springcore.practice.beans.customobjectdependency.has.Driver;
import com.springcore.practice.beans.customobjectdependency.has.Passenger;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Ride {
    @Value("R7001")
    private String rideId;

    @Value("10 km")
    private String distance;

    @Value("Completed")
    private String status;

    @Autowired
    private Driver driver;

    @Autowired
    private Passenger passenger;
}

package com.springcore.practice.beans.customobjectdependency;
import com.springcore.practice.beans.customobjectdependency.has.SolarPanel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
@NoArgsConstructor
@Setter
@Getter
public class Satellite {
    @Value("Hubble")
    private String name;

    @Value("Low Earth Orbit")
    private String orbitType;

    @Value("X-band")
    private String communicationBand;

    @Value("1990-04-24")
    private String launchDate;

    @Autowired
    private SolarPanel solarPanel;
}

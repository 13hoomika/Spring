package com.springcore.practice.beans.customobjectdependency.has;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class CoolingSystem {
    @Value("Compressor")
    private String type;

    @Value("80")
    private double efficiency;

    @Value("500")
    private double compressorPowerInW;

    @Value("45")
    private int noiseLevelInDb;
}

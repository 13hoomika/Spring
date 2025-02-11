package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Movie;
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
@Component
@ToString
public class Theatre {
    @Value("PVR Cinemas")
    private String name;

    @Value("Orion")
    private String location;

    @Value("5")
    private int numberOfScreens;

    @Value("500")
    private int seatingCapacity;

    @Autowired
    private Movie movie;
}

package com.springcore.practice.beans.customobjectdependency.has;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Wife {
    @Value("Dhanyatha")
    private String wifeName;

    @Value("32")
    private int wifeAge;

    @Value("doctor")
    private String occupation;
}

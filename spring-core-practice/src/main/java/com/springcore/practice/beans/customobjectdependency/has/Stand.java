package com.springcore.practice.beans.customobjectdependency.has;
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
public class Stand {
    @Value("Wooden")
    private String material;

    @Value("Black")
    private String color;

    @Value("50")
    private int height;

    @Value("100")
    private int width;

    @Value("30")
    private int depth;
}

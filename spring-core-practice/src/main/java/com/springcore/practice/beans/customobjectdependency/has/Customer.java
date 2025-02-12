package com.springcore.practice.beans.customobjectdependency.has;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
public class Customer {
    @Value("101")
    private int customerId;

    @Value("Ankush")
    private String name;

    @Value("ankush@gmail.com")
    private String email;

    @Value("Vijaya Nagar")
    private String address;
}

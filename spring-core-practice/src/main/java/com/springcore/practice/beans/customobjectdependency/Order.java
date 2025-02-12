package com.springcore.practice.beans.customobjectdependency;
import com.springcore.practice.beans.customobjectdependency.has.Customer;
import com.springcore.practice.beans.customobjectdependency.has.Product;
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
public class Order {
    @Value("O5001")
    private String orderId;

    @Value("2025-02-11")
    private String orderDate;

    @Autowired
    private Customer customer;

    @Autowired
    private Product product;
}

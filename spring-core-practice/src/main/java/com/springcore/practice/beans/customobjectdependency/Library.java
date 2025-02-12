package com.springcore.practice.beans.customobjectdependency;

import com.springcore.practice.beans.customobjectdependency.has.Book;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class Library {

    @Value("City Library")
    private String name;

    @Value("Rajajinagar, Bangalore")
    private String location;

    @Value("900")
    private int totalBooks;

    @Value("9AM - 8PM")
    private String openingHours;

    @Autowired
    private Book book;


}


package com.springcore.practice.beans.customobjectdependency.has;

import org.springframework.beans.factory.annotation.Value;
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
public class Book {
    @Value("I Fell in Love with Hope")
    private String title;

    @Value("Lancali")
    private String author;

    @Value("2022")
    private int publishedYear;

}

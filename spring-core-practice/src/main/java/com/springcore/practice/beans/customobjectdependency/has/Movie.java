package com.springcore.practice.beans.customobjectdependency.has;

import org.springframework.beans.factory.annotation.Value;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
@ToString
public class Movie {
    @Value("Inception")
    private String title;

    @Value("Christopher Nolan")
    private String director;

    @Value("2010")
    private int releaseYear;

    @Value("Sci-Fi")
    private String genre;

    @Value("148")
    private int durationInMinutes;
}

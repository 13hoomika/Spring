package com.xworkz.countryapp;

import com.xworkz.countryapp.configuration.CountryConfiguration;
import com.xworkz.countryapp.country.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CountryRunner
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(CountryConfiguration.class);
        Country country = ac.getBean(Country.class);
        System.out.println(country);
    }
}

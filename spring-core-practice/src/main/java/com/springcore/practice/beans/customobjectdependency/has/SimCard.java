package com.springcore.practice.beans.customobjectdependency.has;

import com.springcore.practice.beans.customobjectdependency.constants.Provider;
import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Component
public class SimCard {
    @Value("BSNL")
    private Provider provider;

    @Value("4G")
    private String networkType;

}

package com.springcore.practice.beans.customobjectdependency.has;

import com.springcore.practice.beans.customobjectdependency.constants.roomType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class Rooms {
    @Value("01")
    private int roomId;
    @Value("BEDROOM")
    private roomType type;
}

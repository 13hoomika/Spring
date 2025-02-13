package com.xworkz.upstox.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StockTradeDto {
    private Integer tradeId;
    private String stockSymbol;
    private double quantity;
    private double price;
}


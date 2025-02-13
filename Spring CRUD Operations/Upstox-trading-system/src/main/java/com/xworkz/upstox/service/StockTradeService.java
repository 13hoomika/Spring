package com.xworkz.upstox.service;

import com.xworkz.upstox.dto.StockTradeDto;

public interface StockTradeService {
    void ValidateAndSAve(StockTradeDto dto);
}

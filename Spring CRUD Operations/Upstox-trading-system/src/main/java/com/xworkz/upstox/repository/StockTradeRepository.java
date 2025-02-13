package com.xworkz.upstox.repository;

import com.xworkz.upstox.entity.StockTradeEntity;

public interface StockTradeRepository {
    Boolean save(StockTradeEntity entity);
}

package com.cybertek.services.Carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.CarpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();

    static{
        sqPriceForCity.put(City.AUSTIN, new BigDecimal("4.32"));
        sqPriceForCity.put(City.SAN_ANTONIO, new BigDecimal("5.51"));
    }

    @Override
    public BigDecimal getSqFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

        Optional<Map.Entry<City,BigDecimal>> collect = sqPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();

        return collect.isPresent()? collect.get().getValue(): defaultValue;
    }
}

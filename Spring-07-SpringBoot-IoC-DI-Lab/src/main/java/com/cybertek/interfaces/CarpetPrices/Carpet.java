package com.cybertek.interfaces.CarpetPrices;

import com.cybertek.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
}

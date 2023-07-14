package com.javadev.ces.api.exmo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExmoPriceDto {

    @JsonProperty("sell_price")
    private BigDecimal sellPrice;

//    @JsonProperty("buy_price")
//    private BigDecimal buyPrice;
//
//    @JsonProperty("last_trade")
//    private BigDecimal lastTrade;
//
//    @JsonProperty("high")
//    private BigDecimal high;
//
//    @JsonProperty("low")
//    private BigDecimal low;
//
//    @JsonProperty("avg")
//    private BigDecimal avg;
//
//    @JsonProperty("vol_curr")
//    private BigDecimal volCurr;
//
//    @JsonProperty("updated")
//    private Long updated;

}

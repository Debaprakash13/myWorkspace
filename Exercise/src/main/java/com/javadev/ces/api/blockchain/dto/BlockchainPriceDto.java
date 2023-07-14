package com.javadev.ces.api.blockchain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockchainPriceDto {

    @JsonProperty("sell")
    private BigDecimal sellPrice;

//    @JsonProperty("15m")
//    private BigDecimal fifteenMin;
//
//    @JsonProperty("buy")
//    private BigDecimal buy;
//
//    @JsonProperty("last")
//    private BigDecimal last;
//
//    @JsonProperty("symbol")
//    private String symbol;

}

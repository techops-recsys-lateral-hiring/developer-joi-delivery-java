package com.tw.joi.delivery.dto.response;

import com.tw.joi.delivery.domain.Cart;
import com.tw.joi.delivery.domain.Product;
import java.math.BigDecimal;

public record CartProductInfo(Cart cart, Product product, BigDecimal sellingPrice) {
}

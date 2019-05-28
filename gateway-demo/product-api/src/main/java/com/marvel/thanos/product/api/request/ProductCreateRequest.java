package com.marvel.thanos.product.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Data
public class ProductCreateRequest implements Serializable {
    private String name;
    private Long price;
    private Integer stock;
}

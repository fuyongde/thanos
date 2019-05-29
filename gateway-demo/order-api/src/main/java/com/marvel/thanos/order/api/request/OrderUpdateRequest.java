package com.marvel.thanos.order.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Data
public class OrderUpdateRequest implements Serializable {
    private Integer id;
    private String name;
    private Long price;
    private Integer stock;
}

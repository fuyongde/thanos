package com.marvel.thanos.order.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateRequest implements Serializable {
    private String name;
    private Long price;
    private Integer stock;
}

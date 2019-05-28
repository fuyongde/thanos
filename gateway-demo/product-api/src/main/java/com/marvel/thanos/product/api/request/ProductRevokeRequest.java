package com.marvel.thanos.product.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Data
public class ProductRevokeRequest implements Serializable {
    private Integer id;
    private Integer status;
}

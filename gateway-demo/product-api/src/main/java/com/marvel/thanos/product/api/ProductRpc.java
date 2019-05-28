package com.marvel.thanos.product.api;

import com.marvel.thanos.product.api.request.ProductRequest;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
public interface ProductRpc {

    String create(ProductRequest request);

}

package com.marvel.thanos.product.api;

import com.marvel.thanos.product.api.request.ProductCreateRequest;
import com.marvel.thanos.product.api.request.ProductRevokeRequest;
import com.marvel.thanos.product.api.request.ProductUpdateRequest;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
public interface ProductRpc {

    String list();

    String create(ProductCreateRequest request);

    String update(Integer id, ProductUpdateRequest request);

    String revoke(Integer id, ProductRevokeRequest request);

    String delete(Integer id);
}

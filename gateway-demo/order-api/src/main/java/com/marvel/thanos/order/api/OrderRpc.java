package com.marvel.thanos.order.api;

import com.marvel.thanos.order.api.request.OrderCreateRequest;
import com.marvel.thanos.order.api.request.OrderRevokeRequest;
import com.marvel.thanos.order.api.request.OrderUpdateRequest;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
public interface OrderRpc {

    String list();

    String create(OrderCreateRequest request);

    String update(Integer id, OrderUpdateRequest request);

    String revoke(Integer id, OrderRevokeRequest request);

    String delete(Integer id);
}

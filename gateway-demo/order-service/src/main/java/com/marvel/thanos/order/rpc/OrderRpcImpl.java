package com.marvel.thanos.order.rpc;

import com.marvel.thanos.order.api.OrderRpc;
import com.marvel.thanos.order.api.request.OrderCreateRequest;
import com.marvel.thanos.order.api.request.OrderRevokeRequest;
import com.marvel.thanos.order.api.request.OrderUpdateRequest;
import com.marvel.thanos.product.api.ProductRpc;
import com.marvel.thanos.product.api.request.ProductCreateRequest;
import com.marvel.thanos.product.api.request.ProductRevokeRequest;
import com.marvel.thanos.product.api.request.ProductUpdateRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Service
@RestController
@Slf4j
public class OrderRpcImpl implements OrderRpc {

    @Reference
    private ProductRpc productRpc;

    @GetMapping("/orders")
    @Override
    public String list() {
        productRpc.list();
        log.info("GET orders");
        return "SUCCESS";
    }

    @PostMapping("/orders")
    @Override
    public String create(@RequestBody OrderCreateRequest request) {
        productRpc.create(new ProductCreateRequest("product name", 10000L, 20));
        log.info("POST products : {}", request);
        return "SUCCESS";
    }

    @PutMapping(value = "/orders/{id}", params = "op=update")
    @Override
    public String update(@PathVariable Integer id, @RequestBody OrderUpdateRequest request) {
        productRpc.update(id, new ProductUpdateRequest(id, "product name", 10000L, 20));
        log.info("PUT product 4 update : id : {}, request {}", id, request);
        return "UPDATE SUCCESS";
    }

    @PutMapping(value = "/orders/{id}", params = "op=revoke")
    @Override
    public String revoke(@PathVariable Integer id, @RequestBody OrderRevokeRequest request) {
        productRpc.revoke(id, new ProductRevokeRequest(id, 1));
        log.info("PUT product 4 revoke, id : {}, request : {}", id, request);
        return "REVOKE SUCCESS";
    }

    @DeleteMapping(value = "/orders/{id}")
    @Override
    public String delete(@PathVariable Integer id) {
        productRpc.delete(id);
        log.info("DELETE product : {}", id);
        return "DELETE SUCCESS";
    }
}

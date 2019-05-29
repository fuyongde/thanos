package com.marvel.thanos.product.rpc;

import com.marvel.thanos.product.api.ProductRpc;
import com.marvel.thanos.product.api.request.ProductCreateRequest;
import com.marvel.thanos.product.api.request.ProductRevokeRequest;
import com.marvel.thanos.product.api.request.ProductUpdateRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.*;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Service
@RestController
@Slf4j
public class ProductRpcImpl implements ProductRpc {

    @GetMapping("/products")
    @Override
    public String list() {
        log.info("GET products");
        return "SUCCESS";
    }

    @PostMapping("/products")
    @Override
    public String create(@RequestBody ProductCreateRequest request) {
        log.info("POST products : {}", request);
        return "SUCCESS";
    }

    @PutMapping(value = "/products/{id}", params = "op=update")
    @Override
    public String update(@PathVariable Integer id, @RequestBody ProductUpdateRequest request) {
        log.info("PUT product 4 update : id : {}, request {}", id, request);
        return "UPDATE SUCCESS";
    }

    @PutMapping(value = "/products/{id}", params = "op=revoke")
    @Override
    public String revoke(@PathVariable Integer id, @RequestBody ProductRevokeRequest request) {
        log.info("PUT product 4 revoke, id : {}, request : {}", id, request);
        return "REVOKE SUCCESS";
    }

    @DeleteMapping(value = "/products/{id}")
    @Override
    public String delete(@PathVariable Integer id) {
        log.info("DELETE product : {}", id);
        return "DELETE SUCCESS";
    }
}

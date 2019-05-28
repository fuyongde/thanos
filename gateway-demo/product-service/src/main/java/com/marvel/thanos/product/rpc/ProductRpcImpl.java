package com.marvel.thanos.product.rpc;

import com.marvel.thanos.product.api.ProductRpc;
import com.marvel.thanos.product.api.request.ProductRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuyongde
 * @date 2019/5/28
 */
@Service
@RestController
@Slf4j
public class ProductRpcImpl implements ProductRpc {

    @PostMapping("/products")
    @Override
    public String create(@RequestBody ProductRequest request) {
        log.info("POST products : {}", request);
        return "SUCCESS";
    }
}

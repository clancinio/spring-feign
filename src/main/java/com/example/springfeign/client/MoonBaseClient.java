package com.example.springfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "moon-base-client", url = "http://localhost:8080/moonbase")
public interface MoonBaseClient {

  @GetMapping("/status")
  StatusResponse getStatus();
}

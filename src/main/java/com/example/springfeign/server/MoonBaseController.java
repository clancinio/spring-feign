package com.example.springfeign.server;

import com.example.springfeign.client.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/moonbase")
public class MoonBaseController {

  @GetMapping("/status")
  public StatusResponse getStatus() {
    return StatusResponse.builder()
        .id(1)
        .name("Apollo Camp")
        .location("Sea of Tranquility ")
        .capacity(158)
        .build();
  }

}

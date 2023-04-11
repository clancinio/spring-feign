package com.example.springfeign.controller;

import com.example.springfeign.client.MoonBaseClient;
import com.example.springfeign.client.StatusResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
@RequiredArgsConstructor
public class StatusController {

  private final MoonBaseClient moonBaseClient;

  @GetMapping
  public ResponseEntity<StatusResponse> getMoonBaseStatus() {
    StatusResponse statusResponse = moonBaseClient.getStatus();
    return ResponseEntity.ok()
        .body(statusResponse);
  }
}

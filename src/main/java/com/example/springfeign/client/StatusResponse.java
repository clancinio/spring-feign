package com.example.springfeign.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatusResponse {

  private int id;
  private String name;
  private String location;
  private Integer capacity;
}

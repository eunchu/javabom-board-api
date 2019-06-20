package com.javabom.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Articles {
  private final String id;
  private final String type;

//  public Articles(String id, String type) {
//    this.id = id;
//    this.type = type;
//  }

//  public String getId() {
//    return id;
//  }
//
//  public String getType() {
//    return type;
//  }
}

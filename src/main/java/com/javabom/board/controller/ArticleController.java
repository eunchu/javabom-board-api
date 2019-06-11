package com.javabom.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//  클라이언트로부터 들어온 Request를 어느 Service 객체로 보내주어야 하는지 매핑하기 위한 역할
@RequestMapping("api/v1")
public class ArticleController {

  @GetMapping("/articles")
  public String getArticles() {
    return "Hello?";
  }

  @GetMapping("/article")
  public String getArticle() {
    return "Article";
  }
}

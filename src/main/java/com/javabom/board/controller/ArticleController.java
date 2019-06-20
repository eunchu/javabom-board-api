package com.javabom.board.controller;

import com.javabom.board.model.Articles;
import com.javabom.board.model.JsonTestVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
//  클라이언트로부터 들어온 Request를 어느 Service 객체로 보내주어야 하는지 매핑하기 위한 역할
@RequestMapping("api/v1")
public class ArticleController {

//  @GetMapping("/articles")
//  public JsonTestVO getArticles() {
//    JsonTestVO articles = new JsonTestVO();
//    articles.setName("hi");
//    articles.setAge("20");
//
//    return articles;
//  }

  @GetMapping("/articles")
//  public ResponseEntity<String> test() {
//    return new ResponseEntity<String>("success", HttpStatus.OK);
//  }
  public Articles getArticles(@RequestParam(id = "id", required = false, defaultValue = "1") String id) {
    return new Articles(counter.incrementAndGet(), String.format(template, id));

  }

  @GetMapping(value = "article/{id}")
  public ResponseEntity<String> getId(String id) {
    String aaa = "a";
    ResponseEntity<String> a = new ResponseEntity<String>(aaa, HttpStatus.OK);

    return a;
  }

//  @RequestMapping(value="/a/{id}", method = RequestMethod.GET)
//  public ResponseEntity<List<String>> getMeasOpers(HttpServletRequest request, String test) {
//    List<String> testMeasOperList = new ArrayList<String>();
//    for (int i = 0; i < 10; i++) {
//      testMeasOperList.add("Meas_Oper_" + i);
//    }
//    ResponseEntity<List<String>> entity = new ResponseEntity<List<String>>(testMeasOperList, HttpStatus.OK);
//    return entity;
//  }

}

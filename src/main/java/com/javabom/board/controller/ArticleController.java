package com.javabom.board.controller;

import com.javabom.board.model.ArticleData;
import com.javabom.board.repository.ArticlesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("api/v1")
public class ArticleController {

//  @GetMapping(value = "article/{id}")
//  public ResponseEntity<String> getId(String id) {
//    String aaa = "a";
//    ResponseEntity<String> a = new ResponseEntity<String>(aaa, HttpStatus.OK);
//
//    return a;
//  }

  @Autowired
  private ArticlesDAO articlesDao;

  @GetMapping("/articles")
  @ResponseBody
  public ArticleData getArticles() {
    return articlesDao.getData();
  }

  public ResponseEntity<Object> addArticle(@RequestBody ArticleData articles) {
//    Integer id = articlesDao.getData().getDataContents().size() + 1;
//    articles.setId(id);

    articlesDao.addArticles(articles);

    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(articles.getId())
            .toUri();
    return ResponseEntity.created(location).build();
  }
//  public ResponseEntity<ArticleData> ArticleData(@RequestParam Map<String, Array> data) {
//    ArticleData response = new ArticleData();
//
//
//    return new ResponseEntity<ArticleData>(response, HttpStatus.OK);
//  }


//  @GetMapping("/articles/{id}")
//  @ResponseBody
//  public GetResponseArticleById ArticlesById(@PathVariable String id) {
//    GetResponseArticleById response = new GetResponseArticleById();
//
//    response.setId(id);
//    response.setType("hi" + id);
//
//    return response;
//  }


//  {
//    "data": [
//      {
//        "type": "articles",
//        "id": "1",
//        "attributes": {
//                "title": "Initial Article",
//                "content": "This is content of article"
//      },
//        "links": {
//        "self": "https://board-api/api/v1/articles/1"
//      }
//      },
//    ]
//  }



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

package com.javabom.board.controller;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.service.ArticlesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("api/v1") // class와 경로를 매핑함
@RequiredArgsConstructor
public class ArticleController {

    public Ar() {};

    @Autowired // 빈 간의 의존성
    private final ArticlesService articlesService;

    @GetMapping("/articles")
    public ResponseEntity<List<ArticlesEntity>> findAllArticle() {
        final List<ArticlesEntity> articlesList = articlesService.findAllArticle();
//
//        if (articlesList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }

        return new ResponseEntity<List<ArticlesEntity>>(articlesList, HttpStatus.OK);
//        return ResponseEntity.ok(articlesService.findAllArticle());
    }

//    @PostMapping("/article/{id}")
//    @ResponseBody
//    public ResponseEntity<ArticlesEntity> createAricle(@PathVariable("id") Long id) {
//        return articlesService.create(id);
//    }


//    @PostMapping("test")
//    public ResponseEntity<ArticlesEntity> save(WebRequest request, ArticlesEntity articlesEntity) {
//        ArticlesEntity article = new ArticlesEntity();
//
////        article.setId();
////        article.setContent("test");
////        article.setTitle("hi");
//
//        ResponseEntity<ArticlesEntity> articlesEntityResponseEntity = new ResponseEntity<ArticlesEntity>(article, HttpStatus.OK);
//
//        return articlesEntityResponseEntity;
//    }



//    @PostMapping(value = "/api/v1/articles")
//    public ResponseEntity<ResponseWrapper> save(WebRequest request, ResponseWrapper wrapper) {
//        JSONResponse response = new JSONResponse(wrapper.getData());
//        Article article = new Article();
//        article.setTitle(response.getAttributes().get(title));
//        article.setContent(response.getAttributes().get(content));
//        Article newArticle = articleService.create(article);
//        ResponseEntity<ResponseWrapper> articleEntity = new ResponseEntity<ResponseWrapper>(newArticle, HttpStatus.valueOf(201));
//        return articleEntity;
//    }
}

package com.javabom.board.controller;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;
import com.javabom.board.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ArticleController {

    @Autowired // 빈 간의 의존성
    private ArticlesService articlesService;

    @GetMapping("/articles")
    public ResponseEntity<List<ArticlesEntity>> getArticles() {
        final List<ArticlesEntity> articlesList = articlesService.findAllArticles();

        if (articlesList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<ArticlesEntity>>(articlesList, HttpStatus.OK);
    }

//    @PostMapping("/article/{id}")
//    public ResponseEntity<ArticlesEntity> createAricle(@RequestBody final Articles articles)


    @PostMapping("test")
    public ResponseEntity<ArticlesEntity> save(WebRequest request, ArticlesEntity articlesEntity) {
        ArticlesEntity article = new ArticlesEntity();

//        article.setId();
        article.setContent("test");
        article.setTitle("hi");

        ResponseEntity<ArticlesEntity> articlesEntityResponseEntity = new ResponseEntity<ArticlesEntity>(article, HttpStatus.OK);

        return articlesEntityResponseEntity;
    }



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

package com.javabom.board.controller;

import com.javabom.board.model.articles.Articles;
import com.javabom.board.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ArticleController {

    @Autowired // 빈 간의 의존성
    private ArticlesService articlesService;

//    @GetMapping("/articles")
//    public ResponseEntity<Articles> getArticles() {
//        List<Articles> articlesList = articlesService.findAllArticles();
//
//    }

}

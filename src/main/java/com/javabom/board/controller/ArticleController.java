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
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class ArticleController {

    @Autowired // 빈 간의 의존성
    private final ArticlesService articlesService;

    @GetMapping("/articles")
    public ResponseEntity<List<ArticlesEntity>> findAllArticle() {
        final List<ArticlesEntity> articlesList = articlesService.findAllArticle();
//
        if (articlesList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<ArticlesEntity>>(articlesList, HttpStatus.OK);
//        return ResponseEntity.ok(articlesService.findAllArticle());
    }

    @PostMapping
    public ResponseEntity create(@RequestBody ArticlesEntity articlesEntity) {

        ArticlesEntity article = new ArticlesEntity();

        article = articlesService.saveArticle(articlesEntity);

        return new ResponseEntity<ArticlesEntity>(article, HttpStatus.OK);
    }


}

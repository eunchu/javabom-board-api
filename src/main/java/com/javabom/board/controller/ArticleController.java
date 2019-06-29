package com.javabom.board.controller;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;
import com.javabom.board.service.ArticlesService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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
//@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class ArticleController {

    @Autowired // 빈 간의 의존성
    private final ArticlesService articlesService;

    @GetMapping("/articles")
    public ResponseEntity<List<ArticlesEntity>> getArticleList() {
        final List<ArticlesEntity> articlesList = articlesService.findAll();
        if (articlesList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<ArticlesEntity>>(articlesList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity <ArticlesEntity> create(@RequestBody ArticlesEntity articlesEntity) {

//        Articles newArticle = articlesService.save(articlesEntity);
//        newArticle.setData();
//        return new ResponseEntity<>(new ArticlesEntity(), HttpStatus.CREATED);
        return new ResponseEntity<>(articlesEntity, HttpStatus.OK);
//        return ResponseEntity.ok(articlesService.save(articles));

    }

//    @GetMapping("/articles/{id}")
//    public ResponseEntity<ArticlesEntity> findById(@PathVariable Long id) {
//        Optional<ArticlesEntity> article = articlesService.findById(id);
//        return ResponseEntity.ok(article.get());
//    }
}

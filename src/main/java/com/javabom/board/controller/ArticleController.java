package com.javabom.board.controller;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;
import com.javabom.board.model.articles.Attributes;
import com.javabom.board.model.articles.Links;
import com.javabom.board.model.response.ArticleWrapper;
import com.javabom.board.service.ArticlesService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("api/v1")
//@RequiredArgsConstructor
@AllArgsConstructor
//@NoArgsConstructor
public class ArticleController {

    @Autowired // 빈 간의 의존성
    private final ArticlesService articlesService;

//    @GetMapping("/articles")
//    public ResponseEntity<List<ArticlesEntity>> getArticleList() {
//        final List<ArticlesEntity> articlesList = articlesService.findAll();
//        if (articlesList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<List<ArticlesEntity>>(articlesList, HttpStatus.OK);
//    }

    @GetMapping("/articles")
    public ResponseEntity<ArticleWrapper> getArticleList() {
        final List<Articles> articlesList = articlesService.findAll();
        ArticleWrapper articleWrapper = new ArticleWrapper(articlesList);

//        if (articlesList.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        }

        return new ResponseEntity<ArticleWrapper>(articleWrapper, HttpStatus.OK);
    }

//    @PostMapping
//    public ResponseEntity <ArticleWrapper> create() {
//        ArticlesEntity articlesEntity = new ArticlesEntity();
//        List<ArticlesEntity> articlesEntities = articlesService.findAll();
//
//        List<Articles> articleList = new ArrayList<Articles>();
//        Articles articles = new Articles();
//        Attributes attributes = new Attributes();
//        Links links = new Links();
//
//        articles.setType("articles");
////        articles.setId(articlesEntity.getId());
//        articles.setAttributes(attributes);
//        articles.setLinks(links);
//
//        attributes.setTitle("Initial Article");
//        attributes.setContent("This is content of article");
//        links.setSelf("https://board-api/api/v1/articles/" + articlesEntity.getId());
//
//        ArticleWrapper articleWrapper = new ArticleWrapper();
//        articleWrapper.setData(articles);
//
//        return new ResponseEntity<ArticleWrapper>(articleWrapper, HttpStatus.OK);
//
////        return new ResponseEntity<>(articlesService.save(articlesEntity), HttpStatus.CREATED);
//    }

    @GetMapping("/articles/{id}")
    public ResponseEntity<ArticlesEntity> findById(@PathVariable Long id) {
        Optional<ArticlesEntity> article = articlesService.findById(id);
        return ResponseEntity.ok(article.get());
//        return new ResponseEntity(article, HttpStatus.OK);
    }
}

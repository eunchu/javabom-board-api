package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.repository.ArticlesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor // lombok annotation
@AllArgsConstructor

public class ArticlesServiceImpl implements ArticlesService {

//    생성자
//    public ArticlesServiceImpl(ArticlesRepository articlesRepository) {
//        this.articlesRepository = articlesRepository;
//    }

    @Autowired
    private final ArticlesRepository articlesRepository;

    @Override
    public List<ArticlesEntity> findAllArticle() {

        List<ArticlesEntity> allArticles = new ArrayList<ArticlesEntity>();

        allArticles = articlesRepository.findAll();

        return allArticles;
    }

    @Override
    public ArticlesEntity saveArticle(ArticlesEntity articlesEntity) {
        return articlesRepository.save(articlesEntity);
    }

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
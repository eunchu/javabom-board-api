package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;
import com.javabom.board.repository.ArticlesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// service 인터페이스에 관한 참고글
//https://cheese10yun.github.io/spring-oop-04/

@Service
public class ArticlesService {

    @Autowired
    private ArticlesRepository articlesRepository;

    public List<Articles> findAllArticles() {
        List<ArticlesEntity> ArticlesEntityList = articlesRepository.findAll();

        List<Articles> articles = new ArrayList<>();


        return articles;
//        List<Articles> articles = new ArrayList<>();

//        for (ArticlesEntity articlesEntity : articlesEntities) {
//
//            articles.add(article);
//        }

    }

}

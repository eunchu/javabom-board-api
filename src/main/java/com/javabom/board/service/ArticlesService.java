package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;

import java.util.List;

public interface ArticlesService {

    List<ArticlesEntity> findAllArticle();

    ArticlesEntity saveArticle(ArticlesEntity articlesEntity);
}
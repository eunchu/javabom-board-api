package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import org.springframework.data.annotation.CreatedBy;

import java.util.List;

public interface ArticlesService {

    List<ArticlesEntity> findAllArticles();

    ArticlesEntity create(ArticlesEntity articlesEntity);

}
package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;

import java.util.List;
import java.util.Optional;

public interface ArticlesService {

    // Read : 전체목록
    List<Articles> findAll();

    // Create : 목록 생성
    ArticlesEntity save(ArticlesEntity articlesEntity);

    //
    Optional<ArticlesEntity> findById(Long id);

    // Update : 목록 수정
//    void update(ArticlesEntity articlesEntity);

    // Delete : 목록 삭제
//    void deleteById(Long id);
}
package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;
import com.javabom.board.repository.ArticlesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticlesServicelmpl implements ArticlesService {

    @Autowired
    private final ArticlesRepository articlesRepository;

    @Override
    public List<ArticlesEntity> findAllArticles() {

        List<ArticlesEntity> articles = new ArrayList<ArticlesEntity>();

        articles = articlesRepository.findAll();

        return articles;
    }

    @Override
    public ArticlesEntity create(ArticlesEntity articlesEntity) {

        return articlesRepository.save(articlesEntity);
    }

}

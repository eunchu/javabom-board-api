package com.javabom.board.service;

import com.javabom.board.model.articles.Articles;
import java.util.List;

public interface ArticlesService {

    List<Articles> findAllArticles();

}

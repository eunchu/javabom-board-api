package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.repository.ArticlesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticlesServiceImpl implements ArticlesService {

    private ArticlesRepository articlesRepository;

    @Override
    public List<ArticlesEntity> findAllArticle() {

//        List<ArticlesEntity> articles = new ArrayList<ArticlesEntity>();

//        articles = articlesRepository.findAll();

        return articlesRepository.findAll();
    }

//    @Override
//    public ArticlesEntity create(ArticlesEntity articlesEntity) {
//        return articlesRepository.save(articlesEntity);
//    }
}

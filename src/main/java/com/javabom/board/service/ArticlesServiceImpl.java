package com.javabom.board.service;

import com.javabom.board.entity.ArticlesEntity;
import com.javabom.board.model.articles.Articles;
import com.javabom.board.model.articles.Attributes;
import com.javabom.board.model.articles.Links;
import com.javabom.board.repository.ArticlesRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor // lombok annotation
@AllArgsConstructor
@NoArgsConstructor
public class ArticlesServiceImpl implements ArticlesService {

//    생성자
//    public ArticlesServiceImpl(ArticlesRepository articlesRepository) {
//        this.articlesRepository = articlesRepository;
//    }

  @Autowired
  private ArticlesRepository articlesRepository;

  @Override
  public List<ArticlesEntity> findAll() {
        List<ArticlesEntity> articlesEntities = new ArrayList<ArticlesEntity>();
//        allArticles = articlesRepository.findAll();
//        return allArticles;
    return articlesRepository.findAll();
  }

  @Override
  public ArticlesEntity save(ArticlesEntity articlesEntity) {
    return articlesRepository.save(articlesEntity);
  }

//  @Override
//  public Optional<Articles> findById(Long id) {
//    return articlesRepository.findById(id);
//  }
//
//  @Override
//  // void 는 return 값을 가지지 않음
//  public void update(Articles articles) {
//    articlesRepository.save(articles);
//  }
//
//  @Override
//  public void deleteById(Long id) {
//    articlesRepository.deleteById(id);
//  }
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
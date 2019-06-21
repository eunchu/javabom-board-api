package com.javabom.board.repository;

import com.javabom.board.model.ArticleData;
import org.springframework.stereotype.Repository;

@Repository
public class ArticlesDAO {
  private static ArticleData list = new ArticleData();


//  private static final List<String, Object> attributes = ;

  static {
    list.getDataContents().add("1", "articles");
//    list.getArticles().add(new ArticleData(2, "articles2", "attributes"));
  }

  public ArticleData getData() {
    return list;
  }

  public void addArticles(ArticleData data) {
    list.getData().add(data);
  }
}
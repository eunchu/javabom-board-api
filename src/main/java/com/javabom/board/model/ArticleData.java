package com.javabom.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticleData {

  private String id;
  private String type;
  private ArticleAttributes attributes;

  private List<ArticleData> data;

  public List<ArticleData> getDataContents() {
    if(data == null) {
      data = new ArrayList<>();
    }
    return data;
  }

  public void setArticleData(List<ArticleData> data) {
    this.data = data;
  }
}



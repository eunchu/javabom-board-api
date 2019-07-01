package com.javabom.board.model.response;

import com.javabom.board.model.articles.Articles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ArticleWrapper {
  private Articles data;
}

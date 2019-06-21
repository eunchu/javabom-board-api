package com.javabom.board.model;

import java.util.Map;

public class ArticleAttributes {

  private String title;
  private String content;

  private Map<String, ArticleAttributes> attributes;

  public Map<String, ArticleAttributes> getAttributes() {
    if (attributes == null) {
      attributes = Map.of();
    }
    return attributes;
  }

  public void setAttributes(Map<String, ArticleAttributes> attributes) {
    this.attributes = attributes;
  }

  // --------------------------------------
//  private class DataContent {
//    private Integer id;
//    private String type;
//    private Map<String, ArticleData.AttributeContent> attributes;
//  }
//
//  private class AttributeContent {
//    private String title;
//    private String content;
//  }
//
//  private Map<String, ArticleData.AttributeContent> attributes;
//  public Map<String, ArticleData.AttributeContent> getAttributeContents() {
////    if(attributes == null) {
////      data = new ;
////    }
//    return attributes;
//  }
//
//  private List<ArticleData.DataContent> data;
//
//  public List<ArticleData.DataContent> getDataContents() {
//    if(data == null) {
//      data = new ArrayList<>();
//    }
//    return data;
//  }
//
//
//  public void setArticles(List<ArticleData.DataContent> data) {
//    this.data = data;
//  }
}

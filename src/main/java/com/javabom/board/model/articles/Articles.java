package com.javabom.board.model.articles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Articles {
    private List<Articles> data;
//    private String type;
//    private Long id;
//    private Attributes attributes;
//    private Links links;
}

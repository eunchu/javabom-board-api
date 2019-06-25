package com.javabom.board.model.articles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Articles {
    private String type;
    private String id;
    private Attributes attributes;
    private Links links;
}

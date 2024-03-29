package com.javabom.board.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity // 객체를 테이블과 매핑 할 엔티티라고 JPA에게 알려주는 역할
@Table // 엔티티 클래서에 매핑할 테이블 정보를 알려줌, 생략할 경우 엔티티 이름을 테이블 이름으로 자동 매핑(대소문자 구문 X)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder // ?
public class ArticlesEntity {

    @Id // 식별자 필드, 테이블의 기본 키PK(Primary Key)에 매핑
    @GeneratedValue(strategy = GenerationType.AUTO) // id 자동 생성
    private Long id;

    @Column // 테이블의 칼럼에 매핑
    private String type;

    @Column
    private String title;

    @Column
    private String contents;

//    @Column
//    private String content;
//    @Column
//    private List attributes;
}

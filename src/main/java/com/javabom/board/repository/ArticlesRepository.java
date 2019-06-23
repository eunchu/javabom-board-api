package com.javabom.board.repository;

import com.javabom.board.entity.ArticlesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends JpaRepository<ArticlesEntity, Long> {
    // JPA 에선 Repository 인터페이스 생성 후,
    // JpaRepository<Entity, 기본키 타입> 을 extends 하면
    // 기본적인 CRUD 가 자동으로 생성 됨
}

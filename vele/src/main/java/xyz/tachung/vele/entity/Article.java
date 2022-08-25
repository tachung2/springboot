package xyz.tachung.vele.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // 해당 객체 인식 가능
@AllArgsConstructor // 생성자 어노테이션
@NoArgsConstructor // 디폴트(기본값) 생성자
@ToString
@Getter
public class Article {

    @Id // 대표값으로서 기본이 되는 값(데이터베이스에서 무조건 들어가야 됨
    @GeneratedValue // 1, 2, 3, ... 으로 자동 생성 시키는 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String subject;
}

package xyz.tachung.vele.dto;

import lombok.AllArgsConstructor;
import lombok.ToString;
import xyz.tachung.vele.entity.Article;


@AllArgsConstructor
@ToString
public class ArticleForm {

    private Long id; // 필드 추가
    private String title;
    private String subject;

    public Article toEntity() {
        return new Article(id, title, subject);
    }
}

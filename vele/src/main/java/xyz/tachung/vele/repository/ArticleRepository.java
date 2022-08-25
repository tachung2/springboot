package xyz.tachung.vele.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.tachung.vele.entity.Article;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    @Override
    ArrayList<Article> findAll();
}

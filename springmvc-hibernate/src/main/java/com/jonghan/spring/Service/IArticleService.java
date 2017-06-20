package com.jonghan.spring.Service;

import com.jonghan.spring.Entity.Article;
import org.springframework.security.access.annotation.Secured;

import java.util.List;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface IArticleService {
    @Secured ({"ROLE_ADMIN", "ROLE_USER"})
    List<Article> getAllArticles();
    @Secured ({"ROLE_ADMIN", "ROLE_USER"})
    Article getArticleById(int articleId);
    @Secured ({"ROLE_ADMIN"})
    boolean addArticle(Article article);
    @Secured ({"ROLE_ADMIN"})
    void updateArticle(Article article);
    @Secured ({"ROLE_ADMIN"})
    void deleteArticle(int articleId);
}

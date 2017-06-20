package com.jonghan.spring.DAO;

import com.jonghan.spring.Entity.Article;

import java.util.List;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface IArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
}

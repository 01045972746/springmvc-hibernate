package com.jonghan.spring.Service;

import com.jonghan.spring.DAO.IArticleDAO;
import com.jonghan.spring.Entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Service
public class ArticleService implements IArticleService {
    @Autowired
    private IArticleDAO articleDAO;
    @Override
    public Article getArticleById(int articleId) {
        Article obj = articleDAO.getArticleById(articleId);
        return obj;
    }
    @Override
    public List<Article> getAllArticles(){
        return articleDAO.getAllArticles();
    }
    @Override
    public synchronized boolean addArticle(Article article){
        if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
            return false;
        } else {
            articleDAO.addArticle(article);
            return true;
        }
    }
    @Override
    public void updateArticle(Article article) {
        articleDAO.updateArticle(article);
    }
    @Override
    public void deleteArticle(int articleId) {
        articleDAO.deleteArticle(articleId);
    }
}

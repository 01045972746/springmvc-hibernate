package com.jonghan.spring.DAO;

import com.jonghan.spring.DAO.Interface.IArticleDAO;
import com.jonghan.spring.Entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Transactional
@Repository
public class ArticleDAO implements IArticleDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public Article getArticleById(int articleId) {
        return hibernateTemplate.get(Article.class, articleId);
    }
    @SuppressWarnings("unchecked")
    @Override
    public List<Article> getAllArticles() {
        String hql = "FROM Article as atcl ORDER BY atcl.articleId";
        return (List<Article>) hibernateTemplate.find(hql);
    }
    @Override
    public void addArticle(Article article) {
        hibernateTemplate.save(article);
    }
    @Override
    public void updateArticle(Article article) {
        Article artcl = getArticleById(article.getArticleId());
        artcl.setTitle(article.getTitle());
        artcl.setCategory(article.getCategory());
        hibernateTemplate.update(artcl);
    }
    @Override
    public void deleteArticle(int articleId) {
        hibernateTemplate.delete(getArticleById(articleId));
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean articleExists(String title, String category) {
        String hql = "FROM Article as atcl WHERE atcl.title = ? and atcl.category = ?";
        List<Article> articles = (List<Article>) hibernateTemplate.find(hql, title, category);
        return articles.size() > 0 ? true : false;
    }
}

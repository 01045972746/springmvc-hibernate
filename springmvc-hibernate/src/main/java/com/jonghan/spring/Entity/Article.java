package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Entity
@Table(name="articles")
public class Article implements Serializable {

    private static final long serialVersionUID = 6285843869487220745L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="article_id")
    private int articleId;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;
    public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}

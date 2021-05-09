package com.codeup.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String body;

    @OneToOne(cascade = CascadeType.ALL)
    private PostDetails postDetails;

    public Post() {
    }

    public Post(long postId, String title, String body) {
        this.postId = postId;
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public long getId() {
        return postId;
    }

    public void setId(long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

package io.romellpineda.memestagram.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Meme {

    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String name;
    public String url;
    private Date createdAt;
//    public int likes;

    @ManyToOne(fetch = FetchType.LAZY)
    ApplicationUser appUser;

    public Meme() {}

    public Meme(ApplicationUser appUser, String name, String url) {
        this.appUser = appUser;
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public ApplicationUser getAppUser() {
        return appUser;
    }

//    public int getLikes() {
//        return likes;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setLikes(int likes) {
//        this.likes = likes;
//    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

}

//why did you leave commented code in your master branch?
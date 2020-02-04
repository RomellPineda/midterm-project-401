package io.romellpineda.memestagram.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class ApplicationUser implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column(unique=true)
    String username;
    String password;
    String profilePicture;
    String bio;
    private Date createdAt;
    String firstName;

    @OneToMany(mappedBy = "appUser")
    public List<Meme> memes;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "following_users",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "followed_id"))
    public List<ApplicationUser> following;


    public ApplicationUser() {}


    public ApplicationUser(String username, String password, String profilePicture, String bio, String firstName) {
        this.username = username;
        this.password = password;
        this.profilePicture = profilePicture;
        this.bio = bio;
        this.firstName= firstName;
    }

    public String getFirstName() {
        return firstName;
    }


    public Long getId() {

        return id;
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    public String getPassword() {
        return password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getBio() {
        return bio;
    }

    public Date getUserCreated() {
        return createdAt;
    }

}

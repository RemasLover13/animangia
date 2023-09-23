package ru.kpfu.animangia.models;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "avatar")
public class Avatar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "avatar_url", nullable = false)
    private String avatarUrl;

    public Avatar() {}

    public Avatar(User user, String avatarUrl) {
        this.user = user;
        this.avatarUrl = avatarUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "Avatar{" +
                "id=" + id +
                ", user=" + user +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }
}

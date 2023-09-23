package ru.kpfu.animangia.models;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "anime")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "anime_name", nullable = false)
    private String animeName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "release_year", nullable = false)
    private int releaseYear;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "video_format", nullable = false)
    private boolean videoFormat;

    public Anime() {}

    public Anime(String animeName, String description, String genre, int releaseYear, String imageUrl, boolean videoFormat) {
        this.animeName = animeName;
        this.description = description;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.imageUrl = imageUrl;
        this.videoFormat = videoFormat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(boolean videoFormat) {
        this.videoFormat = videoFormat;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", animeName='" + animeName + '\'' +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", imageUrl='" + imageUrl + '\'' +
                ", videoFormat=" + videoFormat +
                '}';
    }
}


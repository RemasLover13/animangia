package ru.kpfu.animangia.models;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "manga")
public class Manga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "manga_name", nullable = false)
    private String mangaName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "release_year", nullable = false)
    private int releaseYear;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    public Manga() {}

    public Manga(String mangaName, String description, String genre, int releaseYear, String imageUrl) {
        this.mangaName = mangaName;
        this.description = description;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMangaName() {
        return mangaName;
    }

    public void setMangaName(String mangaName) {
        this.mangaName = mangaName;
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

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", mangaName='" + mangaName + '\'' +
                ", description='" + description + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}


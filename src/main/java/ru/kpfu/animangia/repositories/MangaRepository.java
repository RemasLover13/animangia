package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kpfu.animangia.models.Manga;

import java.time.LocalDate;
import java.util.List;

public interface MangaRepository extends JpaRepository<Manga, Long> {
        List<Manga>  findByMangaName(String mangaName);



}

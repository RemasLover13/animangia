package ru.kpfu.animangia.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.animangia.models.Manga;
import ru.kpfu.animangia.repositories.MangaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class MangaService {
    @Autowired
    private MangaRepository mangaRepository;


    public List<Manga> findAll() {
        return mangaRepository.findAll();
    }

    public Optional<Manga> findById(Long id) {
        return mangaRepository.findById(id);
    }

    public Manga save(Manga manga) {
        return mangaRepository.save(manga);
    }

    public void deleteById(Long id) {
        mangaRepository.deleteById(id);
    }

    public List<Manga> findByMangaName(String title) {
        return mangaRepository.findByMangaName(title);
    }


}

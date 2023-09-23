package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.animangia.models.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {
}

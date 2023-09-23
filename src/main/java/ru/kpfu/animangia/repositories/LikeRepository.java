package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.animangia.models.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {
}

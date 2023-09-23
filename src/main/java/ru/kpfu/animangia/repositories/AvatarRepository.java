package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.animangia.models.Avatar;

public interface AvatarRepository extends JpaRepository<Avatar, Long> {
}

package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.animangia.models.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

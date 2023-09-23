package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.animangia.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByUsername(String username);

}

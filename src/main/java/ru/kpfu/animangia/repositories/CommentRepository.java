package ru.kpfu.animangia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.animangia.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

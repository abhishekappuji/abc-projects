package com.abhishek.project.springngblog.repository;

import com.abhishek.project.springngblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

package com.kanaex.reddit.repository;

import com.kanaex.reddit.model.Comment;
import com.kanaex.reddit.model.Post;
import com.kanaex.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}

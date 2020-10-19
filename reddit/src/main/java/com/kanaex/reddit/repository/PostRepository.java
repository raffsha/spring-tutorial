package com.kanaex.reddit.repository;

import com.kanaex.reddit.model.Post;
import com.kanaex.reddit.model.Subreddit;
import com.kanaex.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}

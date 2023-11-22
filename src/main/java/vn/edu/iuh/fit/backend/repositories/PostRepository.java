package vn.edu.iuh.fit.backend.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.backend.models.Post;
import vn.edu.iuh.fit.backend.models.PostComment;

public interface PostRepository extends JpaRepository<Post, Long> {

Post findPostById(@Param("postId") long postId);
//  List<PostComment> findAllByPostId(@Param("postId") Long postId);


}

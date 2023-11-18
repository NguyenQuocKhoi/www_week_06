package vn.edu.iuh.fit.backend.repositories;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import vn.edu.iuh.fit.backend.models.PostComment;

public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
  List<PostComment> findAllByPostId(@Param("postId") Long postId);
}

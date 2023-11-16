package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.Post;
import vn.edu.iuh.fit.backend.models.PostComment;

public interface PostRepository extends JpaRepository<Post, Long> {


}

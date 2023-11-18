package vn.edu.iuh.fit.backend.services;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.PostComment;
import vn.edu.iuh.fit.backend.repositories.PostCommentRepository;
import vn.edu.iuh.fit.backend.repositories.PostRepository;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentService {

  @Autowired
  private PostCommentRepository postCommentRepository;

  public List<PostComment> findCommentByPost(long postId){
       return postCommentRepository.findAll();
  }

  public List<PostComment> findAllByPostId(@Param("postId") Long postId){
    return postCommentRepository.findAllByPostId(postId);
  }
}

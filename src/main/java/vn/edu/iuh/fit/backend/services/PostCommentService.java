package vn.edu.iuh.fit.backend.services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.repositories.PostCommentRepository;
import vn.edu.iuh.fit.backend.repositories.PostRepository;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentService {

  private PostCommentRepository postCommentRepository;
}

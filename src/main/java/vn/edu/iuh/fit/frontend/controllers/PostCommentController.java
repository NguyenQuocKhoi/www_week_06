package vn.edu.iuh.fit.frontend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.edu.iuh.fit.backend.models.Post;
import vn.edu.iuh.fit.backend.models.PostComment;
import vn.edu.iuh.fit.backend.services.PostCommentService;
import vn.edu.iuh.fit.backend.services.PostService;

@Controller
public class PostCommentController {

  @Autowired
  private PostCommentService commentService;
  @Autowired
  private PostService postService;

  @GetMapping("/comment/{id}")
  public String showComment(@PathVariable long id, Model model){
    List<PostComment> comments = commentService.findAllByPostId(id);
    Post post = postService.findPostById(id);
    model.addAttribute("comments", comments);
    model.addAttribute("post", post);
    return "comment";
  }
}

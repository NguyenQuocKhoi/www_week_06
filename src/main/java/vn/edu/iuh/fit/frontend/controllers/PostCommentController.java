package vn.edu.iuh.fit.frontend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vn.edu.iuh.fit.backend.models.PostComment;
import vn.edu.iuh.fit.backend.services.PostCommentService;

@Controller
public class PostCommentController {

  @Autowired
  private PostCommentService commentService;

  @GetMapping("/comment/{id}")
  public String showComment(@PathVariable long id, Model model){
    List<PostComment> comments = commentService.findAllByPostId(id);
    model.addAttribute("comments", comments);
    return "comment";
  }
}

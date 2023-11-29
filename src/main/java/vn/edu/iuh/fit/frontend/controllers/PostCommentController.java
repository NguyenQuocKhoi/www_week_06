package vn.edu.iuh.fit.frontend.controllers;

import java.time.Instant;
import java.util.List;
import javax.xml.stream.events.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.fit.backend.models.Post;
import vn.edu.iuh.fit.backend.models.PostComment;
import vn.edu.iuh.fit.backend.models.User;
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

  @GetMapping("/show-add-formComment")
  public String add(Model model) {
    PostComment comment = new PostComment();
    model.addAttribute("comment", comment);
    return "add-form-comment";
  }

  @PostMapping("/addComment")
  public String addPost(
      @ModelAttribute("comment") PostComment postComment,
      BindingResult result, Model model) {
    return "redirect:/comment";
  }
}

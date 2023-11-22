package vn.edu.iuh.fit.frontend.controllers;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.backend.models.Post;
import vn.edu.iuh.fit.backend.models.User;
import vn.edu.iuh.fit.backend.repositories.PostRepository;
import vn.edu.iuh.fit.backend.repositories.UserRepository;
import vn.edu.iuh.fit.backend.services.PostService;
import vn.edu.iuh.fit.backend.services.UserService;

@Controller
public class PostController {
  @Autowired
  private PostRepository postRepository;

  @Autowired
  private PostService postService;
  @Autowired
  private UserService userService;

  @Autowired
  private UserRepository userRepository;
  @GetMapping("/blog")
  public String showBlogListPaging(Model model,
      @RequestParam("page") Optional<Integer> page,
      @RequestParam("size") Optional<Integer> size) {
    int currentPage = page.orElse(1);
    int pageSize = size.orElse(4);

    Page<Post> postPage = postService.findPaginated(currentPage - 1,
        pageSize, "title", "asc");

    model.addAttribute("postPage", postPage);

    int totalPages = postPage.getTotalPages();
    if (totalPages > 0) {
      List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
          .boxed()
          .collect(Collectors.toList());
      model.addAttribute("pageNumbers", pageNumbers);
    }
    return "blog";
  }

  @GetMapping("/show-add-form")
  public String add(Model model) {
    Post post = new Post();
    model.addAttribute("post",post);
    return "add-form-post";
  }
  @PostMapping("/add")
  public String addPost(
      @ModelAttribute("post") Post post, @ModelAttribute("user") User user,
      BindingResult result, Model model, String userId) {
    long id =  Long.parseLong(userId);
   User user1 = userRepository.findUserById(id);
    post.setCreatedAt(Instant.now());
    post.setAuthor(user1);
    postRepository.save(post);
    return "redirect:/blog";
  }
}

package jpabook.jpashop;

import org.springframework.web.bind.annotation.*;

@RestController
public class MappingClassController {
  @GetMapping("/mapping/post")
  public String findPost() {
    return "get post";
  }

  @PostMapping("mapping/post")
  public String addPost() {
    return "add post";
  }

  @DeleteMapping("mapping/post")
  public String removePost() {
    return "remove Post";
  }

  @PutMapping("mapping/post")
  public String updatePost() {
    return "update Post";
  }

}

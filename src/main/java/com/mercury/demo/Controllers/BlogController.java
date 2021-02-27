package com.mercury.demo.Controllers;

import com.mercury.demo.models.Post;
import com.mercury.demo.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired    //необходимо длля переменной, ссылающейся на репозиторий
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blog(Model model){
        Iterable<Post> posts = postRepository.findAll();  //находим все записи таблицы
        model.addAttribute("posts", posts);
        return "blog-main";
    }
}

package br.net.benfatto.springjpa.controller;

import br.net.benfatto.springjpa.model.Post;
import br.net.benfatto.springjpa.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Murilo Oliveira
 */
@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // POST
    @PostMapping("")
    public Post create(@RequestBody Post post) {
        post.setTexto("Novo texto para o post");
        return post;
    }

    // GET
    @GetMapping("")
    public List<Post> findAll() {
        return this.postService.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Post findById(@PathVariable Long id) {
        return null;
    }

    // PUT
    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        return null;
    }

    // DELETE
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        return true;
    }

}

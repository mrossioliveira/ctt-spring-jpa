package br.net.benfatto.springjpa.controller;

import br.net.benfatto.springjpa.converter.PostConverter;
import br.net.benfatto.springjpa.dto.CreatePostDTO;
import br.net.benfatto.springjpa.dto.PostDTO;
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
    private final PostConverter postConverter;

    public PostController(PostService postService, PostConverter postConverter) {
        this.postService = postService;
        this.postConverter = postConverter;
    }

    // POST
    @PostMapping("")
    public PostDTO create(@RequestBody CreatePostDTO post) {
        // convertendo DTO pra Entity
        Post mappedPost = this.postConverter.convertToEntity(post);

        // convertendo Entity para DTO
        return this.postConverter.convertToDTO(this.postService.create(mappedPost));
    }

    // GET
    @GetMapping("")
    public List<Post> findAll() {
        return this.postService.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Post findById(@PathVariable Long id) {
        return this.postService.findById(id);
    }

    // PUT
    @PutMapping("/{id}")
    public Post update(@PathVariable Long id, @RequestBody Post post) {
        return this.postService.update(id, post);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.postService.delete(id);
    }

}

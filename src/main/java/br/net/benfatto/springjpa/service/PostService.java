package br.net.benfatto.springjpa.service;

import br.net.benfatto.springjpa.model.Post;
import br.net.benfatto.springjpa.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Murilo Oliveira
 */
@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return this.postRepository.findAll();
    }
}

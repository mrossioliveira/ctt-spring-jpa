package br.net.benfatto.springjpa.service;

import br.net.benfatto.springjpa.model.Post;
import br.net.benfatto.springjpa.repository.PostRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;
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

    public Post create(Post post) {
        post.setData(LocalDate.now());
        return this.postRepository.save(post);
    }

//    public Post findByIdOptional(Long id) {
//        Optional<Post> optionalPost = this.postRepository.findById(id);
//
//        if (optionalPost.isPresent()) {
//            return optionalPost.get();
//        } else {
//            throw new EntityNotFoundException("Post não existe");
//        }
//    }

    public Post findById(Long id) {
        return this.postRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(String.format("Post id %d não encontrado", id))
        );
    }

    public Post update(Long id, Post post) {
        Post foundPost = this.findById(id);
        foundPost.setTexto(post.getTexto());
        return this.postRepository.save(foundPost);
    }

    public void delete(Long id) {
        Post foundPost = this.findById(id);
        this.postRepository.delete(foundPost);
    }
}

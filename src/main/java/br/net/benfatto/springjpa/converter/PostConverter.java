package br.net.benfatto.springjpa.converter;

import br.net.benfatto.springjpa.dto.CreatePostDTO;
import br.net.benfatto.springjpa.dto.PostDTO;
import br.net.benfatto.springjpa.model.Post;
import org.springframework.stereotype.Component;

/**
 * @author Murilo Oliveira
 */
@Component
public class PostConverter {

    public Post convertToEntity(CreatePostDTO dto) {
        Post post = new Post();
        post.setTexto(dto.getPost());
        return post;
    }

    public PostDTO convertToDTO(Post post) {
        PostDTO dto = new PostDTO();
        dto.setId(post.getId());
        dto.setPost(post.getTexto());
        dto.setData(post.getData());
        return dto;
    }

}

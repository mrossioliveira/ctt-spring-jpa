package br.net.benfatto.springjpa.dto;

import br.net.benfatto.springjpa.model.Post;

/**
 * @author Murilo Oliveira
 */
public class CreatePostDTO {
    private String post;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

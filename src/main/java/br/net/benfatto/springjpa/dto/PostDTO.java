package br.net.benfatto.springjpa.dto;

import java.time.LocalDate;

/**
 * @author Murilo Oliveira
 */
public class PostDTO {
    private Long id;
    private String post;
    private LocalDate data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}

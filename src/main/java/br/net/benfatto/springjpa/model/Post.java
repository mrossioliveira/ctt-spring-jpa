package br.net.benfatto.springjpa.model;

import javax.persistence.*;

/**
 * @author Murilo Oliveira
 */
@Entity
@Table(name = Post.TABLE_NAME)
public class Post {
    public static final String TABLE_NAME = "post";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "texto")
    private String texto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

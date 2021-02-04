package br.net.benfatto.springjpa.model;

import javax.persistence.*;

/**
 * @author Murilo Oliveira
 */
@Entity
@Table(name = Comentario.TABLE_NAME)
public class Comentario {
    public static final String TABLE_NAME = "comentario";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comentario")
    private String comentario;

//    @ManyToOne()
//    @JoinColumn(name = "post_id", nullable = false)
//    private Post post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}

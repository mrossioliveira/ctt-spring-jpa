package br.net.benfatto.springjpa.repository;

import br.net.benfatto.springjpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Murilo Oliveira
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

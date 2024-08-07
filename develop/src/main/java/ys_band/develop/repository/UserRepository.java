package ys_band.develop.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ys_band.develop.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findByUsername(String username);

    //Optional<User> findByNickname(String nickname);



}
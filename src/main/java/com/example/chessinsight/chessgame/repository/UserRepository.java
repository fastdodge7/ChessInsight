package com.example.chessinsight.chessgame.repository;

import com.example.chessinsight.chessgame.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Long, User> {
    public Optional<User> findById(Long id);

    public Optional<User> findByEmail(String email);

    public List<Long> findAll();

    public User save(User user);

    public Long deleteById(Long id);

    public Long delete(User user);
}

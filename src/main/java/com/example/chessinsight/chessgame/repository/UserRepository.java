package com.example.chessinsight.chessgame.repository;

import com.example.chessinsight.chessgame.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findById(Long id);

    public Optional<User> findByEmail(String email);

    public List<User> findAll();

    public User save(User user);

    public void deleteById(Long id);

    public void delete(User user);

    @Query("DELETE FROM User WHERE deletionFlag = TRUE")
    public List<User> deleteAllBySoftDeleted(boolean softDeleted);
}

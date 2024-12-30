package com.example.chessinsight.chessgame.service;

import com.example.chessinsight.chessgame.domain.entity.User;
import com.example.chessinsight.chessgame.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Transactional
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public Long softDeleteUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        User target = user.orElseThrow(() -> new RuntimeException("User not found"));
        target.softDeletion();
        return target.getId();
    }

    @Transactional
    public Long deleteUser(User user) {
        userRepository.delete(user);
        return user.getId();
    }

    @Transactional
    public List<User> truncateDeletedData()
    {
        return userRepository.deleteAllBySoftDeleted(true);
    }
}

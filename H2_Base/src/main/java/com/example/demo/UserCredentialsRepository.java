package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials,Long> {
    Optional<UserCredentials> findByUsername(String name);
    Optional<UserCredentials> findByEmail(String email);

    @Query(value = "select u.id from UserCredentials u where u.username like ?1")
    Long findIdByUsername(String name);

    @Query(value = "select u.id from UserCredentials u where u.username like ?1")
    Long findIdByEmail(String email);
}

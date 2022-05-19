package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StatisticsRepository extends JpaRepository<Statistics,Long> {
    @Query("Select u.statistics from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    Optional<Statistics> findByUsername(String name);

    @Query("Select u.statistics.id from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    Optional<Statistics> findIdByUsername(String name);


    @Query("Select u.statistics from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    Optional<Statistics> findByEmail(String email);

    @Query("Select u.statistics.id from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    Optional<Statistics> findIdByEmail(String email);
}

package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRatesRepository extends JpaRepository<UserRate,Long> {
    @Query("Select u.statistics.userRate from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    Optional<UserRate> findByUsername(String name);

    @Query("Select u.statistics.userRate.id from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    Optional<UserRate> findIdByUsername(String name);


    @Query("Select u.statistics.userRate from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    Optional<UserRate> findByEmail(String email);

    @Query("Select u.statistics.userRate.id from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    Optional<UserRate> findIdByEmail(String email);
}

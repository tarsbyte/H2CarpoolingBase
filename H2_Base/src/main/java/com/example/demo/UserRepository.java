package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("Select u from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    Optional<UserCredentials> findByUsername(String name);

    @Query("Select u from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    Optional<UserCredentials> findByEmail(String email);


    @Query("Select u.reservations from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    LinkedList<Offer> getReservationsByUsername(String name);

    @Query("Select u.reservations from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    LinkedList<Offer> getReservationsByEmail(String name);


    @Query("Select u.id from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.username like ?1 ")
    Long findIdByUsername(String name);

    @Query("Select u.id from User u inner join UserCredentials uc on u.userCredentials.id = uc.id where uc.email like ?1 ")
    Long findIdByEmail(String email);

}

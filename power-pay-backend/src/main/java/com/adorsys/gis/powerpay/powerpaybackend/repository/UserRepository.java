package com.adorsys.gis.powerpay.powerpaybackend.repository;

import com.adorsys.gis.powerpay.powerpaybackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByPhoneNumber(String phoneNumber);
}

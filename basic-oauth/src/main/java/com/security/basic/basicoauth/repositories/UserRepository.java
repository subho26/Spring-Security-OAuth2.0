package com.security.basic.basicoauth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.security.basic.basicoauth.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);
}

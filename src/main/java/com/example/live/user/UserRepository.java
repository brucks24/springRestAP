package com.example.live.user;

import org.springframework.data.jpa.repository.JpaRepository;

@Respository
public interface UserRepository extends JpaRepository<User, Long>{

    
    
}

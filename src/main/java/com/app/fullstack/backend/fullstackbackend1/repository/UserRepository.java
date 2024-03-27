package com.app.fullstack.backend.fullstackbackend1.repository;

import com.app.fullstack.backend.fullstackbackend1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository< User,Long > {


}

package com.absjrdev.maxvendas.user.repository;

import com.absjrdev.maxvendas.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface UserRepository extends JpaRepository<User, Long> {

}

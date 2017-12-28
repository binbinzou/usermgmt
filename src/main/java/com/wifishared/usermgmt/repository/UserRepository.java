package com.wifishared.usermgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wifishared.usermgmt.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	User findByPhoneNumber(String phoneNumber);

}

package com.bridgelabz.greetingappdevelopment.Repository;

import com.bridgelabz.greetingappdevelopment.Model.Greeting;
import com.bridgelabz.greetingappdevelopment.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingAppRepository extends JpaRepository<User, Integer> {
}

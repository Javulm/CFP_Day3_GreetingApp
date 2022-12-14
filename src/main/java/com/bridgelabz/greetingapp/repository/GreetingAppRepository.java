package com.bridgelabz.greetingapp.repository;

import com.bridgelabz.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {
}

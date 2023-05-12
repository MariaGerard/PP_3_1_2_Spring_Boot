package ru.javamentor.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.springcourse.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

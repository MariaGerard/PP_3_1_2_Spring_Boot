package ru.javamentor.springcourse.dao;

import ru.javamentor.springcourse.model.User;

import java.util.List;

public interface UserDao {

void saveUser(User user);

User showById(int id);

void updateUser(int id, User user);

void removeUser(int id);

List<User> getAllUsers();
}

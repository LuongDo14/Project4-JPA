package ra.repository;

import ra.model.Categories;
import ra.model.User;

import java.util.List;
import java.util.Optional;

public interface CategoriesRepository {
    List<Categories> findAll();
    Categories findById(int catalogId);
//    List<User> findByName(String fullName);
//
//    Optional<User> login(User user);
//
//    boolean register(User user);
//
//    boolean update(User user);
//
//    boolean delete(int userId);
}
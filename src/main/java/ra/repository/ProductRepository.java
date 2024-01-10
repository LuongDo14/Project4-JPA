package ra.repository;

import ra.model.Product;
import ra.model.User;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> findAll();
//    User findById(int userId);
    boolean create(Product product);
//
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
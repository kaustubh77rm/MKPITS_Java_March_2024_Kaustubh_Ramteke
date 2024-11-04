package com.example.products_management.service;
import com.example.products_management.entity.User;
import java.util.List;
public interface UserService {

    User saveUser(User user);
    User findUserByEmail(String email);
    List<User> findAllCustomers();
    void assignRoleToUser(String email, String roleName);
    void updateCustomerProfile(User user);
    void deleteByEmail(String email);
}
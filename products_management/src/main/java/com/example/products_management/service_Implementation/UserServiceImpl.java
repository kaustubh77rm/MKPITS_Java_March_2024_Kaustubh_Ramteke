package com.example.products_management.service_Implementation;

import com.example.products_management.entity.Role;
import com.example.products_management.entity.User;
import com.example.products_management.entity.UserRole;
import com.example.products_management.repository.RoleRepository;
import com.example.products_management.repository.UserRepository;
import com.example.products_management.repository.UserRoleRepository;
import com.example.products_management.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    private final UserRoleRepository userRoleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public User saveUser(User user) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        user.setCreatedDate(now);
        user.setLastModifiedDate(now);
        User savedUser = userRepository.save(user);
        Role customerRole = roleRepository.findByRoleName("ROLE_CUSTOMER");

        if (customerRole != null) {
            UserRole userRole = new UserRole(savedUser.getId(), customerRole.getId());
            userRoleRepository.save(userRole);
        }
        return savedUser;
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmailWithRoles(email);
    }

    public List<User> findAllCustomers() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            Set<Role> roles = user.getRoles();
        }
        return users;
    }

    @Override
    @Transactional
    public void assignRoleToUser(String email, String roleName) {
        User user = findUserByEmail(email);
        if(user!=null){
            Role role = roleRepository.findByRoleName(roleName);
            if(role!=null){
                user.getRoles().add(role);
                userRepository.save(user);
            }
        }
    }

    @Override
    public void updateCustomerProfile(User user) {
        User existingUser = userRepository.findByEmailWithRoles(user.getEmail());
        if (existingUser != null) {
            existingUser.setFirstName(user.getFirstName());
            existingUser.setLastName(user.getLastName());
            existingUser.setCity(user.getCity());
            existingUser.setState(user.getState());
            existingUser.setCountry(user.getCountry());
            existingUser.setLastModifiedDate(new Timestamp(System.currentTimeMillis()));
            userRepository.save(existingUser);
        }
    }

//    @Override
//    public void deleteByEmail(String email) {
//        User UserToBeDeleted = userRepository.findByEmailWithRoles(email);
//        if (UserToBeDeleted != null) {
//            userRepository.delete(UserToBeDeleted);
//        }
//    }

    @Override
    public void deleteByEmail(String email) {
        User user = userRepository.findByEmailWithRoles(email);
        if (user != null) {
            userRepository.delete(user);
        }
    }
}
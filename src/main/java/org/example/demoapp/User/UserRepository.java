package org.example.demoapp.User;

import java.util.*;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    List<User> findAll();
    User update(User user);
    void delete(Long id);
}

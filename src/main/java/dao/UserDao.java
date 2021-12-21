package dao;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    public List<User> findAll();

    User findUserByUsername(String username);

    User findUserByCellPhone(String phone);

    User findUserById(Long id);
}
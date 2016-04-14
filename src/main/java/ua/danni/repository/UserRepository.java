package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.danni.entity.User;

@Component
public interface UserRepository  extends JpaRepository<User, Integer> {
}
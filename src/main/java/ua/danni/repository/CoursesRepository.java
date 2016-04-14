package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import ua.danni.entity.Courses;

@Component
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

       Courses findByName(String name);


}
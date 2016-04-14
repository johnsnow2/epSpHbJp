package ua.danni;

import ua.danni.entity.Courses;
import ua.danni.service.CoursesService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Artem on 13.04.2016.
 */
public class Main {
    private EntityManagerFactory emf;
    protected EntityManager em;
    private CoursesService coursesService;


    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    public void testSaveBank() throws Exception {
        Courses cs = new Courses();
        cs.setCourseName("lelkaaaa");
        cs.setIdCourses(1111);
        cs.setDuration(111);
        cs.setEnd("2222222");
        cs.setStart("34342");
        cs.setSubject("KEKKKKKK");
        coursesService.addCourses(cs);
    }

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");
        CoursesService coursesService;
        Courses cs = new Courses();
        cs.setCourseName("lelkaaaa");
        cs.setIdCourses(1111);
        cs.setDuration(111);
        cs.setEnd("2222222");
        cs.setStart("34342");
        cs.setSubject("KEKKKKKK");
      //  coursesService.addCourses(cs);
       // CoursesService cs = new CoursesService();


    }
}

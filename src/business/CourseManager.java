package business;

import Log.Logging;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logging[] loggings;

    private List<Course> courses = new ArrayList<>();

    public CourseManager(CourseDao courseDao, Logging[] loggings, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggings = loggings;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {

        priceAndNameCheck(course);
        courses.add(course);
        courseDao.add(course);


        for (Logging i : loggings) {
            i.log(course.getName());
        }

    }

    private void priceAndNameCheck(Course course) throws Exception {
        if (course.getPrice().intValue() <= 0) {
            throw new Exception("kurs ücreti 0 dan küçük olamaz");
        }

        for (Course i : courses) {
            if (i.getName().equals(course.getName())) {
                throw new Exception("birden fazla aynı isim bulunamaz");
            }
        }
    }


}

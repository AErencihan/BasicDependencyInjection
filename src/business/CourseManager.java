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

    public void add(Course course) throws Exception{

        for(Course i : courses){
                if(i.getName().equals(course.getName())){
                    throw new Exception("birden fazla aynı isim bulunamaz");
                }
        }

        courses.add(course);
        this.courseDao.add(courseDao);

        for (Logging i : loggings){
            i.log(course.getName());
        }



    }


}

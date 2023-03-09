import Log.FileLogger;
import Log.Logging;
import Log.MailLogger;
import business.CategoryManager;
import business.CourseManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import entities.Category;
import entities.Course;
import entities.Lecturer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {

        Logging[] loggers = {new FileLogger(), new MailLogger()};
        List<Category> categories = new ArrayList<>();
        List<Course> courses = new ArrayList<>();




        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
        Category category1 = new Category(5,"sayısal");
        Category category2 = new Category(6,"sözel");


        Lecturer lecturer = new Lecturer("Ayşe", "yilmaz" ,10);
        

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
        Course course1 = new Course(7, "matematik");



        categoryManager.add(category1);
        categoryManager.add(category2);


        courseManager.add(course1);










    }
}
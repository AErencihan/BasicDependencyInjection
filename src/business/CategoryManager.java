package business;

import Log.Logging;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class CategoryManager {
    private CategoryDao categoryDao;
    private Logging[] loggings;
    private List<Category> categories = new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao, Logging[] loggings, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggings = loggings;
        this.categories = categories;
    }


    public void add(Category category) throws Exception{

        for(Category i:categories) {
            if(Objects.equals(i.getName(), category.getName())) {
                throw new Exception("Bu isim mevcuttur");
            }

        }
        categories.add(category);
        categoryDao.add(category);



        for(Logging i:loggings) {
            i.log(category.getName());
        }

    }








}

package business;

import Log.Logging;
import dataAccess.LecturerDao;
import entities.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class LecturerManager {
    private LecturerDao lecturerDao;
    private Logging[] loggings;

    public LecturerManager(LecturerDao lecturerDao, Logging[] loggings) {
        this.lecturerDao = lecturerDao;
        this.loggings = loggings;
    }

}





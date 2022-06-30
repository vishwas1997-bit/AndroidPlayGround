package com.example.kotlindemo.RoomDatabaseDemo.viewmodel;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.kotlindemo.RoomDatabaseDemo.data.CourseModal;
import com.example.kotlindemo.RoomDatabaseDemo.data.CourseRepository;

import java.util.List;

public class ViewModal extends ViewModel {

    // creating a new variable for course repository.
    private CourseRepository repository;

    // below line is to create a variable for live
    // data where all the courses are present.
    private LiveData<List<CourseModal>> allCourses;

    // below method is use to insert the data to our repository.
    public void insert(CourseModal model) {
        repository.insert(model);
    }

    // below line is to update data in our repository.
    public void update(CourseModal model) {
        repository.update(model);
    }

    // below line is to delete the data in our repository.
    public void delete(CourseModal model) {
        repository.delete(model);
    }

    // below method is to delete all the courses in our list.
    public void deleteAllCourses() {
        repository.deleteAllCourses();
    }

    public void getCourse(Application application){
        repository = new CourseRepository(application);
        allCourses = repository.getAllCourses();
    }

    // below method is to get all the courses in our list.
    public LiveData<List<CourseModal>> getAllCourses() {
        return allCourses;
    }
}

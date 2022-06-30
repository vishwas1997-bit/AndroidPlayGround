package com.example.kotlindemo.RoomDatabaseDemo.data;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
public class CourseDatabaseTest extends TestCase {

    CourseDatabase database;
    Context context;
    Dao dao;
    List<CourseModal> finalList = new ArrayList<>();

    @Before
    public void initDb(){
        context = ApplicationProvider.getApplicationContext();
        database = Room.inMemoryDatabaseBuilder(context,CourseDatabase.class).build();
        dao = database.Dao();
    }

    @After
    public void closeDb(){
        database.close();
    }

    @Test
    public void writeAndReadDb() throws Exception{
        CourseModal courseModal = new CourseModal("BA","kuch Nhi","3 years");
        dao.insert(courseModal);
//        List<CourseModal> list = new ArrayList<>();
//        list.add(courseModal);
        finalList.clear();
        finalList = dao.getAllCoursesList();
        assertEquals(finalList.get(0),courseModal);
    }
}
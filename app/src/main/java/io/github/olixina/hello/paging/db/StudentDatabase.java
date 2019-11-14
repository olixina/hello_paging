package io.github.olixina.hello.paging.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import io.github.olixina.hello.paging.dao.StudentDao;
import io.github.olixina.hello.paging.entity.Student;

@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class StudentDatabase extends RoomDatabase {
    private static StudentDatabase instance;
    public static StudentDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, StudentDatabase.class, "student_database").build();
        }
        return instance;
    }

    public abstract StudentDao getStudentDao();
}

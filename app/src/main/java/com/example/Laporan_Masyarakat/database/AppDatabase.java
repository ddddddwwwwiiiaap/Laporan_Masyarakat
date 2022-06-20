package com.example.Laporan_Masyarakat.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.Laporan_Masyarakat.dao.DatabaseDao;
import com.example.Laporan_Masyarakat.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}

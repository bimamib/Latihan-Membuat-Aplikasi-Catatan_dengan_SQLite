package com.bima.mynotesapp.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.bima.mynotesapp.db.DatabaseContract.NoteColumns.Companion.TABLE_NAME

class NoteHelper(context: Context) {
    private var databaseHelper: DatabaseHelper = DatabaseHelper(Context)
    private lateinit var database: SQLiteDatabase

    companion object {
        private const val DATABASE_TABLE = TABLE_NAME
    }
}
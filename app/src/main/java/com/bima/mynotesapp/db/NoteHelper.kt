package com.bima.mynotesapp.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.bima.mynotesapp.db.DatabaseContract.NoteColumns.Companion.TABLE_NAME

class NoteHelper(context: Context) {
    private var databaseHelper: DatabaseHelper = DatabaseHelper(context)
    private lateinit var database: SQLiteDatabase

    companion object {
        private const val DATABASE_TABLE = TABLE_NAME

        private var INSTANCE: NoteHelper? = null
        fun getInstance(context: Context): NoteHelper =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: NoteHelper(context)
            }
    }
}
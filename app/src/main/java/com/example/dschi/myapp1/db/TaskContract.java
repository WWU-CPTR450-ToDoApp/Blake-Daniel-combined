package com.example.dschi.myapp1.db;

import android.provider.BaseColumns;

/**
 * Created by Blake on 11/4/2016.
 */

public class TaskContract {
    public static final String DB_NAME = "com.example.blake.blakestodolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}

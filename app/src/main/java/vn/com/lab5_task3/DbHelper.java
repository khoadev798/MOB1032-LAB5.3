package vn.com.lab5_task3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import vn.com.lab5_task3.DAO.ProductDAO;

public class DbHelper extends SQLiteOpenHelper {
    public static final String DB_name = "ProductManage";
    public static final int DB_version = 1;
    public DbHelper(Context context){super(context,DB_name,null, DB_version);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ProductDAO.CREATE_TABLE_PRODUCTS);
        db.execSQL(ProductDAO.CREATE_TABLE1_PC);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

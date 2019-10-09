package vn.com.lab5_task3.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import vn.com.lab5_task3.Products;

public class ProductDAO {
    public static final String TABLE_NAME = "products";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_PC = "pc_name";
    public static final String CREATE_TABLE_PRODUCTS =
            "CREATE TABLE products(" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name VARCHAR NOT NULL," +
                    "pc_name VARCHAR NOT NULL," +
                    "FOREIGN KEY (pc_name) REFERENCES product_categories(pc_name)" +
                    ")";
    public static final String DROP_TABLE_PRODUCTS = "DROP TABLE IF EXIST" + TABLE_NAME;
    private SQLiteDatabase db;
    public static final String TABLE_NAME1 = "product_categories";
    public static final String COLUMN_NAME1_NAME = "pc_name";
    public static final String CREATE_TABLE1_PC =
            "CREATE TABLE product_categories( " +
                    "pc_name VARCHAR PRIMARY KEY" +
                    ")";
    public static final String DROP_TABLE1_PRODUCT_CATEGORIES = "DROP TABLE IF EXIST" + TABLE_NAME;

    public ProductDAO(SQLiteDatabase db) {
        this.db = db;
    }

    public long insert(Products product) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME_NAME, product.getName());
        values.put(COLUMN_NAME_PC,product.getCategory());
        return db.insert(TABLE_NAME, null, values);
    }

}

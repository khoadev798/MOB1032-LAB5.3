package vn.com.lab5_task3.DAO;

public class pcDAO  {
    public static final String TABLE_NAME ="product_pategories";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String CREATE_TABLE_PC =
            "CREATE TABLE product_categories( " +
                    ",name VARCHAR PRIMARY KEY" +
                    ")";
    public static final String DROP_TABLE_PRODUCT_CATEGORIES = "DROP TABLE IF EXIST"+TABLE_NAME;
}

package vn.com.lab5_task3;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import vn.com.lab5_task3.DAO.ProductDAO;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String Tag="Check";
        DbHelper dbHelper = new DbHelper(getApplicationContext());
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        Log.d(Tag, ""+db.getVersion());
        ProductDAO productDAO = new ProductDAO(dbHelper.getWritableDatabase());

        Products a1 = new Products("AirBlade","Motorbike");
        Products a2 = new Products("Winner","Motorbike");
        productDAO.insert(a1);
        productDAO.insert(a2);
    }
}

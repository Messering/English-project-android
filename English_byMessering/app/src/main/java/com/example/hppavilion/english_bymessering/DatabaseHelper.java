//package com.example.hppavilion.english_bymessering;

/**
 * Created by HP PAVILION on 03.07.2015.
 */
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.sql.SQLException;

//public class DatabaseHelper extends SQLiteOpenHelper {

   /* private static String DB_PATH = "/data/data/com.example.eugene.sqlitedbapp/databases/";
    private static String DB_NAME = "cityinfo";
    private static final int SCHEMA = 1; // ������ ���� ������
    static final String TABLE = "users";

   public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_YEAR = "year";
    public SQLiteDatabase database;
    private Context myContext;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, SCHEMA);
        this.myContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) {

    }

    public void create_db(){
        InputStream myInput = null;
        OutputStream myOutput = null;
        try {
            File file = new File(DB_PATH + DB_NAME);
            if (!file.exists()) {
                this.getReadableDatabase();
                //�������� ��������� �� ��� �����
                myInput = myContext.getAssets().open(DB_NAME);
                // ���� � ����� ��
                String outFileName = DB_PATH + DB_NAME;

                // ��������� ������ ��
                myOutput = new FileOutputStream(outFileName);

                // ��������� �������� ������
                byte[] buffer = new byte[1024];
                int length;
                while ((length = myInput.read(buffer)) > 0) {
                    myOutput.write(buffer, 0, length);
                }

                myOutput.flush();
                myOutput.close();
                myInput.close();
            }
        }
        catch(IOException ex){

        }
    }
    public void open() throws SQLException {
        String path = DB_PATH + DB_NAME;
        database = SQLiteDatabase.openDatabase(path, null,
                SQLiteDatabase.OPEN_READWRITE);

    }

    @Override
    public synchronized void close() {
        if (database != null) {
            database.close();
        }
        super.close();
    }
}
*/
package taweesak.com.myappsqlitedatabase.MyData;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBAdapter {

    Context context;
    SQLiteDatabase db;
    DBHelper helper;

    public DBAdapter(Context ctx)
    {
        this.context=ctx;
        helper=new DBHelper(context);
    }

    //OPEN DB
    public DBAdapter openDB()
    {
        try
        {
            db=helper.getWritableDatabase();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return this;
    }

    //CLOSE
    public void close()
    {
        try
        {
            helper.close();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    //INSERT DATA TO DB
    public long add(String noti,String title,String content,String month,String day,String hour,String minute)
    {
        try
        {
            ContentValues cv=new ContentValues();
            cv.put(Constants.NOTI,noti);
            cv.put(Constants.TITLE,title);
            cv.put(Constants.CONTENT,content);
            cv.put(Constants.MONTH,month);
            cv.put(Constants.DAY,day);
            cv.put(Constants.HOUR,hour);
            cv.put(Constants.MINUTE,minute);

            return db.insert(Constants.TB_NAME,Constants.ROW_ID,cv);


        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return 0;
    }

    //RETRIEVE ALL PLAYERS
    public Cursor getAllPlayers()
    {
        String[] columns={Constants.ROW_ID,Constants.NOTI,Constants.TITLE,Constants.CONTENT,
                Constants.MONTH,Constants.DAY,Constants.HOUR,Constants.MINUTE,};

        return db.query(Constants.TB_NAME,columns,null,null,null,null,null);
    }

    //UPDATE
    public long UPDATE(int id,String noti,String title,String content,String month,String day,String hour,String minute)
    {
        try
        {
            ContentValues cv=new ContentValues();
            cv.put(Constants.NOTI,noti);
            cv.put(Constants.TITLE,title);
            cv.put(Constants.CONTENT,content);
            cv.put(Constants.MONTH,month);
            cv.put(Constants.DAY,day);
            cv.put(Constants.HOUR,hour);
            cv.put(Constants.MINUTE,minute);

            return db.update(Constants.TB_NAME,cv,Constants.ROW_ID+" =?",new String[]{String.valueOf(id)});

        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return 0;
    }

    //DELETE
    public long Delete(int id)
    {
        try
        {

            return db.delete(Constants.TB_NAME,Constants.ROW_ID+" =?",new String[]{String.valueOf(id)});

        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        return 0;
    }

}

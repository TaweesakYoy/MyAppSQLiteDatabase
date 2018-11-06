package taweesak.com.myappsqlitedatabase.MyData;

public class Constants {

    //COLUMNS
    static final String ROW_ID="id";
    static final String NOTI = "noti";
    static final String TITLE = "title";
    static final String CONTENT = "content";
    static final String MONTH = "month";
    static final String DAY = "day";
    static final String HOUR = "hour";
    static final String MINUTE = "minute";


    //DB PROPERTIES
    static final String DB_NAME="noti_DB";
    static final String TB_NAME="noti_TB";
    static final int DB_VERSION='1';
    //CREATE TABLE
    static final String CREATE_TB="CREATE TABLE noti_TB(id INTEGER PRIMARY KEY AUTOINCREMENT,"
            + "noti TEXT,title TEXT,content TEXT,month TEXT,day TEXT,hour TEXT,minute TEXT);";


}

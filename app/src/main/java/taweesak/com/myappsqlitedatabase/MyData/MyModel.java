package taweesak.com.myappsqlitedatabase.MyData;

public class MyModel {

    private String Title;
    private String Content;
    private int ID;
    private String Noti;
    private String Month;
    private String Day;
    private String Hour;
    private String Minute;


    public MyModel(String title, String content, int ID, String noti, String month, String day, String hour, String minute) {
        Title = title;
        Content = content;
        this.ID = ID;
        Noti = noti;
        Month = month;
        Day = day;
        Hour = hour;
        Minute = minute;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNoti() {
        return Noti;
    }

    public void setNoti(String noti) {
        Noti = noti;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public String getMinute() {
        return Minute;
    }

    public void setMinute(String minute) {
        Minute = minute;
    }
}

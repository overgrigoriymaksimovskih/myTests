package PatternAdapter.Adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
//        DataBase db = null;
        DataBase db = new AdapterJavaToDataBase();

        db.insert();
        db.update();
        db.select();
        db.remove();
    }
}

package File;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //получаем список файлов в директории
        File folder = new File("D:\\projects\\0000\\MyTests\\src\\File\\ListOfFiles");
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getParent());
        }
        //получаем список файлов в директории
        List<String> list = getCurrentDirectoryFiles();
        for (String a : list){
            System.out.println(a);
        }
    }

    //метод получения списка файлов в директории
    private static List getCurrentDirectoryFiles(){
        List<String> list = new ArrayList<String>();
        File originalFile = new File("D:\\projects\\0000\\MyTests\\src\\File\\Main.java");

        //объект-директория
        File folder = originalFile.getParentFile();

        //печать списка файлов на экран
        for (File file : folder.listFiles())
        {
            list.add(file.getName());
        }
        return list;
    }
}

/*
В классе Main были созданы дирректории и файлы с помощью класса File, а также была произведена запись в файл
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder();

    static List<String> listDirectory = new ArrayList<>();

    static List<String> listFiles = new ArrayList<>();

    public static void main(String[] args) {
        listDirectory.add("I://Games//src");
        listDirectory.add("I://Games//res");
        listDirectory.add("I://Games//savegames");
        listDirectory.add("I://Games//temp");
        listDirectory.add("I://Games//src//main");
        listDirectory.add("I://Games//src//test");
        listDirectory.add("I://Games//res//drawables");
        listDirectory.add("I://Games//res//vectors");
        listDirectory.add("I://Games//res//icons");

        for (String s : listDirectory) {
            newDirectory(s);
        }

        listFiles.add("I://Games//src//main//Main.java");
        listFiles.add("I://Games//src//main//Utils.java");
        listFiles.add("I://Games//temp//temp.txt");

        for (String s : listFiles) {
            newFile(s);
        }

        writeFile("I://Games//temp//temp.txt");
    }

    public static void newDirectory(String path) {
        File dir = new File(path);
        if (dir.mkdir()) {
            infoDirectory();
        }
    }

    public static void newFile(String path) {
        File File = new File(path);
        try {
            if (File.createNewFile()) {
                infoFile();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeFile(String path) {
        try (FileWriter writer = new FileWriter(path, false)) {
            writer.write(String.valueOf(stringBuilder));

            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void infoDirectory() {
        System.out.println("Дирректория создана");
        System.out.println();
        stringBuilder.append("Дирректория создана");
        stringBuilder.append("\n");
    }

    public static void infoFile() {
        System.out.println("Файл был создан");
        System.out.println();
        stringBuilder.append("Файл был создан");
        stringBuilder.append("\n");
    }
}

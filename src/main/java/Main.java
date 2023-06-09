import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        File dirGames = new File("I://Games");


        File dirSrc = new File("I://Games//src");
        if (dirSrc.mkdir()){
            infoDirectory();
        }

        File dirRes = new File("I://Games//res");
        if (dirRes.mkdir()){
            infoDirectory();
        }

        File dirSavegames = new File("I://Games//savegames");
        if (dirSavegames.mkdir()){
            infoDirectory();
        }

        File dirTemp = new File("I://Games//temp");
        if (dirTemp.mkdir()){
            infoDirectory();
        }

        File dirSrcMain = new File("I://Games//src//main");
        if (dirSrcMain.mkdir()){
            infoDirectory();
        }

        File dirSrcTest = new File("I://Games//src//test");
        if (dirSrcTest.mkdir()){
            infoDirectory();
        }

        File dirResDrawables = new File("I://Games//res//drawables");
        if (dirResDrawables.mkdir()){
            infoDirectory();
        }

        File dirResVectors = new File("I://Games//res//vectors");
        if (dirResVectors.mkdir()){
            infoDirectory();
        }

        File dirResIcons = new File("I://Games//res//icons");
        if (dirResIcons.mkdir()){
            infoDirectory();
        }

        File dirSrcMainFile = new File("I://Games//src//main//Main.java");
        try {
            if (dirSrcMainFile.createNewFile()) {
                infoFile();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        File dirSrcMainUtilsFile = new File("I://Games//src//main//Utils.java");
        try {
            if (dirSrcMainUtilsFile.createNewFile()) {
                infoFile();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dirTempFile = new File("I://Games//temp//temp.txt");
        try {
            if (dirTempFile.createNewFile()){
                infoFile();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("I://Games//temp//temp.txt", false))
        {
            writer.write(String.valueOf(stringBuilder));

            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void infoDirectory(){
        System.out.println("Дирректория создана");
        System.out.println();
        stringBuilder.append("Дирректория создана");
        stringBuilder.append("\n");
    }

    public static void infoFile(){
        System.out.println("Файл был создан");
        System.out.println();
        stringBuilder.append("Файл был создан");
        stringBuilder.append("\n");
    }
}

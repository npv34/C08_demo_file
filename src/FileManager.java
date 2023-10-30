package src;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileManager {
    public String path;
    public FileManager(String path) {
        this.path = path;
    }

    public void showLineFile() throws FileNotFoundException {
        try {
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeDataToFile(String data) throws IOException {
        try {
            String dataToFile = getDataToFile();

            dataToFile += data;

            FileWriter fileWriter = new FileWriter(this.path);
            BufferedWriter fw = new BufferedWriter(fileWriter);
            fw.write(dataToFile);
            fw.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getDataToFile() throws FileNotFoundException {
        StringBuilder dataToFile = new StringBuilder();
        File file = new File(this.path);
        if (!file.exists()) {
            throw new FileNotFoundException("File " + this.path + "not found");
        }
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            dataToFile.append(sc.nextLine()).append("\n");
        }
        return dataToFile.toString();
    }


}

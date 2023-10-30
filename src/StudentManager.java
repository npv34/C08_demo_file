package src;

import java.io.IOException;
import java.util.Scanner;

public class StudentManager {

    public void addStudent(FileManager fm, Scanner scanner) throws IOException {
        String info = "";
        System.out.println("Nhap id: ");
        String id = scanner.nextLine();
        info += id + ",";
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        info += name + ",";
        System.out.println("Nhap age: ");
        String age = scanner.nextLine();
        info += age;
        fm.writeDataToFile(info);
    }


}

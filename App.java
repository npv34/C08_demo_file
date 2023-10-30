import src.FileManager;
import src.StudentManager;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        FileManager fm = new FileManager("./data.txt");
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1: Them sinh vien: ");
            System.out.println("2: Hien thi danh sach sinh vien: ");
            System.out.println("3: Cap nhat thong tin sinh vien: ");
            System.out.println("4: Exit: ");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    studentManager.addStudent(fm, scanner);
                    break;
                case "2":
                    fm.showLineFile();
                    break;

                case "4":
                    return;
            }

        }

    }

}

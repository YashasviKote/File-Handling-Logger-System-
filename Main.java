import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            LoggerService logger = new LoggerService();

            while (true) {

                System.out.println("\n1. Write Log");
                System.out.println("2. Read Logs");
                System.out.println("3. Exit");

                System.out.print("Choose option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1 ->{
                        System.out.print("Enter log message: ");
                        String message = sc.nextLine();
                        logger.writeLog(message);
                        break;
                    }

                    case 2->{
                        logger.readLogs();
                        break;}

                    case 3->{
                        return;
                    }

                    default->{
                        System.out.println("Invalid option.");
                    }
                }
            }
        }
    }
}
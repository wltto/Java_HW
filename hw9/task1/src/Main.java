import java.io.*;

public class Main {
    public static void main(String[] args) {

        String pathToFile = "/Users/violettayurchenko/IdeaProjects/hw9/task1/src/files";
        String resultFile = "result.txt";


        File inputDirectory = new File(pathToFile);
        File[] files = inputDirectory.listFiles();

        if (files != null) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile))) {
                for (File file : files) {
                    if (file.isFile()) {
                        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = reader.readLine()) != null) {
                                writer.write(line + " ");
                            }
                        }
                    }
                }
                System.out.println("Копирование завершено");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("файлы отсутствуют");
        }
    }
}
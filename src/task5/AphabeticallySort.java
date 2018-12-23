package task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class AphabeticallySort {

    public static final String FILE_EN = "alphabet_en.txt";
    public static final String FILE_UA = "alphabet_ua.txt";
    public static final String FILE_RU = "alphabet_ru.txt";
    public static void main(String[] args){
        try {
            System.out.println("--------------------UK----------------------------\n");
            sortFile(FILE_EN);
            System.out.println("--------------------UA----------------------------\n");
            sortFile(FILE_UA);
            System.out.println("--------------------RU----------------------------\n");
            sortFile(FILE_RU);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sortFile(String file ) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();

        Collections.sort(lines, String::compareTo);
        lines.stream().forEach(System.out::println);
    }
}

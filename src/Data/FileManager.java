package Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public List<String> loadDataFromFile(String filePath) {
        List<String> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Thêm từng dòng vào danh sách
                data.add(line); 
                
            }
        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
        }
        return data;
    }

    public void saveDataToFile(String filePath, List<String> data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, false))) {
            for (String line : data) {
                // Ghi từng dòng vào tệp
                bw.write(line); 
                
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving data to file: " + e.getMessage());
        }
    }
}

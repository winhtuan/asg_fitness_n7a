package Repository;

import java.util.List;

public interface Repository {
    List<String> loadDataFromFile(String filePath);
    void saveDataToFile(String filePath, List<String> data);
}

/**
 *   CONTACT MANAGER
 *
 *   Description: Manages CRUD data between application and data file
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactsManager {

    // F
    private String filename;
    private String directory;

    private List<String> fileData;

    private Path directoryPath;
    private Path filePath;

    // CON
    public ContactsManager(String filename, String directory) {
        this.filename = filename;
        this.directory = directory;

        // PATHS FOR DIR AND FILES
        this.directoryPath = Paths.get(directory);
        this.filePath = Paths.get(directory, filename);

        this.fileData = getFile();
    }

    // METHS
    // Part of CON
    private List<String> getFile(){

        // Checks dir exist
        try {
            if(Files.notExists(directoryPath)) Files.createDirectories(directoryPath);
        } catch (IOException e) {
            System.out.println("Error creating directories " + directoryPath.getFileName());
            e.printStackTrace();
        }

        // Checks file exist
        try {
            if (Files.notExists(filePath)) Files.createFile(filePath);
        } catch (IOException e){
            System.out.println("Error creating files " + filePath.getFileName());
        }

        // If not, created
        List<String> data = null;
        try {
            data = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error reading files " + filePath.getFileName());
            e.printStackTrace();
        }
        return data;
    }

    // Create
    public boolean writeFile() {

        try {
            Files.write(filePath, fileData);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filename);
            return false;
        }
        return true;
    }

    public List<String> addLines(String string) {
        fileData.add(string);
        writeFile();
        return fileData;
    }

    // Read All Lines
    public void printLines() {
        for (String line : fileData) {
            System.out.println(line);
        }
    }

    // Read Line


    // Update


    // Delete








}  //  <--END

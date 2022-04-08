
//read from contacts file
//add contacts to contacts file
//delete a contact from contacts files

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
    // Returns the file data
    public List<String> getFile(){

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

        // If not created
        List<String> data = null;

        try {
            data = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error reading files " + filePath.getFileName());
            e.printStackTrace();
        }

        return data;

    }

    // Way to print all the lines of the file so we can see its contents quickly
    public void printLines() {
        for (String line : fileData) {
            System.out.println(line);
        }
    }









}  //  <--END

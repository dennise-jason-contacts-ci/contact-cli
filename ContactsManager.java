/**
 *   CONTACT MANAGER
 *
 *   Description: Manages CRUD data between application and data file
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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


    // GETS
    private String getFilename() {
        return filename;
    }
    private String getDirectory() {
        return directory;
    }
    public List<String> getFileData() {
        return fileData;
    }
    private Path getDirectoryPath() {
        return directoryPath;
    }
    private Path getFilePath() {
        return filePath;
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

    // Write
    public boolean writeFile() {
        try {
            Files.write(filePath, fileData);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filename);
            return false;
        }
        return true;
    }

    // Add
    public List<String> addLines(String string) {
        fileData.add(string);
        writeFile();
        return fileData;
    }

    // Read
    public void printLines() {
        for (String line : fileData) {
            System.out.println(line);
        }
    }


    // Delete
    public List<String> deleteLine(String delString){
        for(String line : fileData){
            if (line.equals(delString)){
                System.out.println("Found the Contact...");
                fileData.remove(delString);
                writeFile();
                System.out.println("Deleted Contact: " +
                        delString.substring(0, delString.indexOf("|")));
                System.out.println("\n<---------------------------------------------->\n");
                return fileData;
            }
        }
        System.out.println("Error, unable to Delete.");
        System.out.println("\n<---------------------------------------------->\n");
        return fileData;
    }

    // Mod (update)
    public List<String> modLine(String modLine, String changedLine){
        for(String line : fileData){
            if (line.equals(modLine)){
                fileData.remove(modLine);
                fileData.add(changedLine);
                writeFile();
                System.out.println("Modified Contact: " +
                        modLine.substring(0, modLine.indexOf("|")));
                System.out.println("\n<---------------------------------------------->\n");
                return fileData;
            }
        }
        System.out.println("Error, unable to change contact.");
        System.out.println("\n<---------------------------------------------->\n");
        return fileData;
    }








}  //  <--END

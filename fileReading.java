import java.io.*;
import java.nio.file.Files;

public class fileReading {

    private static void displayFilePath(String fileLoc) throws IOException {
        File file = new File(fileLoc);
        System.out.println("Source Location: " + file.getPath());

    }

    private static void copyText(String fileLoc) throws IOException {
        File sourceFile = new File("D:\\ZSM Vidhya\\src\\FileReading.java");
        File destinationFile = new File("C:\\Users\\vidhi\\Desktop\\CopyofFileReading.txt");
        Files.copy(sourceFile.toPath(), destinationFile.toPath());
        System.out.println("Text copied from Source Location to respective Destination Location");
        System.out.println("Destination Location : " + destinationFile.toPath());

    }

    private static void lineCount(String fileLoc) throws IOException {
        long lineNo = 0;
        BufferedReader reader = new BufferedReader(new FileReader(fileLoc));
        while (reader.readLine() != null)
            lineNo++;
        System.out.println("Number Of Lines in File " + lineNo);

    }

    private static void characterCount(String fileLoc) throws IOException {
        FileInputStream fileReader = new FileInputStream(fileLoc);
        int charNo = 0;
        while (fileReader.read() != -1) {
            if ((char) fileReader.read() == ' ' && (char) fileReader.read() == '\n') {
                fileReader.read();
                continue;
            } else {
                charNo++;
                fileReader.read();
            }
        }
        System.out.println("No. of Characters in the file " + charNo);
    }

    private static void wordCount(String fileLoc) throws IOException {
        FileInputStream fileRead = new FileInputStream(fileLoc);
        fileRead.read();
        int wordNo = 0;
        while (fileRead.read() != -1) {
            if ((char) fileRead.read() == ' ' || (char) fileRead.read() == '\n') {
                wordNo++;
                fileRead.read();
            }
        }
        System.out.println("No. of Words in the file " + wordNo);
    }

    public static void main(String[] args) throws IOException {

        String fileLoc = "D:\\ZSM Vidhya\\src\\FileReading.java";
        displayFilePath(fileLoc);
        copyText(fileLoc);
        lineCount(fileLoc);
        wordCount(fileLoc);
        characterCount(fileLoc);
    }
}

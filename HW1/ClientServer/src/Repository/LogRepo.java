package Repository;

import java.io.*;
import java.util.List;

public class LogRepo{
    private static File logFile = new File("history.csv");


    public static List<String> Read() throws IOException {
        BufferedReader fileStream = new BufferedReader(new FileReader(logFile));
        List<String> lines = (fileStream.lines().toList());
        fileStream.close();
        return lines;
    }


    public static void Write(String argLine)  throws IOException {
        if (! logFile.exists()) {
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        BufferedReader tempReader = new BufferedReader(new FileReader(logFile));
        List<String> lines = (tempReader.lines().toList());
        BufferedWriter fileStream = new BufferedWriter(new FileWriter(logFile));
        for (String line : lines) {
            fileStream.append(line);
            fileStream.newLine();
        }
        fileStream.write(argLine);
        fileStream.newLine();
        fileStream.flush();
        fileStream.close();
        tempReader.close();
    }
}

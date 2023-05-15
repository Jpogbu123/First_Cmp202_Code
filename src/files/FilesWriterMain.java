package files;

import java.io.*;
//import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class FilesWriterMain {

    public static void main(String[] args) throws IOException {

        FilesWriterMain myobj = new FilesWriterMain();
        myobj.writeData("hello");
        myobj.readFromFile();
        myobj.appendData("");
    }
public void appendData (String data) throws IOException {
        File myFile =new File("test.txt");
        FileWriter fileWriter = new FileWriter(myFile);
        BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        printWriter.print(data);
        printWriter.println("More Money More problems");
        printWriter.println("More Money More problems");

        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();

}
    public void writeData(String data) {

        try {

            File myFile = new File("test.txt");

            FileWriter writeToFile = new FileWriter(myFile);
            writeToFile.write(data);
            writeToFile.append("More Text");


            writeToFile.flush();
            writeToFile.close();

        } catch (IOException e) {
            System.out.println("Can not write to this file");
            //throw new RuntimeException(e);
        }

    }
        public void readFromFile(){
            File myFile = new File("test.txt");
            try {
                Scanner myReader = new Scanner(myFile);
                while (myReader.hasNext()) {
                    String dataInFile = myReader.nextLine();
                    System.out.println(dataInFile);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File does not exist");
            }
            }


    }

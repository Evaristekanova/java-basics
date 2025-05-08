import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileSystem {
    public void writeDateInFile(){
        String data = "This is message is going to be written in the external file";
        try(FileOutputStream fos = new FileOutputStream("src/main/first.txt")) {
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.flush();
            System.out.println("File written successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

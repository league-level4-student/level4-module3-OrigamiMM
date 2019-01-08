import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class cat {
public static void main(String[] args) {
	
}
public static void cat(File file) {
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    } catch(Exception e){
    	e.printStackTrace();
    }finally {
        if (input != null) {
            try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
}

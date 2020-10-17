import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class BasicCreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}


/* The process of creating a file in said directory.
As this is just basic syntax. I am hoping to find a way to utalize it better.


*/

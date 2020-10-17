import java.io.File;  // Import the File class

public class BasicDeleteFile {
  public static void main(String[] args) { 
    File myObj = new File("filename.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}



/* The process of creating a file in said directory.
As this is just basic syntax. I am hoping to find a way to utalize it better.


*/

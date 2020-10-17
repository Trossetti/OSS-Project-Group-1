import java.io.File; 

public class BasicDeleteFolder {
  public static void main(String[] args) { 
    File myObj = new File("C:\\Users\\MyName\\Test"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    } 
  } 
}


/* The process of creating a file in said directory.
As this is just basic syntax. I am hoping to find a way to utalize it better.


*/

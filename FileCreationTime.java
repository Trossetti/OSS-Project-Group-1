import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class FileCreationTime {


public static FileTime getCreationTime(File file) throws IOException {

	Path p = Paths.get(file.getAbsolutePath());
	BasicFileAttributes view = Files.getFileAttributeView(p, BasicFileAttributeView.class)
			.readAttributes();
	FileTime fileTime=view.creationTime();
	
// also available view.lastAccessTine and view.lastModifiedTime

	return fileTime;
}
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Filetest.txt");
	System.out.println(file + " creation time :" + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
			.format(FileCreationTime.getCreationTime(file).toMillis()));
	Instant instantLastmodified = Instant.ofEpochMilli(file.lastModified());
	LocalDateTime dateTimeLastModified = LocalDateTime.ofInstant(instantLastmodified, ZoneId.systemDefault());
	System.out.println("Last acces = " + dateTimeLastModified);
	System.out.println("Absolute path = " + file.getAbsolutePath());
	System.out.println("Name = " + file.getName());
	System.out.println("Lenght = " + file.length() + " Bytes");
	
	File newDirectory = new File("C:\\User");
	try {
		if(!newDirectory.exists())
		{
			newDirectory.mkdir();
			System.out.println("Created a directory called " + newDirectory.getName());
			}
		else
		{
			System.out.println("Directory called " + newDirectory.getName() + " already exists.");
			}
 
	} catch (Exception e) {
		System.out.println("Couldn't create a directory called " + newDirectory.getName());
		}try{
			File afile =new File("C:\\User\\Image.jpg");
			if(afile.renameTo(new File("C:\\test\\" + afile.getName()))){
				System.out.println("File is moved successful!");
				}else{
					System.out.println("File is failed to move!");
					}
			}catch(Exception e){
				e.printStackTrace();
				}
		File oldfile = new File("C:\\User\\File1.txt");
		File newfile = new File("C:\\User\\File2.txt");
		
		if(!oldfile.exists())
		{
			System.out.println("File doesn't exists!");
			return;
			}
		if(newfile.exists())
		{
			System.out.println("File with desired name already exists!");
			return;
			}
		if (oldfile.renameTo(newfile)) {System.out.println("Rename succesful");
		} else {
			System.out.println("Rename failed");
			}
		}
}

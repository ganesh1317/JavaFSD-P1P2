//FILE HANDLING PROJECT

package FileHandling;

import java.io.*;

public class FileHandlingProject {

	public static void main(String[] args) {
		
		        // Creating a new file Myfile.txt
        File F = new File("C:\\Users\\hp\\Desktop\\Myfile.txt");
        try {
        	if (F.createNewFile()) 
        	{
        		System.out.println("File created: " + F.getName());
		    } else {
		   		System.out.println("File already exists.");
		    		}
        } catch (IOException i ) {
        	System.out.println("IOException ");
		        }
        
        		// Checking if a file Details Myfile.txt
        File existingFile = new File("C:\\Users\\hp\\Desktop\\Myfile.txt");
        if (existingFile.exists()) {
            System.out.println("File Name: " + existingFile.getName());
            System.out.println("File Location: " + existingFile.getAbsolutePath());
            System.out.println("File Writable: " + existingFile.canWrite());
            System.out.println("File Readable: " + existingFile.canRead());
            System.out.println("File Size: " + existingFile.length());    
        } else {
            System.out.println("File does not exist.");
        }
        
        		//Writing into Files
		try {
		BufferedWriter WrItE = new BufferedWriter(new FileWriter("C:\\Users\\hp\\Desktop\\Myfile.txt"));
		try{
			WrItE.write("Hello, File Handling in Java!");
		}finally{
			WrItE.close();
			System.out.println("Successfully Data Written");
		}
			
		}catch (IOException i) {
			System.out.println("i ");
		}
		
				//Appending to the existing File
		try {
        FileWriter aW = new FileWriter("C:\\Users\\hp\\Desktop\\Myfile.txt", true);
        try{
            aW.write("This is the content to append.\n");
        }finally{
            aW.close();
        }
			System.out.println("Successfully Data Appended");
        } catch (IOException i) {
        	System.out.println("i ");            
        }
	
 				//Reading into Files
		try (BufferedReader reAD = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\Myfile.txt"))) {
			String line;
			while ((line = reAD.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException i) {
			System.out.println("i ");
		}
        
		        // Deleting  file
		File fTd = new File("C:\\Users\\hp\\Desktop\\Myfile.txt");
		if (fTd.delete()) {
			System.out.println("File deleted: " + fTd.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
		}
	}





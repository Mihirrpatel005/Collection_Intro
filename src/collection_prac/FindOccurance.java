package collection_prac;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindOccurance {
	
	public static void main (String args[]){
		
		ArrayList<Integer> occList = new ArrayList<Integer>();
		occList.add(new Integer(2));
		occList.add(new Integer(5));
		occList.add(new Integer(4));
		occList.add(new Integer(3));
		occList.add(new Integer(6));
		occList.add(new Integer(4));
		
		findOccurance(occList);
		listFiles();
	}

	private static void listFiles() {
		
		File myFile = new File("D:\\MAC");   

	    if(myFile == null || !myFile.exists()) {
	        System.out.println("Bad directory path!");
	        System.exit(-1);
	    }

	    //Make a filter that matches files and directories
	  /*  final IOFileFilter myFilter = new IOFileFilter() {  
	        @Override
	        public boolean accept(File dir, String name) {
	            return true;
	        }

	        @Override
	        public boolean accept(File file) {
	            return true;

	        }
	    };
*/
	    //List files and folders in that directory
	   /* Collection<File> listOfFiles = FileUtils.listFilesAndDirs(path, null, null);
*/
	    /*for(File file : listOfFiles) {
	        if(file.isDirectory()) {
	            System.out.print("Directory: ");
	        }
	        else { 
	            System.out.println("File: ");
	        }

	        System.out.print(file.getAbsolutePath());       
	    }*/
		
	}

	public static void findOccurance(ArrayList<Integer> occList){
		
		for(int i =0;i<occList.size();i++){
			
			System.out.println("Frequency:" + Collections.frequency(occList,occList.get(i) ));
			
			
			
		}	
	}
}

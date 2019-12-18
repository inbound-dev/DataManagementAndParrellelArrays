/*
 * This Program Will ask user for data/statistics
 * if the user selects average it will average the given data 
 * if the user asks for 
 */

package datamanagementandparallelarrays;
import java.io.*;
import java.util.*;
/**
 *
 * @author joham3169
 */
public class DataManagementAndParallelArrays {

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
      File file = new File("Data.txt");
      
      try {
         Scanner x = new Scanner(new File("Data.txt"));
      }
      catch(Exception e){
          System.out.println("Error File Not Found Or Is Not Availible");
      }
      
      while(file.hasNext()){
            
        }
       
    }
  
}

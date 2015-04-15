package lr3;
import java.io.*;
import java.util.*;


public class FileParse {
    final int SPACE=32;
    BufferedReader reader = null;
    String word="";
    
    public void getList(List<String> collect, String fileName) {
        try {
            reader = new BufferedReader(new FileReader(new File(fileName)));
            int c;
            while ((c = reader.read()) != -1) {
                if(c!=SPACE){
                   word+=(char)c; 
                }
                else{
                    collect.add(word);
                    word="";
                }
            }
            collect.add(word);
            reader.close();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                     System.out.println(e.getMessage());
                }
            }
        }
    }

}

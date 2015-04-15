package lr3;
import java.util.*;

public class Effort {
        
    public int getNumber(List<String> collect, int wLength){
        
        int num=0;
        Iterator iter = collect.iterator();
          for(int i = 0; iter.hasNext(); i++) {
              if(collect.get(i).length()==wLength){
                  num++;
              }
              iter.next();
          }
System.out.println(num);
          return num;
    }
}
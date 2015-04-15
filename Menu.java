package lr3;
import java.util.*;

public class Menu {
    private String fileName;
    private int wLength;
    private List<String> collect;
    
    private void setList(List<String> list){
        if (list==null) throw new IllegalArgumentException("i am need a list!!");
        collect=list;
    }
    
    private void setLength(){
        System.out.println("(для выхода нажмите '0')\nВведите длину слова:");
        Scanner sc= new Scanner(System.in);
        
        while(true){
            int i = sc.nextInt();
            if(i>0){
                wLength=i;
                break;
            }
            else{
                if(i==0) System.exit(0);
                else System.out.println("Ошибка ввода! Пожалуйста, повторите...");
            }
        }
    }
    
    private void setFileName(){
        
        Scanner sc= new Scanner(System.in);
        
        while(true){
            System.out.println("Введите имя файла:");
            String s = sc.nextLine();
            if(!s.isEmpty()){
                fileName=s;
                break;
            }
        }
    }
    
    public void menu(List<String> list){
        setList(list);
        setFileName();
        setLength();
        
        FileParse fp = new FileParse();
        fp.getList(collect, fileName);
        
        Effort ef = new Effort();
        int num=ef.getNumber(collect, wLength);
        
        if(num>0) System.out.println("В файле "+fileName+" слов указанной длнины: "+num);
        else System.out.println("В файле "+fileName+" нет слов указанной длины");
        
        System.exit(0);
    }
}
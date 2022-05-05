import java.util.*;

public class Recorder{
    Map<String,String> sample = new HashMap<String,String>();

    public void put(String key, String value){
         sample.put(key,value);
        System.out.println(key +"="+value);
    }
    public void get(String key){
        if(sample.get(key) == null){
            throw new IllegalArgumentException();
            }
            System.out.println(sample.get(key));
        }
    public void delete(String key) throws IllegalArgumentException{
        sample.remove(key);
        System.out.println("deleted: " + key);
    }
    public void delete(){
        sample.clear();
        System.out.println("delete all");
    }
}
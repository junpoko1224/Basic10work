public class TryCatchFinallySample{
    public static void main(String[] args){
        try{
            System.out.println("try");
            int num = Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("catch");
        }finally{
            System.out.println("finally");
        }
    }
}
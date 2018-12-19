import java.util.Scanner;

class Exception1 extends Exception{
    Exception1(String s1){
        super(s1);
    }
}
class Exception2 extends Exception{
    Exception2(String s2){
        super(s2);
    }
}
class Exception3 extends Exception{
    Exception3(String s3){
        super(s3);
    }
}
public class Exceptionhandling {
    public static void m1(int num) throws Exception3,Exception2,Exception1{
        if(num<10&&num>0)
            throw new Exception1("e1");
        if(num>10 && num <50)
            throw new Exception2("e2");
        if(num>50&&num<100)
            throw new Exception3("e3");
    }
    public static void main(String arg[]){
        try{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
        m1(a);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally clause executed");
        }

    }

}




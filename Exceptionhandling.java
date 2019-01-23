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
    /**
     * checkRange function throws exception depending upon the range.
     */
    public static void checkRange(int num) throws Exception3,Exception2,Exception1{
        if(num<10&&num>0)
            throw new Exception1("exception_1 is thrown");
        else if(num>10 && num <50)
            throw new Exception2("exception_2 is thrown");
        else
            throw new Exception3("exception_3 is thrown");
    }
    public static void main(String arg[]){
        try{
            Scanner sc=new Scanner(System.in);
            
            int input_from_console=sc.nextInt();
        checkRange(input_from_console);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid input");
        }   
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally clause executed");
        }

    }

}




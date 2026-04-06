import java.util.Scanner;
class laptop{
    String brand;
    int year;
    void display(){
        System.out.println("brand="+brand);
        System.out.println("year="+year);

    }
}
public class main{
    public static void main(String[]args){
        laptop l1=new laptop();
            l1 . brand ="dell";
            l1.year=1995;
            l1.display();
        }
    }

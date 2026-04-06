// 5 this is used to pass current class as a parameter to the constructor
class student{
    void display(){
        System.out.println("under display method student class");

    }
    void sendObject(){
        Helper h=new Helper(this);
   
    }
}
class Helper{
    Helper (student s){
        System.out.println("under Helper class constructor");
        s.display();

        }
    }

public class main4 {
    public static void main(String[]args){
        student s1=new student();
    s1.sendObject();
    
}
    
}


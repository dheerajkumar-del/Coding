class Dog{
    String name;
    String color;
    Dog(String n,String c){
        name=n;
        color=c;
    }
    void display(){
        System.out.println("name="+name);
        System.out.println("color="+color);
    }
}
public class main{
    public static void main(String[]args){
        Dog d=new Dog("tommy","black");
        d.display();
    }
}
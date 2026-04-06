
// class house{
//     String location;
//    String price;

//    house(String l,String p ){
//     location= l;
//     price =p;       



//    }
//    void display(){
//     System.out.println("location="+location);
//     System.out.println("price="+price);
// }
// }
// public class main2 {
//     public static void main(String args[]){
//         house h= new house("Durg","10000000");
//         h.display();
  

//   }
// }

// class laptop{
//     String brand;
//     String ram;

//     laptop( String b,String r){
//         brand=b;
//         ram= r;

//     }
//     void display(){
//         System.out.println("brand="+brand);
//         System.out.println("ram="+ram);
    
        
//     }
// }
// public class main2{
//     public static void main(String[]args){
//         laptop l= new laptop("Dell","512Gb");
//         l.display();
//     }
// }

// class hello{
//     hello(){
//         System.out.println("hallo!");
//     }
// }
// public class main2{
//     public static void main(String[]aggs){
//         hello h=new hello();
//     }
// }



// public class main2 {
//     static void add(int a,int b){
//         System.out.print(a+b);
//     }
// static void add(int a,int b,int c){
//     System .out.println(a+b+c); 
// }  
// public static void main(String[]args){
//     add(2,3);
//     add(2,3,4);
//     add(2,3,4,5);
//     static void add(int a,int b,int c,int d){
//         System.out.println(a+b+c+d);
//     }
// }


// class student{
//     student name;
//     int roll;
//     student(){
//         name="undifden";
//         roll=0;


//     }
//     student (String s){
//         name =s;
//         roll=0;

//     }
//     student(String s,int r){
//         name=s;
//         roll=r;

//     }
//     void display(){
//         System.out.println("name:"+name);
//         System.out.println("roll:"+roll);
//     }

// }
// public class main2{
//     public static void main(String[]args){
//         student s1=new student();
//         s1.display();
//         student s2=new student("dhiraj");
//         s2.display();
//         student s3=new student("dhiraj",101);
//         s3.display();
//     }
// }


// class student{
//     String name;
//     int roll;
//     student (String name,int roll){
//         this .name=name;
//         this.roll=roll;

//     }
//     void display(){
//         System.out.println("name:"+name);
//         System.out.println("roll:"+roll);
//     }
// }
// public class main2{
//     public static void main(String[]args){
//         student s1=new student("dhiraj",50);
//         student s2=new student ("manoj",55);
//           student s3=new student ("anshu",56);
//         s1.display();
//         s2.display();
//         s3.display();
//     }
// }


// class student{
//     void display(){
//         System.out.println("under dislpay method");

//     }
//     void show(){
//         this.display();
//         System.out.println("under show display");

//     }
// }
// public class main2{
//     public static void main(String[]args){
//         student s1=new student();
    
//         s1.show();
//     }
// }

import java.util.Scanner; 
 
public class main2              { 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
 
       System.out.print("Enter two numbers: "); 
       int num1 = sc.nextInt(); 
       int num2 = sc.nextInt(); 
 
       System.out.print("Enter operator (+,-,*,/): "); 
       char op = sc.next().charAt(0); 
 
       switch (op) { 
           case '+': System.out.println(num1 + num2); break; 
           case '-': System.out.println(num1 - num2); break; 
           case '*': System.out.println(num1 * num2); break; 
           case '/': 
               if (num2 != 0) 
                   System.out.println(num1 / num2); 
               else 
                   System.out.println("Divide by zero!"); 
               break; 
           default: System.out.println("Invalid Operator!"); 
       } 
   } 
} 

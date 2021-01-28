
abstract class A{
    void call(){
        System.out.print("Class A has no Abstract Method. ");
        System.out.print("call method can not be called,");
        System.out.print("Because class A cannot be instantiated.");
    }
   
}
abstract class B{
    void call(){
        System.out.print("Class B has one Abstract Method. ");
    }
    abstract void display();
  
}

public class Assignment2Q4 extends B {

      @Override
      void display(){
      System.out.print("Display method overidden. ");
    }
    public static void main(String srgs[]){
        Assignment2Q4 obj = new Assignment2Q4();
        obj.display();
        obj.call();

    }
}
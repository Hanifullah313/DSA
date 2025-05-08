class  Oops{
String color;
String type;
public void write(){
    System.out.println("writing something ");
    System.out.println(this.color);
}
    }


public class Pen{
    public static void main(String[] args) {
       Oops pen1=new Oops();
       pen1.color="blue" ;
       pen1.type="pointer" ;
       pen1.write();
       Oops pen2=new Oops();
       pen2.color="black" ;
       pen2.type="pointer" ;
       pen2.write();
    }
}
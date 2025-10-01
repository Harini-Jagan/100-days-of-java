
public class inter {
     public static void main(String[]args){

      spy h=new spy();
      h.add();  
     }
}
interface father{
     abstract void add();}
interface mother{
     abstract void add();
}
class spy implements father{      //class spy implements father,mother{   //multiple inheritance

//override  add
      public void add(){

          

          System.out.println("Hello this is gowri");

     }

}

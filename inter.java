
public class inter {
     public static void main(String[]args){

      gowri h=new gowri();
      h.jagan();  
     }
}
interface father{
     abstract void jagan();}
interface mother{
     abstract void jagan();
}
class gowri implements father{      //class gowri implements father,mother{   //multiple inheritance

//override  jagan
      public void jagan(){
          System.out.println("hii");
     }

}
import java.io.*;
import java.util.List;
public class level1_bus{

      public static Integer ultima_posicion(Object[] s){
      return s.length -1;
   }

   public static Boolean vacia(Object[] s){
      if(s.length==0){
         return true;
      }else{
         return false;
      }
   }

   public static void mostrar(Object... args){
         for(Object s : args){
            System.out.println(s.toString());
         }
   }

      public static Integer p;
      public static Integer[] s;
      public static Integer e;
      public static Integer i;
      public static Integer j;

      public static void main(String[] args) {

         s = new Integer[]{9,3,5,2,-1,0,-3};
         i = 0;
         j = 0;
         e = -1;
         while((i<=ultima_posicion(s)&&j==0)){
            if((s[i]==e)){
               j = 1;
               p = i;
            }else{
               i=i+1;
            }
         }
         mostrar(s,i,j,e,p);
         vacia(s);
      }

}


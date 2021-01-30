import java.io.*;
import java.util.List;
public class level1_ord{

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

   public static void mostrar(Object x){
       System.out.println(x);
   }

      public static Integer[] s;
      public static Integer i;
      public static Integer j;

      public static void main(String[] args) {

         s = new Integer[]{9,3,5,2,-1,0,-3};
         i = 0;
         while((i<ultima_posicion(s))){
            j=i+1;
            while((j<=ultima_posicion(s))){
               if((s[i]>s[j])){
                  s[i] = s[j];
                  s[j] = s[i];
               }
               j=j+1;
            }
            i=i+1;
         }
         mostrar(s);
      }

   }


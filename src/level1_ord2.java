import java.io.*;
import java.util.List;
public class level1_ord2{

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

      public static Integer p;
      public static Integer[] s;
      public static Integer e;
      public static Integer i;
      public static Integer k;
      public static Integer m;

      public static void main(String[] args) {

         s = new Integer[]{9,3,5,2,-1,0,-3};
         i = 0;
         while((i<ultima_posicion(s))){
            m=i;
            k=i+1;
            while((k<=ultima_posicion(s))){
               if((s[k]<s[m])){
                  m=k;
               }
               k=k+1;
            }
            mostrar(m);
            mostrar(s);
            s[i] = s[m];
            s[m] = s[i];
            i=i+1;
         }
         mostrar(s);
      }

   }


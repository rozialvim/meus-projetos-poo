
public class Temperatura {   
   public int TemperaturaAtual(int opcaoCidade ){
      int resultadoTemp=0;
      switch (opcaoCidade){
         case 1:
         resultadoTemp = 28;
         break;
         case 2:
         resultadoTemp = 27;
         break;
         case 3:
         resultadoTemp = 19;
         break;
         case 4:
         resultadoTemp = 12;
         break;
         case 5:
         resultadoTemp = 18;
         break;
         case 6:
         resultadoTemp = 11;
         break;
         case 7:
         resultadoTemp = 5;
         break;
         case 8:
         resultadoTemp = 16;
         break;
         case 9:
         resultadoTemp = 16;
         break;
         case 10:
         resultadoTemp = 22;
         break;
      }
       return resultadoTemp;
   }

}

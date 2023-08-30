package TDE.src;

import linkedListPackage.linkedList;
import linkedListPackage.node;


public class Fila extends linkedList {

   public Fila() {
      List = null;
   }

   public void remove() {
      if (getSize() > 1) {
         System.out.println("removido: " + List.getData());
         List = List.getNext();
      } else if (getSize() == 1) {
         System.out.println("removido: " + List.getData());
         List = null;
      } else {
         System.out.println("Fila vazia");
      }

   }

   public static Fila merge(Fila a, Fila b){
      Fila c = new Fila();
      node atualA = a.List, atualB = b.List;

      while(atualA != null || atualB != null) {

         if(atualA != null && atualB != null){

            if(atualA.getData() < atualB.getData()){
               c.add(atualA.getData());
               atualA = atualA.getNext();
            }else{
               c.add(atualB.getData());
               atualB = atualB.getNext();
            }
         }else if(atualA == null){
            c.add(atualB.getData());
            atualB = atualB.getNext();

         }else if(atualB == null){
            c.add(atualA.getData());
            atualA = atualA.getNext();
         }

      }

      return c;
   }



   @Override
   public void printList(){
      node atual = List;
      while (atual != null) {
         System.out.print(atual.getData() + " <- ");
         atual= atual.getNext();
      }
      System.out.println();
   }
}
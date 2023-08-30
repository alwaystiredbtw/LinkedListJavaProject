package TDE.src;

import linkedListPackage.linkedList;
import linkedListPackage.node;

public class pilha extends linkedList {

    public pilha() {
        List = null;
    }

    public void remove() {
        int counter = 0;
        node atual = List;
        while (counter < getSize()) {
            //   caso a pilha so tenha um elemento
            if (counter==0 && atual.getNext() == null) {
                atual.setNext(null);
                break;
            } else if(atual.getNext().getNext() == null){
                System.out.println("removido:" + atual.getNext().getData());
                atual.setNext(null);
                break;
            }else{
                atual = atual.getNext();
                counter++;
            }
        }
    }

    @Override
    public void printList() {
        node atual = List;
        while (atual != null) {
            System.out.println(atual.getData());
            atual= atual.getNext();
        }
    }


}




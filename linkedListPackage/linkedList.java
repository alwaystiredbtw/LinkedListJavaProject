package linkedListPackage;

public class linkedList {
    protected node List;


    public linkedList(){
        this.List = null;
    }

    public node getList() {
        return List;
    }

    public void setList(node list) {
        List = list;
    }

    public void add(int newInt){
        node newNode = new node(newInt);
        if(List == null)
        {
            List = newNode;
        }
        else
        {
            node atual = List;
            while (atual.getNext()!= null){
                atual = atual.getNext();
            }
            atual.setNext(newNode);
        }
    }

    public void printList(){
        node atual = List;
        while (atual != null) {
            System.out.print(atual.getData()+ " -> ");
            atual= atual.getNext();
        }
        System.out.println("Null");
    }

    public void remove(int indice) {
        node anterior = null;
        if (indice < getSize() && indice > 0) {
            if (indice == 1) {
                node excluido = List;
                List = List.getNext();
                excluido = null;
            } else {
                int counter = 0;
                while (counter < indice - 1) {
                    if (List.getNext() == null) {
                        System.out.println("nulo");
                    } else {
                        List = List.getNext();
                        counter++;
                    }
                    node excluido = List.getNext();
                    List.setNext(excluido.getNext());
                    excluido = null;
                }
            }
        }
        else{
            System.out.println("Index out of bounds");
        }
    }

    public node get(int indice){
        return null;
    }


    public int getSize()
    {
        node atual = List;
        int counter = 0;
        while (atual != null){
            atual = atual.getNext();
            counter++;
        }
        return counter;
    }





}



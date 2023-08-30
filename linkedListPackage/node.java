package linkedListPackage;

public class node {
    private Integer data;
    private node next;
    public node(int novoValor){
        this.data = novoValor;

    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
}

public class LinkedList
{
    private No inicio, fim;
    private int size;

    public LinkedList()
    {
       inicio = null;
       fim = null;
       size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void push_front(int elemento)
    {
        No celula = new No(elemento);
        this.inicio = celula;
        this.size++;

    }
}

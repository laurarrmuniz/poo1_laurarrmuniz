public class LinkedList {
    Node begin = null;
    int size = 0;

    public void push_front(int data) {
        Node no = new Node();
        no.Data = data;
        no.Next = begin;
        begin = no;
        size++;
    }

    public int pop_front() {
        if (begin == null) {
            return -1;
        }
        int data = begin.Data;
        begin = begin.Next;
        size--;
        return data;
    }
}

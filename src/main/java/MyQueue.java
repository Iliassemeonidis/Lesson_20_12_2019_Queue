public class MyQueue <T>{

    private Node<T> head;
    private Node<T> last;
    private int size;

    public void add(T val) {
        Node <T> node = new Node<T>(val);
        size++;
        if (head == null) {
            head = node;
            last = node;
        }else {
            last.nextNode=node;
            last=node;
        }
    }

    public void clear(){
        head = null;
        last = null;
    }

    public int size(){
        return size;
    }

    public T peek(){
        return head.val;
    }

    public T poll(){
        T val1= head.val;
        head = head.nextNode;
        size--;
        return val1;
    }

    private class Node<T>{
        T val;
        Node<T> nextNode;

        public Node(T val) {
            this.val = val;
        }
    }

}

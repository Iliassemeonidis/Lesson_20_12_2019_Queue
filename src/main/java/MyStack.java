public class MyStack <T>{
    private Object[] arr = new Object[100];
    private int size;

    public void add(T val){
        arr[size++] = val;
    }

    public T pop(){
        Object ob = arr[size-1];
        arr[size-1] = null;
        size--;
        return (T)ob;
    }

    public boolean empty(){
        return size == 0;
    }

}

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        MyQueue<String> q = new MyQueue();
//        Random rnd = new Random();
//        String[] zal = new String[3];
//        int size = rnd.nextInt(8)+3;
//        for (int i = 0; i < size; i++) {
//            //System.out.println("Введите фамилию");
//            q.add("name"+i);
//        }
//
//        while(q.size()>0) {
//            for (int i = 0; i < zal.length && q.size()>0; i++) {
//                zal[i] = q.poll();
//                System.out.print(zal[i]+" ");
//            }
//            System.out.println();
//            System.out.println("Есть еще желающие. Добавляем в на концерт");
//        }




        //без очереди
//        Random rnd = new Random();
//        String[] zal = new String[3];
//
//        int size = rnd.nextInt(8) + 3;
//
//        ArrayList<String> list = new ArrayList<String>();
//
//        for (int i = 0; i < size; i++) {
//            list.add("name"+i);
//        }
//
//        while (list.size()>0){
//
//            for (int i = 0; i < zal.length && list.size()>0; i++) {
//                zal[i] = list.remove(0);
//                System.out.print(zal[i]+" ");
//            }
//            System.out.println();
//        }


        //очереди из коробки
        //хранит данные в таком же порядке, как и забивали
//        ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
//        q1.add(10);
//        q1.add(40);
//        q1.add(30);
//        q1.add(20);
//
//        while(q1.size() > 0){
//            System.out.println(q1.poll());
//        }


        //сортирует очередь по порядку
//        PriorityQueue<Integer> q2 = new PriorityQueue<>();
//        q2.add(10);
//        q2.add(40);
//        q2.add(30);
//        q2.add(20);
//
//
//        while(q2.size() > 0){
//            System.out.println(q2.poll());
//        }


        //сортировка массива из коробки
//        int[] arr = {54,1,3,5,6};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));



        //СТЭК - работает по принципу последний зашел - первый вышел
//        MyStack<Integer> stack = new MyStack<>();
//        stack.add(10);
//        stack.add(20);
//        stack.add(30);
//        stack.add(40);
//
//        while(!stack.empty()){
//            System.out.println(stack.pop());
//        }
//
//        System.out.println();
//        stack.add(50);
//        stack.add(60);
//        stack.add(70);
//
//        while(!stack.empty()){
//            System.out.println(stack.pop());
//        }

        //СТЭК из коробки
//        Stack<Integer> stack2 = new Stack();
//        stack2.add(10);
//        stack2.add(20);
//        stack2.add(30);
//        stack2.add(40);
//
//        while(!stack2.empty()){
//            System.out.println(stack2.pop());
//        }


        //HashSet
        //Хэш таблица - обычный массив
        //создадим хэш таблицу имен
//        String[] hashTableNames = new String[10];
//
//        String name1 = "ivan";
//        String name2 = "alex";
//        //Определим индекс по хэш функции
//        int first = name1.charAt(0);
//        int second = name1.charAt(name1.length()-1);
//        int hashCode = (first+second)%10;
//        hashTableNames[hashCode] = name1;
//        System.out.println(hashCode);
//
//        first = name2.charAt(0);
//        second = name2.charAt(name2.length()-1);
//        hashCode = (first+second)%10;
//        hashTableNames[hashCode] = name2;
//        System.out.println(hashCode);
//
//
//        //пользователь хочет проверить, есть ли имя alex в множестве имен
//
//        String userName = "alex";
//        first = userName.charAt(0);
//        second = userName.charAt(name2.length()-1);
//        hashCode = (first+second)%10;
//        if(hashTableNames[hashCode]!=null && hashTableNames[hashCode].equals(userName)){
//            System.out.println("Имя есть во множестве");
//        }else{
//            System.out.println("нету");
//        }


        //Тот же пример на хэш таблице из коробки (HashSet)
//        HashSet<String> set = new HashSet();
//        set.add("Ivan");
//        set.add("Alex");
//        set.add("Alex");
//
//        //пользователь вводит имя с консоли
//        String userName = "Alex";
//        //проверяем его наличие
//        if(set.contains(userName)){
//            System.out.println("есть");
//        }else{
//            System.out.println("Нет");
//        }
//
//        //Как получить доступ к каждому элементу по индексу?
//        ArrayList<String> list = new ArrayList();
//        for(String val : set){
//            list.add(val);
//        }
//
//
//        System.out.println(list);


        //HashSet не сохраняет порядок вводимых элементов, а LinkedHashSet сохраняет
        HashSet<Integer> set = new HashSet();
        set.add(70);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);

        LinkedHashSet<Integer> set2 = new LinkedHashSet();
        set2.add(70);
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);

        System.out.println(set2);

        //TreeSet сортирует элементы  в порядке возрастания

        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(70);
        set3.add(10);
        set3.add(20);
        set3.add(30);
        set3.add(40);

        System.out.println(set3);








    }
}

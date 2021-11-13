import java.util.LinkedList;

public class SafeLinkedList<T>{

    private LinkedList<T> list = new LinkedList<>();

    public SafeLinkedList() {
    }

    public synchronized void addAtPosition(int index, T element) {
        list.add(index, element);
    }

    public synchronized void removeAtPosition(int index) {
        if (index >= 0 && list.size() >= index) {
            list.remove(index);
        }
    }

    public synchronized T getFirst() {
        if (!list.isEmpty()) {
            return list.getFirst();
        }
        return null;
    }

    public synchronized T getLast() {
        if (!list.isEmpty()) {
            return list.getLast();
        }
        return null;
    }

    public int size() {
        return list.size();
    }

}

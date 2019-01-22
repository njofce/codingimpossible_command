package codingimpossible.command_pattern.action;

import java.util.LinkedList;
import java.util.List;

class QueueStack<T> {

    private List<T> dataCollection;

    QueueStack() {
        dataCollection = new LinkedList<>();
    }

    void push(T item) {
        dataCollection.add(0, item);
    }

    T pop() {
        return dataCollection.remove(dataCollection.size() - 1);
    }

    void clear() {
        dataCollection.clear();
    }

}

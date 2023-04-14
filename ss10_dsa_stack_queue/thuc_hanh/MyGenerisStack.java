package ss10_dsa_stack_queue.thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenerisStack <T>{
    private LinkedList<T> stack;
    public MyGenerisStack(){
        stack = new LinkedList<>();

    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    private boolean isEmpty() {
        if (stack.size()==0){
            return true;
        }
        return false;
    }
}

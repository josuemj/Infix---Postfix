package Model;

import Model.*;

public class StackFactory<T> {

    public IStack<T> IgetIStack(String stackType) {

        if (stackType.equals("ArrayList")) {
            return new StackUsingArrayList<>();
        } else if(stackType.equals("Vector")){
            return new StackVector<>();
        } else if (stackType.equals("SingleLinkedList")){
            return new StackUsingLinkedList<>();
        } else if (stackType.equals("DoubleLinkedList")){
            return new StackUsingDoubleLinkedList<>();
        }
    return null;
}}


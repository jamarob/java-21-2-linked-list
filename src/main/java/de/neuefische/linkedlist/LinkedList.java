package de.neuefische.linkedlist;

import java.util.Objects;

public class LinkedList<T> {

    private ListItem<T> head;

    public void add(T value){
        if(head == null){
            head = new ListItem<>(value);
        }else {
            getTail(head).setNext(new ListItem<>(value));
        }
    }

    private ListItem<T> getTail(ListItem<T> item){
        return item.getNext() == null ? item : getTail(item.getNext());
    }


    public void remove(T value){
        while(head != null && head.getValue().equals(value)){
            head = head.getNext();
        }

        if(head == null){
            return;
        }

        ListItem<T> item = head;

        while(item.getNext() != null){

            if(Objects.equals(item.getNext().getValue(), value)){
                item.setNext(item.getNext().getNext());
            }else{
                item = item.getNext();
            }

        }
    }

    @Override
    public String toString() {
        if(head == null){
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getValue().toString());

        ListItem<T> item = head.getNext();

        while(item != null){
            builder.append(" -> ").append(item.getValue());
            item = item.getNext();
        }

        return builder.toString();
    }
}

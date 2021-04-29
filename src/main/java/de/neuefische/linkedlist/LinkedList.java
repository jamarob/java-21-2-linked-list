package de.neuefische.linkedlist;

import java.util.Objects;

public class LinkedList {

    private ListItem head;

    public void add(Animal animal){
        if(head == null){
            head = new ListItem(animal);
        }else {
            getTail(head).setNext(new ListItem(animal));
        }
    }

    private ListItem getTail(ListItem item){
        return item.getNext() == null ? item : getTail(item.getNext());
    }


    public void remove(Animal animal){
        while(head != null && head.getValue().equals(animal)){
            head = head.getNext();
        }

        if(head == null){
            return;
        }

        ListItem item = head;

        while(item.getNext() != null){

            if(Objects.equals(item.getNext().getValue(), animal)){
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

        ListItem item = head.getNext();

        while(item != null){
            builder.append(" -> ").append(item.getValue());
            item = item.getNext();
        }

        return builder.toString();
    }
}

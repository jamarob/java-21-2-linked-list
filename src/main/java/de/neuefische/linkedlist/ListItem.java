package de.neuefische.linkedlist;

public class ListItem {

    private Animal value;
    private ListItem next;

    public ListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }
}

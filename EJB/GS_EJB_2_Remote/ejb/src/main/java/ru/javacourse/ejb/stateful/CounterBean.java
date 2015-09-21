package ru.javacourse.ejb.stateful;

import javax.ejb.Remote;
import javax.ejb.Stateful;


@Stateful
public class CounterBean implements RemoteCounter {

    private int count = 0;

    public void increment() {
        this.count++;
    }

    public void decrement() {
        this.count--;
    }

    public int getCount() {
        return this.count;
    }
}

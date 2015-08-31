package ru.javacourse.ejb.stateful;

import javax.ejb.Remote;


@Remote // удаленно, в этом примере мы помечаем аннотацией весь интерфейс (поэтому класс-реализацию (CounterBean) не нужно помечать)
public interface RemoteCounter {

    void increment();

    void decrement();

    int getCount();

}

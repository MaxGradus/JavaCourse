package ru.javacourse.ejb.stateless;


import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote(RemoteCalculator.class) /**вызов бина УДАЛЕННО (в этом примере мы пишем аннотацию только для класса-реализации)*/
//@Local(RemoteCalculator.class) /**вызов бина на ЭТОЙ JVM (на этом компе), стоит по умолчанию*/
public class CalculatorBean implements RemoteCalculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
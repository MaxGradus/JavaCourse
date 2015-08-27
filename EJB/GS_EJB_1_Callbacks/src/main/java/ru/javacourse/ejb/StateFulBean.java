package ru.javacourse.ejb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Local;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;

/** у стэйтфул бина появляется еще 2 анотации
 * У Stateful бина есть еще два состояния в жизненом цикле:
 * перед тем как он сохраняется в промежуточное состояние
 * и после того как он выходит из промежуточного состояния*/
@Stateful
public class StateFulBean {

    @PostConstruct
    public void init() {
        System.out.println("Init sateful bean");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroy sateful bean");
    }

    @PostActivate // вызывается после выхода Бина из "сна"
    public void activate() {
        System.out.println("Activate stateful bean");
    }

    @PrePassivate // вызывается перед входом Бина в "сон"
    public void passivate() {
        System.out.println("Passivate stateful bean");
    }

    public int sum(int a, int b) {
        return a + b;
    }

}

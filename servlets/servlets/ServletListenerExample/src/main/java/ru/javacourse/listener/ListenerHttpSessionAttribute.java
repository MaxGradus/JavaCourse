package ru.javacourse.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**Реагирует когда в сессию помещается/удаляется атрибут*/

public class ListenerHttpSessionAttribute implements HttpSessionAttributeListener {

    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("ListenerHttpSessionAttribute.attributeAdded:" + event.getName() + " " + event.getValue());
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("ListenerHttpSessionAttribute.attributeRemoved:" + event.getName() + " " + event.getValue());
    }

    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("ListenerHttpSessionAttribute.attributeReplaced:" + event.getName() + " " + event.getValue());
    }
}

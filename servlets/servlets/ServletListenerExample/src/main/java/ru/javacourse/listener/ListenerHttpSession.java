package ru.javacourse.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**������� ���������������� ������*/

public class ListenerHttpSession implements HttpSessionListener {

//    private static int count; // ����� ��������� ������� ���������.

    @Override
    public void sessionCreated(HttpSessionEvent se) { // ����� ���������� ����� ������ ����� �������
//        count++; // ������ ����� ������ ����� ����������� ����������

        System.out.println("ListenerHttpSession.sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) { // ����� ���������� ����� ������ ����� ����������
        System.out.println("ListenerHttpSession.sessionDestroyed");
    }
}

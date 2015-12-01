package ru.javacourse.struts.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ru.javacourse.struts.data.UserDataSourse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class WelcomeAction extends Action {

/**Начинает работать класс WelcomeAction(как сервлет). Запускается метод execute, в котором в request
 * передается список Юзеров с ключом "users". Далее идет форвард (переход) на таргет "success", который
 * в свою очередь определен в конфигуриционном фаиле struts-config (т.е. переход на страницу index.jsp) */

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        request.setAttribute("users", UserDataSourse.getUsers());

        return mapping.findForward("success");

    }


}

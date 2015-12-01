package students.view;

import students.entity.Profession;

public class ProfessionView {

    /**Класс ProfessionView это класс такой же как наш Profession(который маппится с Hibernate). Объекты ProfessionView
     * будут передоваться непосредственно на саму JSP страницу т.к. если нам требуются от объета не все поля (например,
     * 2 или 3 поля, а в нашем Profession их 20 или более) тогда мы используем "обрезанный" класс - ProfessionView, в
     * котором будет только нужная нам информация.*/

    private Long professionId;
    private String professionName;

    public ProfessionView() {
    }

    public ProfessionView(Profession p) {
        this.professionId = p.getProfessionId();
        this.professionName = p.getProfessionName();
    }

    public Long getProfessionId() {
        return professionId;
    }

    public void setProfessionId(Long professionId) {
        this.professionId = professionId;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }
}


package ru.javacourse.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.javacourse.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Sun_QNAME = new QName("http://webservice.javacourse.ru/", "sun");
    private final static QName _SunResponse_QNAME = new QName("http://webservice.javacourse.ru/", "sunResponse");
    private final static QName _MultResponse_QNAME = new QName("http://webservice.javacourse.ru/", "multResponse");
    private final static QName _DivResponse_QNAME = new QName("http://webservice.javacourse.ru/", "divResponse");
    private final static QName _Mult_QNAME = new QName("http://webservice.javacourse.ru/", "mult");
    private final static QName _Sub_QNAME = new QName("http://webservice.javacourse.ru/", "sub");
    private final static QName _SubResponse_QNAME = new QName("http://webservice.javacourse.ru/", "subResponse");
    private final static QName _Div_QNAME = new QName("http://webservice.javacourse.ru/", "div");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.javacourse.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link Mult }
     * 
     */
    public Mult createMult() {
        return new Mult();
    }

    /**
     * Create an instance of {@link MultResponse }
     * 
     */
    public MultResponse createMultResponse() {
        return new MultResponse();
    }

    /**
     * Create an instance of {@link SunResponse }
     * 
     */
    public SunResponse createSunResponse() {
        return new SunResponse();
    }

    /**
     * Create an instance of {@link Sun }
     * 
     */
    public Sun createSun() {
        return new Sun();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sun }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "sun")
    public JAXBElement<Sun> createSun(Sun value) {
        return new JAXBElement<Sun>(_Sun_QNAME, Sun.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SunResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "sunResponse")
    public JAXBElement<SunResponse> createSunResponse(SunResponse value) {
        return new JAXBElement<SunResponse>(_SunResponse_QNAME, SunResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "multResponse")
    public JAXBElement<MultResponse> createMultResponse(MultResponse value) {
        return new JAXBElement<MultResponse>(_MultResponse_QNAME, MultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "mult")
    public JAXBElement<Mult> createMult(Mult value) {
        return new JAXBElement<Mult>(_Mult_QNAME, Mult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<Sub>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<SubResponse>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.javacourse.ru/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

}

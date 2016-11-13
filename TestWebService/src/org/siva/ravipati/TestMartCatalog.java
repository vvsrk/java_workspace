
package org.siva.ravipati;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.testmart.ObjectFactory;
import com.testmart.Product;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestMartCatalog {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(action = "fetch_Categories")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "fetchCategories", targetNamespace = "http://www.testmart.com", className = "com.testmart.FetchCategories")
    @ResponseWrapper(localName = "fetchCategoriesResponse", targetNamespace = "http://www.testmart.com", className = "com.testmart.FetchCategoriesResponse")
    public List<String> fetchCategories();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProducts", targetNamespace = "http://www.testmart.com", className = "com.testmart.GetProducts")
    @ResponseWrapper(localName = "getProductsResponse", targetNamespace = "http://www.testmart.com", className = "com.testmart.GetProductsResponse")
    public List<String> getProducts(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://www.testmart.com", className = "com.testmart.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://www.testmart.com", className = "com.testmart.AddProductResponse")
    public boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.testmart.Product>
     */
    @WebMethod
    @WebResult(name = "product", targetNamespace = "")
    @RequestWrapper(localName = "getProductsV2", targetNamespace = "http://www.testmart.com", className = "com.testmart.GetProductsV2")
    @ResponseWrapper(localName = "getProductsV2Response", targetNamespace = "http://www.testmart.com", className = "com.testmart.GetProductsV2Response")
    public List<Product> getProductsV2(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}

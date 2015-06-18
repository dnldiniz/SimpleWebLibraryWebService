/**
 * SimpleBookStoreService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.mg.ufmg.icex.es2;

public interface SimpleBookStoreService extends javax.xml.rpc.Service {
    public java.lang.String getSimpleBookStoreAddress();

    public br.mg.ufmg.icex.es2.SimpleBookStore getSimpleBookStore() throws javax.xml.rpc.ServiceException;

    public br.mg.ufmg.icex.es2.SimpleBookStore getSimpleBookStore(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

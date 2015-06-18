/**
 * SimpleBookStore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.mg.ufmg.icex.es2;

public interface SimpleBookStore extends java.rmi.Remote {
    public br.mg.ufmg.icex.es2.Livro pesquisaIsbn(int isbn_) throws java.rmi.RemoteException;
    public br.mg.ufmg.icex.es2.Livro pesquisaAutor(java.lang.String autor_) throws java.rmi.RemoteException;
}

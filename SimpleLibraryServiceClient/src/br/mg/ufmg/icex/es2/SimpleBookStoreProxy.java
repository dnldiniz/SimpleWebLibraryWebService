package br.mg.ufmg.icex.es2;

public class SimpleBookStoreProxy implements br.mg.ufmg.icex.es2.SimpleBookStore {
  private String _endpoint = null;
  private br.mg.ufmg.icex.es2.SimpleBookStore simpleBookStore = null;
  
  public SimpleBookStoreProxy() {
    _initSimpleBookStoreProxy();
  }
  
  public SimpleBookStoreProxy(String endpoint) {
    _endpoint = endpoint;
    _initSimpleBookStoreProxy();
  }
  
  private void _initSimpleBookStoreProxy() {
    try {
      simpleBookStore = (new br.mg.ufmg.icex.es2.SimpleBookStoreServiceLocator()).getSimpleBookStore();
      if (simpleBookStore != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)simpleBookStore)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)simpleBookStore)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (simpleBookStore != null)
      ((javax.xml.rpc.Stub)simpleBookStore)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.mg.ufmg.icex.es2.SimpleBookStore getSimpleBookStore() {
    if (simpleBookStore == null)
      _initSimpleBookStoreProxy();
    return simpleBookStore;
  }
  
  public br.mg.ufmg.icex.es2.Livro pesquisaIsbn(int isbn_) throws java.rmi.RemoteException{
    if (simpleBookStore == null)
      _initSimpleBookStoreProxy();
    return simpleBookStore.pesquisaIsbn(isbn_);
  }
  
  public br.mg.ufmg.icex.es2.Livro pesquisaAutor(java.lang.String autor_) throws java.rmi.RemoteException{
    if (simpleBookStore == null)
      _initSimpleBookStoreProxy();
    return simpleBookStore.pesquisaAutor(autor_);
  }
  
  
}
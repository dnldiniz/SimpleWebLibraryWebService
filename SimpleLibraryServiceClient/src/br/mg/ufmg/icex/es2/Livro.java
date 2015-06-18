/**
 * Livro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.mg.ufmg.icex.es2;

public class Livro  implements java.io.Serializable {
    private int ano;

    private java.lang.String autor;

    private java.lang.String editora;

    private int isbn;

    private java.lang.String titulo;

    public Livro() {
    }

    public Livro(
           int ano,
           java.lang.String autor,
           java.lang.String editora,
           int isbn,
           java.lang.String titulo) {
           this.ano = ano;
           this.autor = autor;
           this.editora = editora;
           this.isbn = isbn;
           this.titulo = titulo;
    }


    /**
     * Gets the ano value for this Livro.
     * 
     * @return ano
     */
    public int getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this Livro.
     * 
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }


    /**
     * Gets the autor value for this Livro.
     * 
     * @return autor
     */
    public java.lang.String getAutor() {
        return autor;
    }


    /**
     * Sets the autor value for this Livro.
     * 
     * @param autor
     */
    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }


    /**
     * Gets the editora value for this Livro.
     * 
     * @return editora
     */
    public java.lang.String getEditora() {
        return editora;
    }


    /**
     * Sets the editora value for this Livro.
     * 
     * @param editora
     */
    public void setEditora(java.lang.String editora) {
        this.editora = editora;
    }


    /**
     * Gets the isbn value for this Livro.
     * 
     * @return isbn
     */
    public int getIsbn() {
        return isbn;
    }


    /**
     * Sets the isbn value for this Livro.
     * 
     * @param isbn
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    /**
     * Gets the titulo value for this Livro.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this Livro.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livro)) return false;
        Livro other = (Livro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ano == other.getAno() &&
            ((this.autor==null && other.getAutor()==null) || 
             (this.autor!=null &&
              this.autor.equals(other.getAutor()))) &&
            ((this.editora==null && other.getEditora()==null) || 
             (this.editora!=null &&
              this.editora.equals(other.getEditora()))) &&
            this.isbn == other.getIsbn() &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAno();
        if (getAutor() != null) {
            _hashCode += getAutor().hashCode();
        }
        if (getEditora() != null) {
            _hashCode += getEditora().hashCode();
        }
        _hashCode += getIsbn();
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://es2.icex.ufmg.mg.br", "Livro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://es2.icex.ufmg.mg.br", "ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://es2.icex.ufmg.mg.br", "autor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://es2.icex.ufmg.mg.br", "editora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://es2.icex.ufmg.mg.br", "isbn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://es2.icex.ufmg.mg.br", "titulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

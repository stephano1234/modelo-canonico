//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.04.26 às 11:59:49 AM BRT 
//


package br.com.contmatic.dto.empresa.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de EmpresaResource complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EmpresaResource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razaoSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataAbertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="responsaveis" type="{http://www.contmatic.com.br/dto/empresa/v1}ResponsavelResource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="enderecos" type="{http://www.contmatic.com.br/dto/empresa/v1}EnderecoResource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="telefonesFixos" type="{http://www.contmatic.com.br/dto/empresa/v1}TelefoneFixoResource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="emails" type="{http://www.contmatic.com.br/dto/empresa/v1}EmailResource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="celulares" type="{http://www.contmatic.com.br/dto/empresa/v1}CelularResource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="contasBancarias" type="{http://www.contmatic.com.br/dto/empresa/v1}ContaBancariaResource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="tipoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPorteEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmpresaResource", propOrder = {
    "cnpj",
    "razaoSocial",
    "dataAbertura",
    "responsaveis",
    "enderecos",
    "telefonesFixos",
    "emails",
    "celulares",
    "contasBancarias",
    "tipoEmpresa",
    "tipoPorteEmpresa"
})
@XmlRootElement(name = "EmpresaResource")
public class EmpresaResource {

    protected String cnpj;
    protected String razaoSocial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAbertura;
    @XmlElement(required = true)
    protected List<ResponsavelResource> responsaveis;
    @XmlElement(required = true)
    protected List<EnderecoResource> enderecos;
    @XmlElement(required = true)
    protected List<TelefoneFixoResource> telefonesFixos;
    @XmlElement(required = true)
    protected List<EmailResource> emails;
    @XmlElement(required = true)
    protected List<CelularResource> celulares;
    @XmlElement(required = true)
    protected List<ContaBancariaResource> contasBancarias;
    protected String tipoEmpresa;
    protected String tipoPorteEmpresa;

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Obtém o valor da propriedade dataAbertura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAbertura() {
        return dataAbertura;
    }

    /**
     * Define o valor da propriedade dataAbertura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAbertura(XMLGregorianCalendar value) {
        this.dataAbertura = value;
    }

    /**
     * Gets the value of the responsaveis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsaveis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsaveis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsavelResource }
     * 
     * 
     */
    public List<ResponsavelResource> getResponsaveis() {
        if (responsaveis == null) {
            responsaveis = new ArrayList<ResponsavelResource>();
        }
        return this.responsaveis;
    }

    /**
     * Gets the value of the enderecos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enderecos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnderecos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnderecoResource }
     * 
     * 
     */
    public List<EnderecoResource> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<EnderecoResource>();
        }
        return this.enderecos;
    }

    /**
     * Gets the value of the telefonesFixos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefonesFixos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonesFixos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelefoneFixoResource }
     * 
     * 
     */
    public List<TelefoneFixoResource> getTelefonesFixos() {
        if (telefonesFixos == null) {
            telefonesFixos = new ArrayList<TelefoneFixoResource>();
        }
        return this.telefonesFixos;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailResource }
     * 
     * 
     */
    public List<EmailResource> getEmails() {
        if (emails == null) {
            emails = new ArrayList<EmailResource>();
        }
        return this.emails;
    }

    /**
     * Gets the value of the celulares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the celulares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCelulares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CelularResource }
     * 
     * 
     */
    public List<CelularResource> getCelulares() {
        if (celulares == null) {
            celulares = new ArrayList<CelularResource>();
        }
        return this.celulares;
    }

    /**
     * Gets the value of the contasBancarias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contasBancarias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContasBancarias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContaBancariaResource }
     * 
     * 
     */
    public List<ContaBancariaResource> getContasBancarias() {
        if (contasBancarias == null) {
            contasBancarias = new ArrayList<ContaBancariaResource>();
        }
        return this.contasBancarias;
    }

    /**
     * Obtém o valor da propriedade tipoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    /**
     * Define o valor da propriedade tipoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEmpresa(String value) {
        this.tipoEmpresa = value;
    }

    /**
     * Obtém o valor da propriedade tipoPorteEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPorteEmpresa() {
        return tipoPorteEmpresa;
    }

    /**
     * Define o valor da propriedade tipoPorteEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPorteEmpresa(String value) {
        this.tipoPorteEmpresa = value;
    }

}

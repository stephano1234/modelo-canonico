//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.04.26 às 11:59:49 AM BRT 
//


package br.com.contmatic.dto.empresa.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.contmatic.dto.empresa.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.contmatic.dto.empresa.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmpresaResource }
     * 
     */
    public EmpresaResource createEmpresaResource() {
        return new EmpresaResource();
    }

    /**
     * Create an instance of {@link ResponsavelResource }
     * 
     */
    public ResponsavelResource createResponsavelResource() {
        return new ResponsavelResource();
    }

    /**
     * Create an instance of {@link EnderecoResource }
     * 
     */
    public EnderecoResource createEnderecoResource() {
        return new EnderecoResource();
    }

    /**
     * Create an instance of {@link TelefoneFixoResource }
     * 
     */
    public TelefoneFixoResource createTelefoneFixoResource() {
        return new TelefoneFixoResource();
    }

    /**
     * Create an instance of {@link EmailResource }
     * 
     */
    public EmailResource createEmailResource() {
        return new EmailResource();
    }

    /**
     * Create an instance of {@link CelularResource }
     * 
     */
    public CelularResource createCelularResource() {
        return new CelularResource();
    }

    /**
     * Create an instance of {@link ContaBancariaResource }
     * 
     */
    public ContaBancariaResource createContaBancariaResource() {
        return new ContaBancariaResource();
    }

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.18 alle 06:40:28 PM CET 
//


package magazzino;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipo_prodotto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipo_prodotto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Audio"/>
 *               &lt;enumeration value="Video"/>
 *               &lt;enumeration value="Telefonia"/>
 *               &lt;enumeration value="Informatica"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codice">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modello" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descrizione" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prezzo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *               &lt;minExclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="quantita">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipo_prodotto", propOrder = {
    "categoria",
    "codice",
    "marca",
    "modello",
    "descrizione",
    "prezzo",
    "quantita"
})
public class TipoProdotto {

    @XmlElement(required = true)
    protected String categoria;
    @XmlElement(required = true)
    protected String codice;
    @XmlElement(required = true)
    protected String marca;
    @XmlElement(required = true)
    protected String modello;
    @XmlElement(required = true)
    protected String descrizione;
    protected float prezzo;
    @XmlElement(required = true)
    protected BigInteger quantita;

    public TipoProdotto()
    {
    	
    }
    
    public TipoProdotto(String categoria, String codice, String marca, String modello, String descrizione, 
    		float prezzo, BigInteger quantita)
    {
    	setCategoria(categoria);
    	setCodice(codice);
    	setMarca(marca);
    	setModello(modello);
    	setDescrizione(descrizione);
    	setPrezzo(prezzo);
    	setQuantita(quantita);
    }
    
    
    
    @Override
	public String toString() {
		return "Prodotto [categoria=" + categoria + ", codice=" + codice + ", marca=" + marca + ", modello="
				+ modello + ", descrizione=" + descrizione + ", prezzo=" + prezzo + ", quantita=" + quantita + "]";
	}

	/**
     * Recupera il valore della proprietà categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Imposta il valore della proprietà categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Recupera il valore della proprietà codice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodice() {
        return codice;
    }

    /**
     * Imposta il valore della proprietà codice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodice(String value) {
        this.codice = value;
    }

    /**
     * Recupera il valore della proprietà marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Imposta il valore della proprietà marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Recupera il valore della proprietà modello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModello() {
        return modello;
    }

    /**
     * Imposta il valore della proprietà modello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModello(String value) {
        this.modello = value;
    }

    /**
     * Recupera il valore della proprietà descrizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta il valore della proprietà descrizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Recupera il valore della proprietà prezzo.
     * 
     */
    public float getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il valore della proprietà prezzo.
     * 
     */
    public void setPrezzo(float value) {
        this.prezzo = value;
    }

    /**
     * Recupera il valore della proprietà quantita.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantita() {
        return quantita;
    }

    /**
     * Imposta il valore della proprietà quantita.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantita(BigInteger value) {
        this.quantita = value;
    }

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.02.18 alle 06:40:28 PM CET 
//


package magazzino;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prodotto" type="{}tipo_prodotto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prodotto"
})
@XmlRootElement(name = "magazzino")
public class Magazzino 
{

    protected List<TipoProdotto> prodotto;
    
    public Magazzino()
    {
    	prodotto=new ArrayList<TipoProdotto>();
    }

    public void add(TipoProdotto p)
    {
    	prodotto.add(p);
    }
    
    public void add(int posizione,TipoProdotto p)
    {
    	prodotto.add(posizione,p);
    }
    
    public void remove (int posizione)
    {
    	prodotto.remove(posizione);
    }
    
    public TipoProdotto getSingoloProdotto(int posizione)
    {
    	return prodotto.get(posizione);
    }
    
    public int getNumeroElementi()
    {
    	return prodotto.size();
    }
    
    public String toString()
    {
    	return prodotto.toString();
    }
    
    /**
     * Gets the value of the prodotto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodotto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdotto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoProdotto }
     * 
     * 
     */
    public List<TipoProdotto> getProdotto() {
        if (prodotto == null) {
            prodotto = new ArrayList<TipoProdotto>();
        }
        return this.prodotto;
    }

}

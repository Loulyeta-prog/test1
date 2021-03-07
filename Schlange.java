import sum.werkzeuge.*;
/**
 * Beschreiben Sie hier die Klasse Schlange.
 * 
 * @author Loulyeta Al Arnaout
 * @version Februar 2021
 */
public class Schlange
{
    // innere Klasse Knoten
    private class Knoten
    {
        // Bezugsobjekte
        private Object kenntObject;
        private Knoten kenntNachfolger;
        
        // KOnstruktor
        public Knoten(Object pObject)
        {
            kenntObject = pObject;
            kenntNachfolger = null;
        }
        
        //Dienste
        public Object inhalt()
        {
            return kenntObject;
        }
        
        public Knoten nachfolger()
        {
            return kenntNachfolger;
        }
        
        public void setzeNachfolger(Knoten pNachfolger)
        {
            kenntNachfolger = pNachfolger;
        }
    } // Ende der inneren Klasse Knoten **************************************************
    
    // Bezugsobjekte
    private Knoten kenntKopf;
    private Knoten kenntEnde;
    
    private Textwerkzeug hatTW;
    
    // Attribute
    private int zAnzahl;
    
    /**
     * Konstruktor für Objekte der Klasse Schlange
     */
    public Schlange()
    {
        kenntKopf = null;
        kenntEnde = null;
        zAnzahl = 0;
        
        hatTW = new Textwerkzeug();
    }

    // Dienste
    public boolean istLeer()
    {
        return zAnzahl == 0;
    }
    
    public Object erster()
    {
        if(zAnzahl == 0)
            return null;
        else
            return kenntKopf.inhalt();
    }
    
    public void haengeAn(Object pObject)
    {
        if (this.istLeer())
        {
            kenntKopf = new Knoten(pObject);
            kenntEnde = kenntKopf;
        }
        else
        {
            kenntEnde.setzeNachfolger(new Knoten(pObject));
            kenntEnde = kenntEnde.nachfolger();
        }
        zAnzahl = zAnzahl +1;
    }
    
    public void entferneErsten()
    {
        if (!this.istLeer())
        {
            if (zAnzahl ==1)
            {
                kenntKopf = null;
                kenntEnde = null;
            }
            else
            {
                kenntKopf = kenntKopf.nachfolger();
            }
            zAnzahl = zAnzahl -1;
        }
    }
    
    public int laenge()
    {
        return zAnzahl;
    }
    
    public String toString()
    {
        String lString = "";
        Knoten lKnoten = kenntKopf;
        
        if (this.istLeer())
            lString = "leere Schlange ";
        else
            while (lKnoten != null)
            {
                lString = lString + lKnoten.inhalt().toString() + "\n";
                lKnoten = lKnoten.nachfolger();
            }
         if (hatTW.laenge(lString) > 0)
            lString = hatTW.textOhne(lString, hatTW.laenge(lString), hatTW.laenge(lString));
        return lString;
    }    
        
}

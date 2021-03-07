/**
 * Die Klasse SuMAnwendung wurde automatisch erstellt: 
 * 
 * @author Loulyeta Al Arnaout
 * @version 5.2.2021
 */

import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class SuMAnwendung extends EBAnwendung
{
    // Objekte
    private Etikett hatEtikettNameLabel;
    private Textfeld hatTextfeldName;
    private Knopf hatKnopfPatientOhneEkgAnmelden;
    private Etikett hatEtikettKasseLabel;
    private Textfeld hatTextfeldKasse;
    private Knopf hatKnopfPatientMitEkgAnmelden;
    private Etikett hatEtikettWarteraum;
    private Knopf hatKnopfPatientAbmelden;
    private Etikett hatEtikettEKGSchlange;
    private Knopf hatKnopfMessungBeenden;
    private Knopf hatKnopfProgrammBeenden;
    private Etikett hatEtikettArztSchlangeLabel;
    private Etikett hatEtikettEKGSchlangeLabel;
    private Zeilenbereich hatZeilenbereichArztSchlangeKomplett;
    private Zeilenbereich hatZeilenbereichEKGSchlangeKomplett;
    
    private Schlange hatPatSch;
    private Schlange hatEKG;

    // Attribute

/**
 * Konstruktor
 */
    public SuMAnwendung()
    {
        //Initialisierung der Oberklasse
        super(1200, 500);

        hatEtikettNameLabel = new Etikett(100, 100, 100, 25, "Name:");
        // Ausrichtung
        hatEtikettNameLabel.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldName = new Textfeld(225, 100, 100, 25, "");
        // Ausrichtung
        hatTextfeldName.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfPatientOhneEkgAnmelden = new Knopf(400, 100, 200, 25, "Patient ohne EKG anmelden");
        hatKnopfPatientOhneEkgAnmelden.setzeBearbeiterGeklickt("hatKnopfPatientOhneEkgAnmeldenGeklickt");
        hatEtikettKasseLabel = new Etikett(100, 140, 100, 25, "Kasse:");
        // Ausrichtung
        hatEtikettKasseLabel.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldKasse = new Textfeld(225, 140, 100, 25, "");
        // Ausrichtung
        hatTextfeldKasse.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfPatientMitEkgAnmelden = new Knopf(400, 140, 200, 25, "Patient mit EKG anmelden");
        hatKnopfPatientMitEkgAnmelden.setzeBearbeiterGeklickt("hatKnopfPatientMitEkgAnmeldenGeklickt");
        hatEtikettWarteraum = new Etikett(100, 250, 240, 25, "Warteraum:");
        // Ausrichtung
        hatEtikettWarteraum.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfPatientAbmelden = new Knopf(400, 250, 150, 25, "Patient abmelden");
        hatKnopfPatientAbmelden.setzeBearbeiterGeklickt("hatKnopfPatientAbmeldenGeklickt");
        hatEtikettEKGSchlange = new Etikett(100, 290, 240, 25, "EKG-Schlange:");
        // Ausrichtung
        hatEtikettEKGSchlange.setzeAusrichtung(Ausrichtung.LINKS);
        hatKnopfMessungBeenden = new Knopf(400, 290, 150, 25, "Messung beenden");
        hatKnopfMessungBeenden.setzeBearbeiterGeklickt("hatKnopfMessungBeendenGeklickt");
        hatKnopfProgrammBeenden = new Knopf(100, 400, 150, 25, "Programm beenden");
        hatKnopfProgrammBeenden.setzeBearbeiterGeklickt("hatKnopfProgrammBeendenGeklickt");
        
        hatEtikettArztSchlangeLabel = new Etikett(700,100,100,25, "Arzt-Schlange");
        hatEtikettArztSchlangeLabel.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereichArztSchlangeKomplett = new Zeilenbereich(700, 140, 150, 285,"");
        
        hatEtikettEKGSchlangeLabel = new Etikett(900,100,100,25, "EKG-Schlange");
        hatEtikettEKGSchlangeLabel.setzeAusrichtung(Ausrichtung.LINKS);
        hatZeilenbereichEKGSchlangeKomplett = new Zeilenbereich(900, 140, 150, 285,"");
        
        hatPatSch = new Schlange();
        hatEKG = new Schlange();
    }

    private void aktualisiere()
    {
        if (hatPatSch.laenge() > 0)
        {
            hatEtikettWarteraum.setzeInhalt("Warteraum: " + 
                                             ((Patient)hatPatSch.erster()).name() + ", " +
                                             ((Patient)hatPatSch.erster()).kasse() + ", " +  
                                             hatPatSch.laenge());
                    }
        else
        {
            hatEtikettWarteraum.setzeInhalt("Warteraum: keiner");
        }
        hatZeilenbereichArztSchlangeKomplett.setzeInhalt(hatPatSch.toString());                                 
        
        if (hatEKG.laenge() > 0)
        {
            hatEtikettEKGSchlange.setzeInhalt("EKG-Schlange: " + 
                                             ((Patient)hatEKG.erster()).name() + ", " +
                                             ((Patient)hatEKG.erster()).kasse() + ", " +  
                                             hatEKG.laenge());
        }
        else
        {
            hatEtikettEKGSchlange.setzeInhalt("EKG-Schlange: keiner");
        }
        hatZeilenbereichEKGSchlangeKomplett.setzeInhalt(hatEKG.toString());                                              
    }
    
/**
 * Vorher: Ereignis GeklicktvonhatKnopfPatientOhneEkgAnmelden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfPatientOhneEkgAnmeldenGeklickt()
    {
        Patient lPatient = new Patient(hatTextfeldName.inhaltAlsText(),hatTextfeldKasse.inhaltAlsText());
        hatPatSch.haengeAn(lPatient);
        this.aktualisiere();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfPatientMitEkgAnmelden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfPatientMitEkgAnmeldenGeklickt()
    {
        Patient lPatient = new Patient(hatTextfeldName.inhaltAlsText(),hatTextfeldKasse.inhaltAlsText());
        hatPatSch.haengeAn(lPatient);
        hatEKG.haengeAn(lPatient);
        this.aktualisiere();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfPatientAbmelden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfPatientAbmeldenGeklickt()
    {
        hatPatSch.entferneErsten();
        this.aktualisiere();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfMessungBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfMessungBeendenGeklickt()
    {
        hatEKG.entferneErsten();
        this.aktualisiere();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfProgrammBeenden fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfProgrammBeendenGeklickt()
    {
        this.beenden();
    }

}

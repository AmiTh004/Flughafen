public class Flugzeug {

    //static int _anzahlFlugzeuge;
    String _flugzeugnummer;
    String _hersteller;
    int _maxpassagiere;
    int _maxpiloten;
    Airline _airline;

    public Flugzeug(String hersteller, Airline airline, String flugzeugnummer){
        //Ausgeklammert, noch zu kompliziert (aus Github übernommen)
        /*// Anzahl der Flugzeuge um eins erhoehen, diese wird fuer die eindeutige Flugnummer benoetigt
        _anzahlFlugzeuge++;
      
        // Flugnummer aus Kuerzel und eindeutiger ID generieren
        _flugnummer = Airline.getKuerzel() + (_anzahlFlugzeuge + 100);*/
        this.setHersteller(hersteller);
        this.setAirline(airline); 
        this.setFlugzeugnummer(flugzeugnummer);
    }

    //Setter und Getter
    /*public static int getAnzahlFlugzeuge() {
        return _anzahlFlugzeuge;
    }*/
    public String getFlugzeugnummer() {
        return _flugzeugnummer;
    }
    public String getHersteller() {
        return _hersteller;
    }
    public int getMaxpassagiere() {
        return _maxpassagiere;
    }
    public int getMaxpiloten() {
        return _maxpiloten;
    }
    public Airline getAirline() {
        return _airline;
    }

    /*public static void setAnzahlFlugzeuge(int anzahlFlugzeuge) {
        Flugzeug._anzahlFlugzeuge = anzahlFlugzeuge;
    }*/
    public void setFlugzeugnummer(String flugzeugnummer) {
        this._flugzeugnummer = flugzeugnummer;
    }
    public void setHersteller(String hersteller) {
        this._hersteller = hersteller;
    }
    public void setMaxpassagiere(int maxpassagiere) {
        this._maxpassagiere = maxpassagiere;
    }
    public void setMaxpiloten(int maxpiloten) {
        this._maxpiloten = maxpiloten;
    }
    public void setAirline(Airline airline) {
        this._airline = airline;
    }
}

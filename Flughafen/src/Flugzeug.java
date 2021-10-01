public class Flugzeug {
    String _nummer;
    String _hersteller;
    int _maxpassagiere;
    int _maxpiloten;
    Airline _airline;

    //Setter und Getter
    public String getHersteller() {
        return _hersteller;
    }
    public int getMaxpassagiere() {
        return _maxpassagiere;
    }
    public int getMaxpiloten() {
        return _maxpiloten;
    }
    public String getNummer() {
        return _nummer;
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
    public void setNummer(String nummer) {
        this._nummer = nummer;
    }
}

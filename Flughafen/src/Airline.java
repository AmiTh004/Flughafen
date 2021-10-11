public class Airline {
    String _name;
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;
    String _kuerzel; //-> um bei Flugzeig das Kürzel zu verrechenen wird static gebraucht

    //Constructor
    public Airline(String name, String kuerzel){
        this.setName(name);
        this.setKuerzel(kuerzel);
    }

    public Flugzeug getFlugzeug() {
        return _flugzeug;
    }
    public String getName() {
        return _name;
    }
    public Fluglinie getFluglinie() {
        return _fluglinie;
    }
    public String getKuerzel() {
        return _kuerzel;
    }

    public void setFlugzeug(Flugzeug flugzeug) {
        this._flugzeug = flugzeug;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setFluglinie(Fluglinie fluglinie) {
        this._fluglinie = fluglinie;
    }
    public void setKuerzel(String kuerzel) {
        _kuerzel = kuerzel;
    }
}

public class Fluglinie {
    String _name;   // KürzelStart-KürzelZiel
    String _abflugOrt;
    String _zielOrt;
    Airline _airline;

    public Fluglinie(String name, Airline airline){
        this.setAirline(airline);
        this.setName(name);
    }

    public Airline getAirline() {
        return _airline;
    }
    public String getName() {
        return _name;
    }
    public String getAbflugOrt() {
        return _abflugOrt;
    }
    public String getZielOrt() {
        return _zielOrt;
    }

    public void setAirline(Airline airline) {
        this._airline = airline;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setAbflugOrt(String abflugOrt) {
        this._abflugOrt = abflugOrt;
    }
    public void setZielOrt(String zielOrt) {
        this._zielOrt = zielOrt;
    }
}

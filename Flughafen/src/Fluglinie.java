public class Fluglinie {
    String _name;   // KürzelStart-KürzelZiel
    Flughafen _abflugOrt; //Eigentlich retundant, weil über Airline und Terminal der Flughafen schon bekannt ist.
    String _zielOrt;
    Airline _airline;

    public Fluglinie(String zielOrt, Airline airline){
        this.setAirline(airline);
        this.setZielOrt(zielOrt);
    }

    public Airline getAirline() {
        return _airline;
    }
    public String getName() {
        return _name;
    }
    public Flughafen getAbflugOrt() {
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
    public void setAbflugOrt(Flughafen abflugOrt) {
        this._abflugOrt = abflugOrt;
    }
    public void setZielOrt(String zielOrt) {
        this._zielOrt = zielOrt;
    }
}

public class Fluglinie {
    String _name;   // KürzelStart-KürzelZiel
    Airline _airline;

    public Airline getAirline() {
        return _airline;
    }
    public String getName() {
        return _name;
    }

    public void setAirline(Airline airline) {
        this._airline = airline;
    }
    public void setName(String name) {
        this._name = name;
    }
}

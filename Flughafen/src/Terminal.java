public class Terminal {
    String _name;
    Airline _airline;

    //Setter und Getter
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

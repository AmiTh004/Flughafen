public class Terminal extends Methoden{
    //Eigenschaften
    String _name;
    Flughafen _flughafen;

    Airline[] _airlines;

    //Constructor
    public Terminal(String name, Flughafen flughafen){
        this.setFlughafen(flughafen);
        this.setName(name);
    }

    //Arraymethoden
    public Airline[] getALLAirlines() {
        return _airlines;
    }

    public void addAirline(Airline airline) {
        addObject(airline, getALLAirlines());
    }

    //Setter und Getter
    public String getName() {
        return _name;
    }
    public Flughafen getFlughafen() {
        return _flughafen;
    }

    public void setName(String name) {
        this._name = name;
    }
    public void setFlughafen(Flughafen flughafen) {
        this._flughafen = flughafen;
    }
}

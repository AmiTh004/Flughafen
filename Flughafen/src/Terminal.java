public class Terminal {
    String _name;
    Flughafen _flughafen;

    //Constructor
    public Terminal(String name, Flughafen flughafen){
        this.setFlughafen(flughafen);
        this.setName(name);
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

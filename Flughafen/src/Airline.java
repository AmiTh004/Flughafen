public class Airline {
    String _name;
    String _kuerzel; //-> um bei Flugzeug das Kürzel zu verrechenen wird static gebraucht
    Terminal _terminal;

    //Arrays
    Flugzeug[] _flugzeuge;
    Fluglinie[] _fluglinien;

    //Constructor
    public Airline(String name, String kuerzel, Terminal terminal){
        this.setName(name);
        this.setKuerzel(kuerzel);
        this.setTerminal(terminal);
    }

    public String getName() {
        return _name;
    }
    
    public String getKuerzel() {
        return _kuerzel;
    }

    public Terminal getTerminal() {
        return _terminal;
    }
    
    public void setName(String name) {
        this._name = name;
    }

    public void setKuerzel(String kuerzel) {
        _kuerzel = kuerzel;
    }

    public void setTerminal(Terminal terminal) {
        this._terminal = terminal;
    }
}

public class Flughafen extends Methoden{
    //Eigenschaften
    String _name;
    String _kuerzel;
    String _standort;

    Terminal[] _terminals;
    Bahn[] _bahnen;


    //Constructor
    public Flughafen(String name, String kuerzel, String standort){
        this.setName(name);
        this.setKuerzel(kuerzel);
        this.setStandort(standort);
        this._terminals = new Terminal[3];
        this._bahnen = new Bahn[3];
    }

    //Arraymethoden, vorher in der App, Terminal kann jetzt nur noch über einen Flughafen hinzugefügt werden.
    public void addTerminal(Terminal terminal) {
        addObject(terminal, getALLTerminals());
    }

    public Terminal[] getALLTerminals() {
        return _terminals;
    }

    public void addBahn(Bahn bahn) {
        addObject(bahn, getALLBahnen());
    }

    public Bahn[] getALLBahnen() {
        return _bahnen;
    }

    //Setter und Getter
    public String getName() {
        return _name;
    }
    public String getKuerzel() {
        return _kuerzel;
    }
    public String getStandort() {
        return _standort;
    }

    public void setKuerzel(String kuerzel) {
        this._kuerzel = kuerzel;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setStandort(String standort) {
        this._standort = standort;
    }
}

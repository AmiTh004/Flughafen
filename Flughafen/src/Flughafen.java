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
        //Legt die maximalen anzahlen von Terminals und Bahnen fest
        this._terminals = new Terminal[3];
        this._bahnen = new Bahn[3];
    }

    //Printmethode:
    public void show() {
        System.out.println(" Name: "+ _name + "\n Kürzel: "+ _kuerzel+"\n Standort: "+_standort+"\n Bahnen:");
        // zum besseren verständnis werden die Arrays durchnummeririert
        int i =1;
        for (Bahn bahn : getALLBahnen()) {
            if (bahn != null) {
                System.out.println(i + ". Bahn: ");
                bahn.show();
                i++;
            }
        }
        i=1;
        System.out.println("Terminals: ");
        for (Terminal terminal : getALLTerminals()) {
            if (terminal != null) {
                System.out.println(i + ". Terminal: ");
                terminal.show();
                i++;
            }
        }
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

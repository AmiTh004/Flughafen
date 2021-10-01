public class Flughafen {
    String _name;
    String _kuerzel;
    String _standort;

    //Constructor
    public Flughafen(String name, String kuerzel, String standort){
        this.setName(name);
        this.setKuerzel(kuerzel);
        this.setStandort(standort);
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

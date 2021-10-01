public class Airline {
    String _name;
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;

    public Flugzeug getFlugzeug() {
        return _flugzeug;
    }
    public String getName() {
        return _name;
    }
    public Fluglinie getFluglinie() {
        return _fluglinie;
    }

    public void setFlugzeug(Flugzeug flugzeug) {
        this._flugzeug = flugzeug;
    }
    public void setName(String name) {
        this._name = name;
    }
    public void setFluglinie(Fluglinie fluglinie) {
        this._fluglinie = fluglinie;
    }
}

public class Flug extends Methoden{

    //Variablen deklarieren
    String _startZeit;
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;
    Bahn _bahn;

    Pilot[] _piloten;
    Passagier[] _passagiere;


    //Constructor
    public Flug(String startZeit, Fluglinie fluglinie, Flugzeug flugzeug, Bahn bahn, Pilot[] piloten, Passagier[] passagiere) {
        this.setStartZeit(startZeit);
        this.setFluglinie(fluglinie);
        this.setFlugzeug(flugzeug);
        this.setBahn(bahn);
        this._passagiere = new Passagier[5];
        this._piloten = new Pilot[2];
    }

    //Printmethode
    public void show() {
        System.out.println("Startzeit: "+ _startZeit +"\nFlugzeug: "+ _flugzeug+"\nBahn: "+_bahn+"\nPiloten: ");
        for (Pilot pilot : getAllPiloten()) {
            if (pilot != null) {
                pilot.show();
            }
        }
        System.out.println("Passagiere: ");
        for (Passagier passagier : getAllPassagiere()) {
            if (passagier != null) {
                passagier.show();
            }
        }
    }

    //Arraymethoden
    public Pilot[] getAllPiloten() {
        return _piloten;
    }

    public Passagier[] getAllPassagiere() {
        return _passagiere;
    }


    //Setter und Gertter
    public void setStartZeit(String startZeit) {
        this._startZeit = startZeit;
    }

    public String getStartZeit() {
        return _startZeit;
    }

    public void setFluglinie(Fluglinie fluglinie) {
        this._fluglinie = fluglinie;
    }

    public Fluglinie getFluglinie() {
        return _fluglinie;
    }

    public void setFlugzeug(Flugzeug flugzeug) {
        this._flugzeug = flugzeug;
    }

    public Flugzeug getFlugzeug() {
        return _flugzeug;
    }

    public void setBahn(Bahn bahn) {
        this._bahn = bahn;
    }
    public Bahn getBahn() {
        return _bahn;
    }


}

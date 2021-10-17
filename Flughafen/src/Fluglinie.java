public class Fluglinie extends Methoden{
    String _name;   // KürzelStart-KürzelZiel
    //Flughafen _abflugOrt; //Eigentlich retundant, weil über Airline und Terminal der Flughafen schon bekannt ist.
    //String _zielOrt;
    //Airline _airline;
    Flug[] _fluege;

    public Fluglinie(String name){
        //this.setAirline(airline);
        this.setName(name);
        this._fluege = new Flug[3];
    }

    //Printmethode
    public void show() {
        System.out.println("Name: "+_name);
    }

    public void showFluege() {
        System.out.println("Flüge: ");
        for (Flug flug : getAllFluege()) {
            flug.show();
        }
    }


    //Setter und Getter
    public void addFlug(Flug flug) {
        addObject(flug, getAllFluege());
    }

    public Flug[] getAllFluege() {
        return _fluege;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    /*public Airline getAirline() {
        return _airline;
    }
    
    public Flughafen getAbflugOrt() {
        return _abflugOrt;
    }
    public String getZielOrt() {
        return _zielOrt;
    }

    public void setAirline(Airline airline) {
        this._airline = airline;
    }
    
    public void setAbflugOrt(Flughafen abflugOrt) {
        this._abflugOrt = abflugOrt;
    }
    public void setZielOrt(String zielOrt) {
        this._zielOrt = zielOrt;
    }*/
}

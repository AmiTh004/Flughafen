public class Airline extends Methoden{
    String _name;
    //String _kuerzel; //-> um bei Flugzeug das Kürzel zu verrechenen wird static gebraucht
    
    //Arrays
    Flugzeug[] _flugzeuge;
    Fluglinie[] _fluglinien;
    Pilot [] _piloten;

    //Constructor
    public Airline(String name){
        this.setName(name);
        //this.setKuerzel(kuerzel);
        this._fluglinien = new Fluglinie[3];
        this._flugzeuge = new Flugzeug[5];
        this._piloten = new Pilot[8];
    }

    //Printmetode
    public void show() {
        int i=1;
        System.out.println("Name: "+ _name+"\nFluglinen: ");
        for (Fluglinie fluglinie : getALLFluglinien()) {
            if (fluglinie != null) {
                System.out.println(i+". Fluglinie: ");
                fluglinie.show();
                i++;
            }
        }
        i=1;
        System.out.println("Flugzeuge: ");
        for (Flugzeug flugzeug : getAllFlugzeuge()) {
            if (flugzeug != null) {
                System.out.println(i+". Flugzeug: ");
                flugzeug.show();
                i++;
            }
        }
        i=1;
        System.out.println("Piloten: ");
        for (Pilot pilot : getAllPiloten()) {
            if (pilot != null) {
                System.out.println(i+". Pilot: ");
                pilot.show();
                i++;
            }
        }
    }

    //Arraymethoden
    public void addFlugzeug(Flugzeug flugzeug) {
        addObject(flugzeug, getAllFlugzeuge());
    }

    public void addFluglinie(Fluglinie fluglinie) {
        addObject(fluglinie, getALLFluglinien());
    }

    public void addPilot(Pilot pilot) {
        addObject(pilot, getAllPiloten());
    }

    public Flugzeug[] getAllFlugzeuge() {
        return _flugzeuge;
    }

    public Fluglinie[] getALLFluglinien() {
        return _fluglinien;
    }

    public Pilot[] getAllPiloten() {
        return _piloten;
    }


    //Setter und Getter
    public String getName() {
        return _name;
    }
    
    /*public String getKuerzel() {
        return _kuerzel;
    }*/

    
    public void setName(String name) {
        this._name = name;
    }

    /*public void setKuerzel(String kuerzel) {
        _kuerzel = kuerzel;
    }*/
}

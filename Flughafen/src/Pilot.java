public class Pilot extends Person{
    Airline _airline;

    public Pilot(String vorname, String nachname, Airline airline) {
        super(vorname, nachname);
        this.setAirline(airline);
    } 

    public Airline getAirline() {
        return _airline;
    }

    public void setAirline(Airline airline) {
        this._airline = airline;
    }
    /*String _vorname;
    String _nachname;


    public void setGanzerName(){
        System.out.println(_vorname +" "+ _nachname);
    }

    public String getNachname(){
        return _nachname;
    }
    public String getVorname() {
        return _vorname;
    }

    public void setNachname(String nachname) {
        this._nachname = nachname;
    }
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }*/
}

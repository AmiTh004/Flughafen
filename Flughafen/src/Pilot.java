public class Pilot {
    String _vorname;
    String _nachname;

    public void getGanzerName(){
        System.out.println(_vorname + _nachname);
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
    }
}

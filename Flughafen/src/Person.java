public class Person {
    String _vorname;
    String _nachname;

    public Person(String vorname, String nachname) {
        this.setNachname(nachname);
        this.setVorname(vorname);
    }

    //Printmethode
    public void show() {
        System.out.println("Name: "+ _vorname+" "+_nachname);
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

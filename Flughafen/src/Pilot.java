public class Pilot extends Person{
    //hat seine Eigenschaften aus der Klasse Person geerbt
    public Pilot(String vorname, String nachname) {
        //mit super werden eigenschaften der Oberklasse übernommen
        super(vorname, nachname);
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

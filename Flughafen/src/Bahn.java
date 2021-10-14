public class Bahn {

    String _name;
    //Flughafen _flughafen;

    public Bahn (String name){
        this.setName(name);
        //this.setFlughafen(flughafen);
    }
    
    //Getter
    public String getName() {
        return _name;
    }
    /*public Flughafen getFlughafen() {
        return _flughafen;
    }*/

    //Setter
    public void setName(String name) {
        this._name = name;
    }
    /*public void setFlughafen(Flughafen flughafen) {
        this._flughafen = flughafen;
    }*/
}


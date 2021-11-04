//import jdk.internal.org.jline.terminal.Terminal;

public class App {

    //static Airline [] _airline;
    static Flughafen [] _flughafen;
    //static Fluglinie [] _fluglinie;
    //static Flugzeug [] _flugzeug;
    //static Pilot [] _pilot;
    //static Terminal [] _terminal;
    public static void main(String[] args) throws Exception {
        
        //_airline = new Airline [3]; 
        _flughafen = new Flughafen [2];
        //_fluglinie = new Fluglinie [6];
        //_flugzeug = new Flugzeug [20]; //es gibt maximal 20 Flugzeuge, von allen Airlines
        //_pilot = new Pilot [10];
        //_terminal = new Terminal [3];

        //Demodaten
        _flughafen[0] = new Flughafen("Helmut Schmitt", "HAM", "Hamburg");  //Flughafen

        _flughafen[0].addBahn(new Bahn("Süd-Nord"));    //Eine Bahn zum Flughafen hinzugefügt
        Bahn b1 = _flughafen[0]._bahnen[0];             //Dieser für bessere übersicht einen Namen geben    

        _flughafen[0].addTerminal(new Terminal("T1"));

        _flughafen[0]._terminals[0].addAirline(new Airline("Schwanenairline"));
        Airline air1 = _flughafen[0]._terminals[0]._airlines[0]; //im folgenden abgekürzt

        air1.addFluglinie(new Fluglinie("Hamburg-Brüssel"));
        Fluglinie fl1 = air1._fluglinien[0];

        air1.addFlugzeug(new Flugzeug("Boing", "SA101"));
        air1.addFlugzeug(new Flugzeug("Airbuns", "SA102"));
        air1.addFlugzeug(new Flugzeug("Boing", "SA103"));

        air1.addPilot(new Pilot("Heinz", "Günter"));
        air1.addPilot(new Pilot("Mama", "Olchi"));
        Pilot p1= air1._piloten[0];
        Pilot p2 = air1._piloten[1];
        Pilot[] piloten = {p1, p2};

        //Das ganze für einen zweiten Terminal, dieses Mal ausgeschrieben
        _flughafen[0].addBahn(new Bahn("SN"));
        _flughafen[0].addTerminal(new Terminal("T2"));
        _flughafen[0]._terminals[1].addAirline(new Airline("Lufthansa"));
        _flughafen[0]._terminals[1]._airlines[0].addFlugzeug(new Flugzeug("Airbus", "A380"));
        _flughafen[0]._terminals[1]._airlines[0].addFlugzeug(new Flugzeug("Airbus", "A320"));
        _flughafen[0]._terminals[1]._airlines[0].addFlugzeug(new Flugzeug("Airbus", "A280"));
        _flughafen[0]._terminals[1]._airlines[0]._flugzeuge[0]._flugzeugnummer = "A20";
        //Kontrolle, ob die Array erstellt wird
        if (_flughafen[0]._terminals[1]._airlines[0].getAllFlugzeuge() != null) {
            System.out.println(_flughafen[0]._terminals[1]._airlines[0].getAllFlugzeuge());
        }
        else{
            System.out.println("Immer noch nicht.");
        }
        System.out.println(_flughafen[0]._terminals[0].getALLAirlines());

        //Passagiere erstellen
        Passagier ps1 = new Passagier("Heinz", "Möller");
        Passagier ps2 = new Passagier("Petra", "Möller");
        //Aus den daten ein Array machen
        Passagier[] imFlugzeug = {ps1, ps2};

        //Flug erstellen
        air1._fluglinien[0].addFlug(new Flug("20:30",fl1 , air1._flugzeuge[0] , b1, piloten , imFlugzeug));
        Flug flug1 = air1._fluglinien[0]._fluege[0];
        

        //Mögliche ausgaben
        //air1.show();
        _flughafen[0].show();
        //flug1.show();

        //TODO: parameter Depth 
        
        

    }

    //Übernommen aus Autohaus:
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array) {
            if(a == null){
                array[i]= ele;
                break;
            }
            i++;
        }
    }

    

    public static void addFlughafen(Flughafen flughafen) {
        addObject(flughafen, getAllFlughaefen());
    }

    public static Flughafen[] getAllFlughaefen() {
        return _flughafen;
    }
    
    

    
}

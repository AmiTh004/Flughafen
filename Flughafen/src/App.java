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

        _flughafen[0] = new Flughafen("Helmut Schmitt", "HAM", "Hamburg");
        _flughafen[0].addTerminal(new Terminal("T1"));
        _flughafen[0]._terminals[0].addAirline(new Airline("Schwanenairline"));
        _flughafen[0]._terminals[0]._airlines[0].addFluglinie(new Fluglinie("Hamburg-Brüssel"));
        _flughafen[0]._terminals[0]._airlines[0].addFlugzeug(new Flugzeug("Boing", "SA101"));
        _flughafen[0]._terminals[0]._airlines[0].addPilot(new Pilot("Heinz", "Günter"));

        _flughafen[0].addBahn(new Bahn("SN"));
        _flughafen[0].addTerminal(new Terminal("T2"));
        _flughafen[0]._terminals[1].addAirline(new Airline("Lufthansa"));
        _flughafen[0]._terminals[1]._airlines[0].addFlugzeug(new Flugzeug("Airbus", "A380"));
        _flughafen[0]._terminals[1]._airlines[0]._flugzeuge[0]._flugzeugnummer = "A20";
        if (_flughafen[0]._terminals[1]._airlines[0].getAllFlugzeuge() != null) {
            System.out.println(_flughafen[0]._terminals[1]._airlines[0].getAllFlugzeuge());
        }
        else{
            System.out.println("Immer noch nicht.");
        }
        System.out.println(_flughafen[0]._terminals[0].getALLAirlines());
        
        //Demodaten
        /*_airline [0] = new Airline("Lufthansa", "LH", _terminal[0]);
        _airline [1] = new Airline("Norwegian Airways", "NO", _terminal[1]);

        _flughafen [0] = new Flughafen("Helmut Schmitt", "HAM", "Hamburg");

        _fluglinie [0] = new Fluglinie("HAM-FRA", _airline[0]);        
        _fluglinie [1] = new Fluglinie("HAM-OSL", _airline[1]);
        
        _flugzeug [0] = new Flugzeug("Airbus", _airline[1], "NO101");
        _flugzeug [1] = new Flugzeug("Boing", _airline[1], "NO102");
        _flugzeug [2] = new Flugzeug("Airbus", _airline[0],"LH101");
        _flugzeug [3] = new Flugzeug("Airbus", _airline[0],"LH102");

        _pilot [0] = new Pilot("Heinz", "Fuchs", _airline[0]);
        _pilot [1] = new Pilot("Bart", "Simson", _airline[0]);
        _pilot [2] = new Pilot("Charlie", "Chaplin", _airline[0]);

        _terminal [0] = new Terminal("T1", _flughafen[0]);
        _terminal [1] = new Terminal("T2", _flughafen[0]);
        

        //Menu menu = new Menu();
        //menu.startMenu();*/

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

    //TODO: die nachvolgenden Methoden auf die entsprechenden Klassen aufteilen, 
    //z.B. Terminals können nur über Flughäfen erstellt weden. Ein Flugzeug kann durch eine airline erstellt werden. Also in der Klasse Airline muss die Methode addFlugzeug abrufbar sein.
    //flughafen_1.terminal_1.airline_1.addFlugzeug();

    

    public static void addFlughafen(Flughafen flughafen) {
        addObject(flughafen, getAllFlughaefen());
    }

    

    public static Flughafen[] getAllFlughaefen() {
        return _flughafen;
    }
    
    

    
}

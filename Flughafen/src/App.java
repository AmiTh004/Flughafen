public class App {

    static Airline [] _airline;
    static Flughafen [] _flughafen;
    static Fluglinie [] _fluglinie;
    static Flugzeug [] _flugzeug;
    static Pilot [] _pilot;
    static Terminal [] _terminal;
    public static void main(String[] args) throws Exception {
        
        _airline = new Airline [3]; 
        _flughafen = new Flughafen [2];
        _fluglinie = new Fluglinie [6];
        _flugzeug = new Flugzeug [20]; //es gibt maximal 20 Flugzeuge, von allen Airlines
        _pilot = new Pilot [10];
        _terminal = new Terminal [3];
        
        //Demodaten
        _airline [0] = new Airline("Lufthansa", "LH");
        _airline [1] = new Airline("Norwegian Airways", "NO");

        _flughafen [0] = new Flughafen("Helmut Schmitt", "HAM", "Hamburg");

        _fluglinie [0] = new Fluglinie("HAM-FRA", _airline[0]);        _fluglinie [1] = new Fluglinie("HAM-OSL", _airline[1]);
        
        _flugzeug [0] = new Flugzeug("Airbus", _airline[1], "NO101");
        _flugzeug [1] = new Flugzeug("Boing", _airline[1], "NO102");
        _flugzeug [2] = new Flugzeug("Airbus", _airline[0],"LH101");
        _flugzeug [3] = new Flugzeug("Airbus", _airline[0],"LH102");

        _pilot [0] = new Pilot("Heinz", "Fuchs", _airline[0]);
        _pilot [1] = new Pilot("Bart", "Simson", _airline[0]);
        _pilot [2] = new Pilot("Charlie", "Chaplin", _airline[0]);

        _terminal [0] = new Terminal("T1", _airline[0]);

        Menu menu = new Menu();
        menu.startMenu();

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

    public static void addFlugzeug(Flugzeug flugzeug) {
        addObject(flugzeug, getAllFlugzeuge());
    }

    public static void addAirline(Airline airline) {
        addObject(airline, getALLAirlines());
    }

    public static void addFluglinie(Fluglinie fluglinie) {
        addObject(fluglinie, getALLFluglinien());
    }

    public static void addFlughafen(Flughafen flughafen) {
        addObject(flughafen, getAllFlughaefen());
    }

    public static void addPilot(Pilot pilot) {
        addObject(pilot, getAllPiloten());
    }

    public static void addTerminal(Terminal terminal) {
        addObject(terminal, getALLTerminals());
    }


    public static Flugzeug[] getAllFlugzeuge() {
        return _flugzeug;
    }

    public static Airline[] getALLAirlines() {
        return _airline;
    }
    
    public static Fluglinie[] getALLFluglinien() {
        return _fluglinie;
    }

    public static Flughafen[] getAllFlughaefen() {
        return _flughafen;
    }
    
    public static Pilot[] getAllPiloten() {
        return _pilot;
    }

    public static Terminal[] getALLTerminals() {
        return _terminal;
    }
}

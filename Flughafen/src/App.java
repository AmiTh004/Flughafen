public class App {

    static Flugzeug [] _flugzeug;
    static Airline [] _airline;
    static Fluglinie [] _fluglinie;
    public static void main(String[] args) throws Exception {
        
        _flugzeug = new Flugzeug [20]; //es gibt maximal 20 Flugzeuge, von allen Airlines
        _airline = new Airline [3]; 
        _fluglinie = new Fluglinie [6];
        
        //Demodaten
        _airline [0] = new Airline("Lufthansa", "LH");
        //_airline [1] = new Airline("Norwegian Airways", "ER");
        
        _flugzeug [0] = new Flugzeug("Airbus", _airline[0]);
        _flugzeug [1] = new Flugzeug("Boing", _airline[0]);
        _flugzeug [2] = new Flugzeug("Airbus", _airline[0]);
        _flugzeug [3] = new Flugzeug("Airbus", _airline[0]);
        


        System.out.println(_flugzeug[0].getFlugnummer());
        System.out.println(_flugzeug[1].getFlugnummer());
        System.out.println(_flugzeug[2].getFlugnummer());
        System.out.println(_flugzeug[3].getFlugnummer());
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

    public static Flugzeug[] getAllFlugzeuge() {
        return _flugzeug;
    }

    public static Airline[] getALLAirlines() {
        return _airline;
    }
    
    public static Fluglinie[] getALLFluglinien() {
        return _fluglinie;
    }
}

import java.util.Scanner;

public class Menu {
    Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neueingabe");
        System.out.println("(2) Elemente Ausgeben");
        System.out.println("(3) Flug Buchen");
        String choice = getScanner().nextLine();

        // if(variable operator vergleichswert): TRUE?
        if(choice.equals("1")){
            createAirlineMenu();
        }

        // weitere Bedingung
        else if(choice.equals("2")){
            createFlughafenMenu();
        }

        else if(choice.equals("3")){
            createFluglinieMenu();
        }

        else if(choice.equals("4")){
            //createFlugzeugMenu();
        }

        else if(choice.equals("5")){
            //createPilotMenu();
        }

        else if(choice.equals("6")){
            //createTerminalMenu();
        }

        else if(choice.equals("7")){
            //showAirlines();
        }

        else{
            System.out.println("Bitte eine Zahl zwischen 1 und 7 eingeben!!!");
        }

        startMenu();
    }

    /*public void createObjectMenu(){
        System.out.println("Gebe die Dinge ein, die Du für das neue Objekt brauchst:");
        System.out.println("Airline: name und kuerzel");
        System.out.println("Flughafen: name, kuerzel und standort");
        System.out.println("Fluglinie: name und Airline");
        System.out.println("Flugzeug: hersteller, airline und flugzeugnummer");
        System.out.println("Pilot: vorname, nachname und airline");
        System.out.println("Terminal: name und airline");

        String choice1 = getScanner().nextLine();
        String choice2 = getScanner().nextLine();
        String choice3 = getScanner().nextLine();
    }*/

    public void createAirlineMenu(){
        System.out.println("Name:");
        String name = getScanner().nextLine();
        System.out.print("Kürzel:");
        String kuerzel = getScanner().nextLine();

        App.addAirline(new Airline(name, kuerzel));
    }

    public void createFlughafenMenu() {
        System.out.println("Name:");
        String name = getScanner().nextLine();
        System.out.print("Kürzel:");
        String kuerzel = getScanner().nextLine();
        System.out.print("Standort:");
        String standort = getScanner().nextLine();

        App.addFlughafen(new Flughafen(name, kuerzel, standort));
    }

    public void createFluglinieMenu() {
        System.out.println("Name:");
        String name = getScanner().nextLine();
        System.out.println("Wähle eine Airline:");
        //Airline aussuchen
        int i = 0;
        for (Airline airline : App.getALLAirlines()) {
            if (airline != null) {
                System.out.println(i + " - "+ airline.getName());
                i++;
            }
        }
        String airline_choice = getScanner().next();
        int airline_index = Integer.valueOf(airline_choice);

        App.addFluglinie(new Fluglinie(name, App.getALLAirlines()[airline_index]));

        System.out.println(App.getALLAirlines());
    }

    public Scanner getScanner() {
        return _scanner;
    }

    public void setScanner(Scanner scanner) {
        this._scanner = scanner;
    }
}

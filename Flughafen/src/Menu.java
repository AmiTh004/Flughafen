import java.util.Scanner;

public class Menu extends Methoden{
    Scanner _scanner;

    public Menu(){
        setScanner(new Scanner(System.in));
    }

    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("1 - Neueingabe");
        System.out.println("2 - Elemente Ausgeben");
        System.out.println("2 - Flug Buchen");
        String choice = getScanner().nextLine();

        if (choice.equals("1")) {
            System.out.println("Von welchem Typ möchtest du ein Neues Objekt erstellen? \n 1 - Airline \n 2 - Flughafen \n 3 - Flugline\n 4 - Flugzeug \n 5 - Pilot \n 6 - Terminal");
            String eingChoice = getScanner().nextLine();

            if(eingChoice.equals("1")){
                createAirlineMenu();
            }
    
            // weitere Bedingung
            else if(eingChoice.equals("2")){
                createFlughafenMenu();
            }
    
            else if(eingChoice.equals("3")){
                createFluglinieMenu();
            }
    
            else if(eingChoice.equals("4")){
                //createFlugzeugMenu();
            }
    
            else if(eingChoice.equals("5")){
                //createPilotMenu();
            }
    
            else if(eingChoice.equals("6")){
                //createTerminalMenu();
            }

            else{
                System.out.println("Bitte eine Zahl zwischen 1 und 6 eingeben!!!");
            }
        }

        else if (choice.equals("2")){
            System.out.println("Welche Objekte möchtest du dir ausgeben lassen? \n 1 - Airlines \n 2 - Flughäfen \n 3 - Fluglinen\n 4 - Flugzeuge \n 5 - Piloten \n 6 - Terminals");
            String ausgChoice = getScanner().nextLine();

            
            if(ausgChoice.equals("1")){
                //showAirlines();
            }

            else if(ausgChoice.equals("2")){
                //showFlughaefen();
            }
    
            else if(ausgChoice.equals("3")){
                //showFluglinie();
            }
    
            else if(ausgChoice.equals("4")){
                //showFlugzeug();
            }
    
            else if(ausgChoice.equals("5")){
                //showPilot();
            }
    
            else if(ausgChoice.equals("6")){
                //showTerminals();
            }

            else{
                System.out.println("Bitte eine Zahl zwischen 1 und 6 eingeben!!!");
            }

        }

        else if (choice.equals("3")){
            System.out.println("Flugbuchung noch nicht implementiert...");
        }

        
        else{
            System.out.println("1, 2 oder 3!!!");
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
        int numNewFluglinie = elesInArray(App.getALLFluglinien());
        String airline_choice = getScanner().next();
        int airline_index = Integer.valueOf(airline_choice);

        if (airline_index == numNewFluglinie) {
            
        } else {
            
        }

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

public class Methoden {

    //Oberklasse, über die generelle Methoden vererbt werden.

    public int elesInArray(Object[] array){
        int i = 0;
        for (Object object : array) {
            if (object != null) {
                i++;
            }
        }
        return i;
    }

    public void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a : array) {
            if(a == null){
                array[i]= ele;
                break;
            }
            i++;
        }
        //Fehlermendung, falls das Array voll ist.
        if (i== array.length) {
            System.out.println("Die Liste ist voll, es können keine neuen Objekte erstellt werden.");
        }
    }
}

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
    }
}

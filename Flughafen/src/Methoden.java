public class Methoden {

    public int elesInArray(Object[] array){
        int i = 0;
        for (Object object : array) {
            if (object != null) {
                i++;
            }
        }
        return i;
    }
}

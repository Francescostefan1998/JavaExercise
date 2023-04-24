package package2;

public class Numbers {

    public int[] arrayOfInt = initializeIntArr();

    public static int[] initializeIntArr() {
        int[] arrayOfInt = new int[4];
        arrayOfInt[0] = 2;
        arrayOfInt[1] = 3;
        arrayOfInt[2] = 5;
        arrayOfInt[3] = 8;
        return arrayOfInt;
    }
}

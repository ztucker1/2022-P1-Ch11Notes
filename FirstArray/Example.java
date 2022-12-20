public class Example{
    public static void main(String args[]){

        //arrays store one data type
        int numberOfChristmasGifts[];
        numberOfChristmasGifts = new int[100];


        for (int i = 0; i < numberOfChristmasGifts.length; i++){
            numberOfChristmasGifts[i] = 6;
            System.out.println(numberOfChristmasGifts[i]);
        }

        /*
        numberOfChristmasGifts[0] = 7;
        numberOfChristmasGifts[1] = 3;

        System.out.println(numberOfChristmasGifts[0]);
        System.out.println(numberOfChristmasGifts[1]);
        */

    }


}
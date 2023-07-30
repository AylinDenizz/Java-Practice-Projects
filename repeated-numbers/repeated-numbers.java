public class Main {
    public static void main(String[] args) {

        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20} ;
        for (int i=0; i < dizi.length; i++) {
            int repeatingTime = 0;
            int number = dizi[i];
            for (int j = 0 ; j< dizi.length; j++){
                int repeatedNumber = dizi[j];
                if (repeatedNumber ==  number) {
                    repeatingTime++;
                }
            }
            System.out.println(number + " sayısı: " + repeatingTime + " kez tekrar etmiştir.");
        }
    }
}

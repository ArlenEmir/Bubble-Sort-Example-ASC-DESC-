package bubbleSort;

public class Kabarcık_Sıralaması {

    private static void kabarcıkAlgoritmasi(int[] intDizi) {
        int n = intDizi.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(intDizi[j-1] < intDizi[j]){
                    temp = intDizi[j-1];
                    intDizi[j-1] = intDizi[j];
                    intDizi[j] = temp;
                }

            }
        }
    }
    private static void kabarcıkAlgoritmasıTersten(int[] intTersdizi) {
        int n = intTersdizi.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intTersdizi[j - 1] < intTersdizi[j]) {
                    temp = intTersdizi[j - 1];
                    intTersdizi[j - 1] = intTersdizi[j];
                    intTersdizi[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int intDizi[] = new int[]{5,9,3,45,654,3511};
        System.out.println("Sıralama Öncesi Dizi: ");
        for(int i=0; i < intDizi.length; i++){
            System.out.print(intDizi[i] + " ");
        }
        System.out.println("");

        kabarcıkAlgoritmasi(intDizi);

        System.out.println("");

//sıralama sonrasi ekran görüntüsü.
        System.out.println("Sıralama sonrasi Dizi:");
        for(int i=0; i < intDizi.length; i++){
            System.out.print(intDizi[i] + " ");
        }

    }
    /*public static void main(String[] args) {
        int intTersdizi[] = {5,9,3,45,654,3511};
        System.out.println("Sıralama Öncesi Dizi: ");
        for (int i = 0; i < intTersdizi.length; i++) {
            System.out.print(intTersdizi[i] + " ");
        }
        System.out.println();
        kabarcıkAlgoritmasıTersten(intTersdizi);
        System.out.println(Sıralama Sonrası Dizi: ");
        for (int i = 0; i < intTersdizi.length; i++) {
            System.out.print(intTersdizi[i] + " ");
        }
    }*/
}


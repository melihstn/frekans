
public class Main {
    public static void main(String[] args) {

        int[] list = {10,20,40,20,80,70,70,80,90};

        int onSayisi = 0, yirmiSayisi = 0, kirkSayisi = 0, yetmisSayisi = 0, seksenSayisi = 0, doksanSayisi = 0;

        for (int i = 0; i < list.length; i++){

            if(list[i] == 10){
                onSayisi++;

            } else if (list[i] == 20) {
                yirmiSayisi++;

            } else if (list[i] == 40) {
                kirkSayisi++;

            } else if (list[i] == 70) {
                yetmisSayisi++;

            } else if (list[i] == 80) {
                seksenSayisi++;

            } else if (list[i] == 90) {
                doksanSayisi++;

            }


        }
        System.out.println("10 adedi sayisi : " + onSayisi);
        System.out.println("20 adedi sayisi :" + yirmiSayisi);
        System.out.println("40 adedi sayisi : " + kirkSayisi);
        System.out.println("70 adedi sayisi : " + yetmisSayisi);
        System.out.println("80 adedi sayisi : " + seksenSayisi);
        System.out.println("90 adedi sayisi : " + doksanSayisi);

    }
    }

public class BelajarIf{
    public static void main(String[] args) {

        // if saja
        boolean hujan = false;
        if(hujan){ // kondisi akan dijalankan ketika kondisi sudah benar
            System.out.println("Bawa Payung");
        }

        // if else
        int nilai = 90;
        if(nilai > 75){ // kondisi akan dijalankan ketika kondisi sudah benar
            System.out.println("Anda Lulus");
        }else{
            System.out.println("Maaf anda tidak lulus");
        }

        // if else if

        boolean adaPayung = false;

        if(hujan==true && adaPayung==true){
            System.out.println("Boleh Keluar Rumah");
        }else if(hujan==true && adaPayung==false){
            System.out.println("tidak boleh keluar rumah");
        }else if(hujan==false && adaPayung==true){
            System.out.println("Boleh keluar rumah tapi payungnya gaknkepake");
        }else{
            System.out.println("Boleh keluar rumah karena tidak hujan dan tidak punya payung");
        }

    }
}
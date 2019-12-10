class Grade{
    public static void main(String[] args) {

        try {
            
            int nilai = Integer.parseInt(args[0]);
        
            if(nilai>=85 && nilai<=100){
                System.out.println("Nilai Anda : "+nilai);
                System.out.println("Grade Anda : A ");

            }else if(nilai>=75 && nilai<=84){
                System.out.println("Nilai Anda : "+nilai);
                System.out.println("Grade Anda : B ");

            }else if(nilai>=65 && nilai<=74){
                System.out.println("Nilai Anda : "+nilai);
                System.out.println("Grade Anda : C ");
            
            }else if(nilai>=45 && nilai<=64){
                System.out.println("Nilai Anda : "+nilai);
                System.out.println("Grade Anda : D ");

            }else if(nilai>=0 && nilai<=44){
                System.out.println("Nilai Anda : "+nilai);
                System.out.println("Grade Anda : E ");

            }else{
                System.out.println("Nilai Anda Tidak Valid");
            }

        } catch (Exception e) {
            
            System.out.println("Nilai Anda Tidak Valid");
        }
        
        
    }
}
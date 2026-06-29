public class Task8 {

    public static void main(String[] args) {
        System.out.println(a(4,5,10));
    }
    
    static int a(int... etoParams){
        int total = 0;
        
        for(int i = 0; i < etoParams.length; i++){

            for(int j = 0; j <= etoParams[i]; j++){
                total+= j;
            } 

        } return total;
    }
    
}

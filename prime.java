public class prime {
    public static void main(String[]args){
        int num = 7;
        String bulb = "ON";
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                bulb = "OFF";
                break;
            }
            
        }
        if(bulb == "ON"){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        
    }
    
}

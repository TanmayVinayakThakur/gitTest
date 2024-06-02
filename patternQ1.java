import java.util.*;
public class patternQ1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i,j;
        i=sc.nextInt();
        j=sc.nextInt();


        for (int x=1; x<=i ;x++){
            for(int y=1;y<=j;y++){
                System.out.print("*");
            }
            System.out.println("");
            
        }

    }
    
}

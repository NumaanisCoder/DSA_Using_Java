public class sumofNatural {
    
public static int sumofNaturalfunc(int n){
if(n == 0){
    return 0;
}else if(n == 1){
    return 1;
}
return n + sumofNaturalfunc(n-1);
}
  
public static void main(String[] args) {

        System.out.println(sumofNaturalfunc(6));
    }
}

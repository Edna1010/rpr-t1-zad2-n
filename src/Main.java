import java.util.Scanner;
public class Main {
    public static int SumaCifara(int a){
        int broj=0;
        int trenutna=0;
        if(a==0)
            return a;
        while(a!=0){
            trenutna=a%10;
            broj=broj+trenutna;
            a=a/10;
        }
        return broj;
    }
    public static void main(String[] args) {
        int n=0;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n=ulaz.nextInt();
        for(int i=1; i<=n; i++){
            if(i%SumaCifara(i)==0)
                System.out.println(i);
        } } }
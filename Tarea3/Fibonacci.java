package Tarea3;

public class Fibonacci {
    public static void main(String[] args) {
        int num1=0,num2=1,suma,limite=10;
    System.out.println(num1);
    System.out.println(num2);
     
    while(num2+num1<=limite){
        suma = num1;
        num1 = num2;
        num2 = suma + num1;
        System.out.println(num2);
    }
     
    }
    
}

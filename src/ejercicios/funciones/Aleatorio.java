package ejercicios.funciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Aleatorio {
public static void main(String args[]){
    java.util.Scanner lectura= new java.util.Scanner(System.in);
    String playAgain="y";
    do{
        GuessingGame();
        System.out.println("Desea jugar de nuevo");
        playAgain=lectura.next();
    }while(playAgain=="y");
}   
    
public static void GuessingGame(){
     java.util.Scanner lectura= new java.util.Scanner(System.in);
    int answer= (int) Math.floor((Math.random()*100+1));
    int guess=0; 
    int numGuesses=1;
    
    for (int i = 0; i <= 7; i++) {
        System.out.println("Adivine un numero");
        guess = lectura.nextInt();
        if(guess<answer){
            System.out.println("Mayor");
        }else{
            if(guess>answer){
                System.out.println("Menor");
            }else{
                System.out.println("Gano");
                break;
            }
        }
    }
    if(numGuesses==7){
        System.out.println("Perdio");
    }
}    
}

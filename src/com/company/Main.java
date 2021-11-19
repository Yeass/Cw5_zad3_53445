package com.company;

class Tablica{

    int[][] tab = new int[10][10];
    int sum = 0;
    void fill() {
        for(int i = 0; i < tab.length; i++){
            for(int y = 0; y < tab.length; y++){
                if(i == y){
                    tab[i][y] = i;
                    sum += i;
                }else {
                    tab[i][y] = 0;
                }
            }
        }
    }
    void show(){
        for(int i = 0; i < tab.length; i++){
            for(int y = 0; y < tab.length; y++){
                System.out.print(tab[i][y] + " ");
            }
            System.out.println("");
        }
            System.out.println("Suma liczb po przekatnej to " + sum);
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Tablica tablica = new Tablica();
        tablica.fill();
        tablica.show();
    }
}

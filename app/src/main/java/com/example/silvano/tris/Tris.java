package com.example.silvano.tris;

public class Tris {
    private int[][] posizioni = new int[][] {{2,2,2},{2,2,2},{2,2,2}};

    public boolean inserisci(int pos, int giocatore){
        //Es 12 = 1° riga 2° colonna, nell'array 0=x 1=o 2=vuoto
        boolean occupato = false;
        switch (pos){
            case 11:
                if (posizioni [0][0] != 1 && posizioni [0][0] != 0){
                    posizioni[0][0] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 12:
                if (posizioni [0][1] != 1 && posizioni [0][1] != 0){
                    posizioni[0][1] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 13:
                if (posizioni [0][2] != 1 && posizioni [0][2] != 0){
                    posizioni[0][2] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 21:
                if (posizioni [1][0] != 1 && posizioni [1][0] != 0){
                    posizioni[1][0] = giocatore;
                } else {
                    occupato = true;
                }
                break;
            case 22:
                if (posizioni [1][1] != 1 && posizioni [1][1] != 0){
                    posizioni[1][1] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 23:
                if (posizioni [1][2] != 1 && posizioni [1][2] != 0){
                    posizioni[1][2] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 31:
                if (posizioni [2][0] != 1 && posizioni [2][0] != 0){
                    posizioni[2][0] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 32:
                if (posizioni [2][1] != 1 && posizioni [2][1] != 0){
                    posizioni[2][1] = giocatore;
                } else {
                    occupato = true;
                }
                break;

            case 33:
                if (posizioni [2][2] != 1 && posizioni [2][2] != 0){
                    posizioni[2][2] = giocatore;
                } else {
                    occupato = true;
                }
                break;

        }
        return occupato;
    }

    public int vinto(){
        if (posizioni[0][0] == 0 && posizioni[0][1] == 0 && posizioni[0][2] == 0 ||
                posizioni[1][0] == 0 && posizioni[1][1] == 0 && posizioni[1][2] == 0 ||
                posizioni[2][0] == 0 && posizioni[2][1] == 0 && posizioni[2][2] == 0 ||
                posizioni[0][0] == 0 && posizioni[1][0] == 0 && posizioni[2][0] == 0 ||
                posizioni[0][1] == 0 && posizioni[1][1] == 0 && posizioni[2][1] == 0 ||
                posizioni[0][2] == 0 && posizioni[1][2] == 0 && posizioni[2][2] == 0 ||
                posizioni[0][0] == 0 && posizioni[1][1] == 0 && posizioni[2][2] == 0 ||
                posizioni[2][0] == 0 && posizioni[1][1] == 0 && posizioni[0][2] == 0){
            return 1;
        }else if (posizioni[0][0] == 1 && posizioni[0][1] == 1 && posizioni[0][2] == 1 ||
                posizioni[1][0] == 1 && posizioni[1][1] == 1 && posizioni[1][2] == 1 ||
                posizioni[2][0] == 1 && posizioni[2][1] == 1 && posizioni[2][2] == 1 ||
                posizioni[0][0] == 1 && posizioni[1][0] == 1 && posizioni[2][0] == 1 ||
                posizioni[0][1] == 1 && posizioni[1][1] == 1 && posizioni[2][1] == 1 ||
                posizioni[0][2] == 1 && posizioni[1][2] == 1 && posizioni[2][2] == 1 ||
                posizioni[0][0] == 1 && posizioni[1][1] == 1 && posizioni[2][2] == 1 ||
                posizioni[2][0] == 1 && posizioni[1][1] == 1 && posizioni[0][2] == 1) {
           return 0;
        }else {
            return 2;
        }
    }
}

package com.Amazon;

public class SearchWord {
    public static void main(String[] args) {
        char[][] words = new char[3][4];
        words[0][0] = 'A';
        words[0][1] = 'B';
        words[0][2] = 'C';
        words[0][3] = 'E';
        words[1][0] = 'S';
        words[1][1] = 'F';
        words[1][2] = 'C';
        words[1][3] = 'S';
        words[2][0] = 'A';
        words[2][1] = 'D';
        words[2][2] = 'E';
        words[2][3] = 'E';

        System.out.println("The result is : " + exist(words, "SEE"));
    }


    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board[i].length - 1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    System.out.println("First character found : " +word.charAt(0));
                    if(matchNextLetters(i, j, board, word, 0)){
                        return true;
                    }


                }

            }
        }
        return false;
    }

    public static boolean matchNextLetters(int x, int y, char[][] board, String word, int wordIndex) {
        if(wordIndex!=word.length()-1){


                if (y<3 && board[x][y + 1] == word.charAt(wordIndex + 1)){
                    System.out.println("Next Character found: "+word.charAt(wordIndex + 1));

                    matchNextLetters(x,y+1,board,word,++wordIndex);
                }
                else if( y!=0 && board[x][y - 1] == word.charAt(wordIndex + 1)){
                    System.out.println("Next Character found: "+word.charAt(wordIndex + 1));
                    matchNextLetters(x,y-1,board,word,++wordIndex);
                }else if ( x!=0 && board[x - 1][y] == word.charAt(wordIndex + 1)){
                    System.out.println("Next Character found: "+word.charAt(wordIndex + 1));
                    matchNextLetters(x-1,y,board,word,++wordIndex);
                }else if( x<2 && board[x + 1][y] == word.charAt(wordIndex + 1)) {
                    System.out.println("Next Character found:  " +word.charAt(wordIndex + 1));
                    matchNextLetters(x+1,y,board,word,++wordIndex);
                }
                else {

                    System.out.println("Next Character not found");
                    return false;


                }
            }

        return true;
    }
}

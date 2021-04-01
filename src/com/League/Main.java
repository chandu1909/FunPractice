package com.League;

import java.io.FileNotFoundException;

/** @Author chandra sekhar Polavarapu */
public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    /**
     * Please provide the csv file path here if you need to change the input. Or the alternative is
     * to copy and paste the csv content to matrix.csv file
     */
    MatrixOperations matrixOperations = new MatrixOperations("src/com/League/matrix.csv");
  }
}

package com.League;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author chandra sekhar Polavarapu This class allows us to perform multiple matrix operations if
 * the matrix is square. Doesn't perform any operation if the extracted matrix is not square.
 */
public class MatrixOperations {
  public MatrixOperations(String filePath) throws FileNotFoundException {
    /**
     * Reading the CSV file
     */
    String COMMA_DELIMITER = ",";
    List<List<String>> records = new ArrayList<>();
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        String[] values = line.split(COMMA_DELIMITER);
        records.add(Arrays.asList(values));
      }
    } catch (IOException e) { // raises exception if the file is not found in the given path
      e.printStackTrace();
    }

    /** Checks if the extracted matrix is square or not ! */
    if (records.size() == records.get(0).size()) {
      try {
        System.out.println("Echo matrix : \n" + echoMatrix(records));
        System.out.println("Inverse Matrix: \n" + inverseMatrix(records));
        String flatResult = flatMatrix(records);
        System.out.println("Flatten Matrix: \n" + flatMatrix(records));
        System.out.println("\nSum of elements in matrix: \n" + totalSum(flatResult));
        System.out.println("\nProduct of elements in matrix: \n" + matrixProduct(flatResult));
      } catch (NumberFormatException e) {
        System.out.println(
            "\nERROR: All elements in the matrix must be Integers to be able to perform this operation.. Aborting the workflow ! \n" +e.getMessage());
      }

    } else {
      System.out.println("\nMatrix is not square and no further operations can be performed");
    }
  }

  /**
   * Takes flatten matrix string as input and calculates the product of all elements in the matrix.
   * Since we have already have the result of flattened matrix, its a better approach to reuse the
   * same result
   *
   * @param flatResult
   * @return product of integers in matrix
   */
  private int matrixProduct(String flatResult) throws NumberFormatException {
    String[] flatArray = flatResult.split(",");
    int product =
        Arrays.stream(flatArray).mapToInt(num -> Integer.parseInt(num)).reduce(1, (a, b) -> a * b);
    return product;
  }

  /**
   * This method takes flat result as input and calculates the sum of all elements in matrix. Since
   * we have already flatten the matrix, its ideal to reuse the result of that method rather than
   * summing from the matrix it self again. This way we can finish this operation in O(n).
   *
   * @param flatResult
   * @return integer value
   */
  private int totalSum(String flatResult) throws NumberFormatException {
    String[] flatArray = flatResult.split(",");
    int sum = Arrays.stream(flatArray).mapToInt(num -> Integer.parseInt(num)).sum();
    return sum;
  }

  /**
   * Takes matrix input and flattens the matrix
   *
   * @param records
   * @return flatten matrix will be returned as String
   */
  private String flatMatrix(List<List<String>> records) {
    StringBuilder result = new StringBuilder();
    records.stream()
        .forEach(
            i -> {
              i.stream().forEach(j -> result.append(j + ","));
            });

    return result.deleteCharAt(result.length() - 1).toString();

    // Above operation can also be done in another way like below. But its better to use loops if we
    // are not sure about the input size and number times regex will be executed.
    /*String tempString = records.toString();
    tempString =tempString.replaceAll("\\D+","");*/
  }

  /**
   * This methdd takes a the records as input and transposes the given matrix.
   *
   * @param records
   * @return inversed matrix in string format
   */
  private String inverseMatrix(List<List<String>> records) {
    StringBuilder result = new StringBuilder();
    int counter = 0;
    for (int i = 0; i < records.size(); i++) {
      while (counter < records.size()) {
        result.append(records.get(counter).get(i));
        if (counter != records.size() - 1) {
          result.append(",");
        }
        counter++;
      }
      result.append("\n");
      counter = 0;
    }
    return result.toString();
  }

  /**
   * This method takes records as input and arranges it in the required matrix format
   *
   * @param records
   * @returns the matrix in string format
   */
  private String echoMatrix(List<List<String>> records) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < records.size(); i++) {
      for (int j = 0; j < records.get(i).size(); j++) {
        result.append(records.get(i).get(j));
        if (j != records.get(i).size() - 1) {
          result.append(",");
        }
      }
      result.append("\n");
    }
    return result.toString();
  }
}

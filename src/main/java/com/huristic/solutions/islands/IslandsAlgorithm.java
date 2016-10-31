package com.huristic.solutions.islands;

/**
 * @author dkhanaferov
 * @since 10/31/16
 */
public interface IslandsAlgorithm {

    /**
     * Calculates number of islands in the binary matrix
     *
     * @param matrix {@link int[][]} input binary matrix
     * @return {@link int} number of islands
     */
    int findIslandsCount(int[][] matrix);
}

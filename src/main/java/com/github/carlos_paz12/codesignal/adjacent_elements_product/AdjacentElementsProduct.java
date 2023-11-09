package com.github.carlos_paz12.codesignal.adjacent_elements_product;

public class AdjacentElementsProduct {

    /*
     * Given an array of integers, find the pair
     * of adjacent elements that has the largest
     * product and return that product.
     */
    int solution(int[] inputArray) {
        int product = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            int productTemp = inputArray[i] * inputArray[i + 1];

            product = (productTemp > product) ? productTemp : product;
        }

        return product;
    }

}

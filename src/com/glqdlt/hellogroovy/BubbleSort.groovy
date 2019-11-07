package com.glqdlt.hellogroovy

class BubbleSort {
    static void main(String[] args) {
        List array = [1, 30, 3, 5, 5, 6, 100, 7, 99, 11, 23, 44, 55, 12, 1, 3, 4, 5];

        def compare = { x1, x2 -> x1 > x2 }


        def limit = array.size();
        while (limit > 0) {
            Integer i = 0;
            while (i < limit) {
                if (limit - 1 == i) {
                    break;
                }
                if (compare.call(array[i], array[i + 1])) {
                    def temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                i++;
            }
            limit--;
        }

        println(array);


    }
}

package org.example.tree;

public class GCDFinder {

    int findGCD(int a, int b){
        int min = Math.min(a,b);
        if (a % min == 0 && b % min == 0){
            return min;
        }
        int factor = 1;
        for (int i = 2; i * i <= min ; i++) {
            if (min % i == 0 ){
                int j = min / i;
                if (a % j == 0 && b % j == 0){
                    factor = j;
                    break;
                }
                if (a % i == 0 && b % i == 0){
                    factor = i;
                }
            }
        }
        return factor;
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockSpanProblemTest {

    @Test
    void testSampleCase(){
        int[] input = new int[]{100,80,60,70,60,75,85};
        int[] output = new int[]{1,1,1,2,1,4,6};
        int[] result = StockSpanProblem.calculateSpan(input, input.length);
        for (int i = 0; i < output.length; i++) {
            assertEquals(output[i], result[i]);
        }
    }

    @Test
     void testLargeInput(){
        int n = 134;
        int[] input = new int[] {
                74,665,742,512,254,469,748,445,663,758,38,60,724,142,330,779,317,636,591,243,289,507,241,143,65,249,247,606,691,330,371,151,607,702,394,349,430,624,85,755,357,641,167,177,332,709,145,440,627,124,738,739,119,483,530,542,34,716,640,59,305,331,378,707,474,787,222,746,525,673,671,230,378,374,298,513,787,491,362,237,756,768,456,375,32,53,151,351,142,125,367,231,708,592,408,138,258,288,554,784,546,110,210,159,222,189,23,147,307,231,414,369,101,592,363,56,611,760,425,538,749,84,396,42,403,351,692,437,575,621,597,22,149,800};
        int[] output = new int[]{
                1,2,3,1,1,2,7,1,2,10,1,2,3,1,2,16,1,2,1,1,2,3,1,1,1,4,1,10,13,1,2,1,4,18,1,1,3,4,1,24,1,2,1,2,3,6,1,2,3,1,11,12,1,2,3,4,1,6,1,1,2,3,4,6,1,66,1,2,1,2,1,1,2,1,1,5,77,1,1,1,4,5,1,1,1,2,3,4,1,1,7,1,11,1,1,1,2,3,5,23,1,1,2,1,4,1,1,2,8,1,10,1,1,14,1,1,17,18,1,2,3,1,2,1,4,1,6,1,2,3,1,1,2,134
        };
        int[] result = StockSpanProblem.calculateSpan(input, input.length);
        for (int i = 0; i < output.length; i++) {
            System.out.println(i + " - " + input[i]);
            assertEquals(output[i], result[i]);
        }
    }
}
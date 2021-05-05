package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int i2 = 0, i3 = 0, i4 = 0, i5 = 0, i6 = 0, i7 = 0, i8 = 0, i9 = 0, i10 = 0, i11 = 0, i12 = 0, sumDice = 0;
        int dice1;
        int dice2;

        for (int i = 0; i <= 1000; i++) {
            dice1 = shuffler()[0];
            dice2 = shuffler()[0];
            sumDice = dice1 + dice2;

            switch (sumDice) {
                case 2:
                    i2++;
                    break;
                case 3:
                    i3++;
                    break;
                case 4:
                    i4++;
                    break;
                case 5:
                    i5++;
                    break;
                case 6:
                    i6++;
                    break;
                case 7:
                    i7++;
                    break;
                case 8:
                    i8++;
                    break;
                case 9:
                    i9++;
                    break;
                case 10:
                    i10++;
                    break;
                case 11:
                    i11++;
                    break;
                case 12:
                    i12++;
                    break;
            }


        }
        Integer[] numArray = {i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12};
        Map<Integer,Integer> dictArray = new HashMap<Integer,Integer>();
        dictArray.put(numArray[0],2);
        dictArray.put(numArray[1],3);
        dictArray.put(numArray[2],4);
        dictArray.put(numArray[3],5);
        dictArray.put(numArray[4],6);
        dictArray.put(numArray[5],7);
        dictArray.put(numArray[6],8);
        dictArray.put(numArray[7],9);
        dictArray.put(numArray[8],10);
        dictArray.put(numArray[9],11);
        dictArray.put(numArray[10],12);
        Arrays.sort(numArray, Collections.reverseOrder());
        System.out.println(dictArray.get(numArray[0]) + " and " +dictArray.get(numArray[1]));

    }

    public static Integer[] shuffler() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);
        return intArray;
    }

}

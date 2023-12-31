package com.github.carlos_paz12.codesignal.array_consecutive_2;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

    /*
     * Ratiorg got statues of different sizes as
     * a present from CodeMaster for his birthday,
     * each statue having an non-negative integer
     * size. Since he likes to make things perfect,
     * he wants to arrange them from smallest to
     * largest so that each statue will be bigger
     * than the previous one exactly by 1. He may
     * need some additional statues to be able to
     * accomplish that. Help him figure out the
     * minimum number of additional statues needed.
     */
    int solution(int[] statues) {
        if (statues.length == 1)
            return 0;

        Arrays.sort(statues);

        int quantity = 0;
        for (int i = 0; i < statues.length; i++) {
            if (statues[i] + 1 < statues[statues.length - 1])
                quantity += statues[i + 1] - statues[i] - 1;
        }

        return quantity;
    }

}

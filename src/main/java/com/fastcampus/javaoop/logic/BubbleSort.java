package com.fastcampus.javaoop.logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    // 입력 리스트를 받아 정렬된 리스트를 출력
   public List<T> sort(List<T> list) {
       // 입력인자를 리스트로 받아, 그것을 새 ArrayList로 만들어서 output으로 넣음
       List<T> output = new ArrayList<>(list);

       for (int i = output.size() - 1; i > 0; i--) {
           for (int j = 0; j < i; j++) {
               if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                   T temp = output.get(j);
                   output.set(j, output.get(j + 1));
                   output.set(j + 1, temp);
               }
           }
       }
       return output;
    }
}

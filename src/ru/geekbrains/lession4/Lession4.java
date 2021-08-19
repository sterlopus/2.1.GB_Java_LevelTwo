package ru.geekbrains.lession4;

import java.util.*;

public class Lession4 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3};
//        int[] arrNew = new int[5];
//        System.out.println(Arrays.toString(arr));
//        System.arraycopy(arr, 0, arrNew, 0, arr.length);
//        arr = arrNew;
//        System.out.println(Arrays.toString(arr));
//        arrNew = null;
//        System.out.println(Arrays.toString(arrNew));
//        System.out.println(Arrays.toString(arr));


        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("A","C","B"));
        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList.add("BB");
//        arrayList1.add(11);
        System.out.println(arrayList.get(1));
//        System.out.println(arrayList1.get(0));
//        int x = arrayList1.get(0)*2;
//        System.out.println(x);
        System.out.println(arrayList.indexOf("B"));
        System.out.println(arrayList);
//        System.out.println(arrayList1);
        System.out.println(Collections.frequency(arrayList,"B"));
        Collections.sort(arrayList);
        System.out.println(arrayList);

//        System.out.println(arrayList1.g);
//        arrayList.add(String.valueOf(0));
//        System.out.println(arrayList.size());
//        arrayList.set(2,null);
//        System.out.println(arrayList);
    }
}

//*************************************************************************************
//Задание 2: Реализуй метод, в котором создаются ArrayList, LinkedList                *
//и заполняются 1 000 000 случайными элементами одного и того же типа.                *
//После из ArrayList и LinkedList 1000 раз выбираем элемент по случайному             *
//индексу. Замерь время для ArrayList и LinkedList. Сравни результаты и предположи,   *
//почему они могут отличаться.                                                        *
//*************************************************************************************

package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ArrayListTime {


    public static void startArrayListTime() {

        ArrayList<Long> arrayValues = new ArrayList<Long>();
        LinkedList<Long> linkedValues = new LinkedList<Long>();
        Random random = new Random();
        int size = 1000000;
        long startTimeWork;
        long stopTimeWork;

        //Наполнение списков случайными элементами
        for (int i = 0; i < size; i++) {
            arrayValues.add(random.nextLong(1000000));
            linkedValues.add(random.nextLong(1000000));
        }

        startTimeWork = System.currentTimeMillis();
        System.out.println();
        System.out.println("ArrayList ");

        for (int i = 0; i < 1000; i++){
            arrayValues.get(random.nextInt(1000000));
        }

        stopTimeWork = System.currentTimeMillis();
        System.out.println("Time: " + (stopTimeWork - startTimeWork) + " ms.");


        startTimeWork = System.currentTimeMillis();
        System.out.println();
        System.out.println("LinkedList ");

        for (int i = 0; i < 1000; i++){
            linkedValues.get(random.nextInt(1000000));
        }

        stopTimeWork = System.currentTimeMillis();
        System.out.println("Time: " + (stopTimeWork - startTimeWork) + " ms.");
    }


//    public long startTimer(long startTimer){
//        return System.currentTimeMillis();
//    }
//
//    private long stopTimer(long stopTimer){
//        return System.currentTimeMillis();
//    }

}

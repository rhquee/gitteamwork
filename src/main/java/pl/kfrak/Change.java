package pl.kfrak;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-27.
 */
public class Change {
        public static List<Integer> getChangeNominals(int amount) {


            List<Integer> list = new ArrayList<Integer>();
            List<Integer> nominalsList = new ArrayList<Integer>();

            list.add(amount);

            nominalsList.add(500);
            nominalsList.add(200);
            nominalsList.add(100);
            nominalsList.add(50);
            nominalsList.add(20);
            nominalsList.add(10);
            nominalsList.add(5);
            nominalsList.add(2);

            int index = 0;

            for (int i = 0; i < nominalsList.size(); i++) {
                System.out.println(nominalsList.get(i));
                while (amount > nominalsList) {
                    int currentNumber = nominalsList.get(index);
                    if (amount % currentNumber == 0) {
                        list.add(currentNumber);
                        amount = amount / currentNumber;

                    } else {
                        index++;
                    }
                }
            }

            return list;



        }
}

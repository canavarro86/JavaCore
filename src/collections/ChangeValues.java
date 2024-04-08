//**************************************************
//* Метод, который поменяет ключи и значения       *
//* в HashMap местами. На вход в метод поступает   *
//* HashMap<Interger, String>, надо вернуть        *
//* HashMap<String, Integer>. Выведи результат.    *
//**************************************************

package collections;
import java.util.HashMap;
import java.util.Map;

public class ChangeValues {
    //private HashMap<Integer, String> getHashMap = new HashMap<>();

    public static HashMap<String, Integer> changeMap(HashMap<Integer, String> values){
        HashMap<String, Integer> changeHashMap = new HashMap<>();

        for (Map.Entry<Integer, String> swap: values.entrySet()){
             changeHashMap.put(swap.getValue(), swap.getKey());
        }

        return changeHashMap;
    }

}

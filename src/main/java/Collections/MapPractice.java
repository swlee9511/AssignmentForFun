package Collections;

import com.sun.jndi.ldap.EntryChangeResponseControl;

import java.lang.reflect.Array;
import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        List<Object> result = new ArrayList<Object>();

        map.forEach((key, mapValue) -> {
            if(mapValue == value)
                result.add(key);
        });

        return result.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        if(size < 1) {
            return result;
        }
        if (size == 1) {
            result.put(1, 1);
            return result;
        }
        if(size == 2) {
            result.put(1, 1);
            result.put(2, 1);
            return result;
        }

        int first = 0;
        int second = 1;
        int nthNumber = 1;

        for(int i=1; i<=size; i++) {
            result.put(i, nthNumber);
            nthNumber = first + second;
            first = second;
            second = nthNumber;
        }
        return result;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        if (size < 1) {
            return result;
        }
        if (size <= 1) {
            result.put(1, first);
            return result;
        }
        if(size == 2) {
            result.put(1, first);
            result.put(2, second);
            return result;
        }

        int n1 = first;
        int n2 = second;
        int nthNumber = first + second;

        for(int i=1; i<=size; i++) {
            if (i == 1) {
                result.put(i, first);
            } else if(i == 2) {
                result.put(i, second);
            } else {
                result.put(i, nthNumber);
                n1 = n2;
                n2 = nthNumber;
                nthNumber = n1 + n2;
            }
        }
        return result;
    }
}

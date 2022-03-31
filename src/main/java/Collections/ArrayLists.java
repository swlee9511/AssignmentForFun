package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int newShit = list1.stream().mapToInt(Integer::intValue).sum() +
                      list2.stream().mapToInt(Integer::intValue).sum();
        return newShit;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> result = new ArrayList<Integer>(original);
        result.removeIf(n -> n == toRemove);
        return result;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.isEmpty() || original.size()==1)
            return true;

        Set<Character> st = new HashSet<Character>();
        boolean result = false;

        for(int i=0; i<original.size()-1; i++) {
            result = false;

            for (char s : original.get(i).toCharArray()) {
                st.add(s);
            }

            for (char s : original.get(i+1).toCharArray()) {
                if (st.contains(s)) {
                    result = true;
                }
            }

            if(!result)
                return result;

            st.clear();
        }

        return result;
    }
}

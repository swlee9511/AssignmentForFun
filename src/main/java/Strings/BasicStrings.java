package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        if(string.length()==0 || index<0)
            return ' ';

        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String result = "";

        for(int i=0; i<string.length(); i++)
            result += " ";

        return result;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        if(string.length() == 0)
            return "";

        StringBuilder str = new StringBuilder(string.length());
        char c = string.charAt(0);

        for (int i=0; i<string.length(); i++) {
            c = string.charAt(i);
            if(Character.isTitleCase(c)) {
                c = Character.toLowerCase(c);
            } else if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }

            str.append(c);
        }
        return str.toString();
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder str = new StringBuilder(string1.length() + string2.length());
        int i=0, j=0;

        while(i<string1.length() && j<string2.length()) {
            str.append(string1.charAt(i));
            str.append(string2.charAt(j));

            i++;
            j++;
        }

        while(i<string1.length()) {
            str.append(string1.charAt(i));
            i++;
        }
        while(j<string2.length()) {
            str.append(string2.charAt(j));
            j++;
        }

        return str.toString();
    }
}

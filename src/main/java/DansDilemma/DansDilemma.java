package DansDilemma;

import java.util.HashSet;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        if(input1 == 0 && input2 == 0) {
            return 1;
        } else if(input1 == 0 || input2 == 0) {
            return 3;
        } else {
            int count = 0;

            if(input1 == input2) {
                return 4;
            }

            if(input1-input2 != input2-input1)
                count++;

            if((Double)input1/input2 != (Double)input2/input1)
                count++;

            return 4 + count;
        }
    }

    public void dilemmaHelper(double n1, double n2, HashSet<Double> set) {
        // one combination for + and * two possible combinations for - and /
        double N1PlusN2 = n1+n2;
        double N1TimesN2 = n1*n2;
        double N1MinusN2 = n1-n2;
        double N2MinusN1 = n2-n1;
        // divide only if not 0
        if(n2!=0) {
            double N1DividedByN2 = n1/n2;
            set.add(N1DividedByN2);
        }
        if(n1!=0) {
            double N2DividedByN1 = n2/n1;
            set.add(N2DividedByN1);
        }
        set.add(N1PlusN2);
        set.add(N1TimesN2);
        set.add(N1MinusN2);
        set.add(N2MinusN1);
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        HashSet<Double> result = new HashSet<Double>();

        dilemmaHelper(input1, input2, result);
        dilemmaHelper(input1, input3, result);
        dilemmaHelper(input2, input3, result);

        return result.size();
    }

    public Integer dilemmaOfN(Double... args){
        HashSet<Double> result = new HashSet<Double>();

        for(int i=0; i<args.length-1; i++) {
            for(int j=i+1; j<args.length; j++) {
                dilemmaHelper(args[i], args[j], result);
            }
        }

        return result.size();
    }
}

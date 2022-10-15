package app.cs;

import app.stdlib.StdOut;

/******************************************************************************
 *  Compilation:  javac Binomial.java
 *  Execution:    java Binomial N
 *  Dependencies: Polynomial.java
 *
 *  Print out the expansion of (1+x)^N.
 *
 *  % java Binomial 0
 *  1x^0
 *
 *  % java Binomial 3
 *  1x^3 + 3x^2 + 3x^1 + 1x^0
 *
 *  % java Binomial 6
 *  1x^6 + 6x^5 + 15x^4 + 20x^3 + 15x^2 + 6x^1 + 1x^0
 *
 ******************************************************************************/

public class Binomial {

    public static void main(String[] args) {
        int N = 3;//Integer.parseInt(args[0]);
        Polynomial one      = new Polynomial(1, 0);   // 1
        Polynomial x        = new Polynomial(1, 1);   // x
        Polynomial binomial = one;                    // 1

        for (int i = 0; i < N; i++)
            binomial = binomial.times(x.plus(one));

        StdOut.println(binomial);
    }
}

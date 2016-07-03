/**
 *
 * @authors Your Name (you@example.org)
 * @date    2016-06-03 20:52:34
 * @version $Id$
 */

public class MyArrary
{
    public static void main(String[] args)
    {
        int[] a = new int[] {1, 3, 5, 7, 9};
        String[] b = new String[] {"Sara", "Lucky", "Trancy"};
        // String[] str = new String[]{"aaa","bbb","ccc"};
        int c;
        c = 5 + 1;
        System.out.println(a[2]);
        System.out.println(b[2]);

        if ( c > 5) {
            System.out.println("c > 5");
        }
        else if (c == 6) {
            System.out.println("c == 6");
        }
        else {
            System.out.println("c < 6");
        }

        int[] integers = {1, 2, 3, 5, 7};
        for (int j = 0; j < integers.length; j++) {
            int i = integers[j];
            System.out.println(i);
        }

        int d = 1;
        do {
            d++;
            System.out.println(d);
            // d++;
        } while (d < 10);

        int count = 10;
        while ( count < 15) {
            System.out.println(count);
            count++;
        }

        int n = 1, result = 0;
        while (n < 999) {
            result += n++;
        }
        System.out.println(result);

        for (int k = 1; k < 20; k++) {
            System.out.println(k);
            if( k == 10) {
                break;
            }
        }
    }
}

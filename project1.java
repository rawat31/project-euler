public class Multiples {
    public static void main (String [] args) {
        int temp = 0;
        int temp2 = 0; 

        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0) {
                temp = temp + i;
            }            
        }

        for (int j = 0; j <= 1000; j++) {
            if (j % 5 == 0) {
                temp2 = temp2 + j;
            }
        }

        System.out.println(temp + temp2);
    }
}

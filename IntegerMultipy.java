public class IntegerMultipy {

    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 5678;

        long result = IntegerMultiply(num1, num2);
        System.out.println("Result: " + result);
    }

    public static long IntegerMultiply(int num1, int num2) {

        String strNum1 = Integer.toString(num1);
        String strNum2 = Integer.toString(num2);

        int m = strNum1.length();
        int n = strNum2.length();

        long[][] result = new long[m][n];
        long finalResult = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = Integer.parseInt(Character.toString(strNum1.charAt(i)))
                        * Integer.parseInt(Character.toString(strNum2.charAt(j)));
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                finalResult += result[i][j] * Math.pow(10, m + n - i - j - 2);
            }
        }
        
        return finalResult;
    }

}

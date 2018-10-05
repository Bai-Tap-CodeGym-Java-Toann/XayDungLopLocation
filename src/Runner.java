import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hàng và cột (row,coloumn)");
        double[] inputRL = getNumberFormUse(sc.nextLine());
        double[][] inputRay = new double[(int) inputRL[1]][(int) inputRL[0]];
        for (int i = 0; i < inputRL[1]; i++) {
            System.out.println("row " + (i + 1) + ": ");
            for (int j = 0; j < inputRL[0]; j++) {
                inputRay[i][j] = sc.nextDouble();
                System.out.println("ok: " + inputRay[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("input done!");
        Location maxInform = Location.locateLargest(inputRay);
        System.out.println("max is:"+maxInform.maxValue);
        System.out.println("at row: "+ maxInform.row);
        System.out.println("at colunm: "+maxInform.colunm);
    }

    public static double[] getNumberFormUse(String input) {
        double[] outRay = new double[input.split(",").length];
        int index = 0;
        for (String x : input.split(",")) {
            outRay[index] = Double.parseDouble(x);
            index++;
        }
        return outRay;
    }
}

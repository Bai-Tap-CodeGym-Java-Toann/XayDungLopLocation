public class Location {
    public int row;
    public int colunm;
    public double maxValue;

    public Location(int row, int colunm, double maxValue) {
        this.row = row;
        this.colunm = colunm;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] array) {
        double[] outRay = {1, 1, 0};
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    outRay[0] = i;
                    outRay[1] = j;
                }
            }
        }
        outRay[2] = max;
        return new Location((int) outRay[0], (int) outRay[1], outRay[2]);

    }
}

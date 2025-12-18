public class DataSet {
    private double[] data;
    private int dataSize;
    private double sum;

    public DataSet() {
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }

    public void add(double value) {
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }

    public double getAverage() {
        if (dataSize == 0) {
            return 0;
        } else {
            return sum / dataSize;
        }
    }

    public double getStandardDeviation() {
        double mean = getAverage();
        double combine = 0.0;
        for (int i = 0; i < dataSize; i++) {
            double difference = data[i] - mean;
            combine += difference * difference;
        }
        return combine / dataSize;
    }

    public static double calculateAverage(DataSet[] datasets) {
        double total = 0.0;
        for (DataSet ds : datasets) {
            total += ds.getAverage();
        }
        return total / datasets.length;
    }
}

public class DistanceConverter {

    public DistanceConverter() {

    }

    public double convert(double dist_miles) {
        double oneMileInKM = 1.609;
        final double dist_km = dist_miles * oneMileInKM;
        return dist_km;
    }
}

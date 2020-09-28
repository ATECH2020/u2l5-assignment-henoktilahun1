import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the latitude of the starting location: ");
        double lat1 = in.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double lat2 = in.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        double long1 = in.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double long2 = in.nextDouble();

        GeoLocation g1 = new GeoLocation(lat1, long1);

        GeoLocation g2 = new GeoLocation(lat2, long2);

        System.out.println("The distance is " + g1.distanceFrom(g2) + " miles");
    }

}
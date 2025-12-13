package allclasses.balova;

public class OpticsCalculator {

    public static double getImageDistance(double objectDistanceCm, double opticalPowerDioptres) {

        double focalLengthM = 1.0 / opticalPowerDioptres;

        double objectDistanceM = objectDistanceCm / 100.0;

        double inverseF = 1.0 / focalLengthM;
        double inverseD = 1.0 / objectDistanceM;
        double inverseImage = inverseF - inverseD;

        double imageDistanceM = 1.0 / inverseImage;

        return imageDistanceM * 100.0;
    }

    public static String getImageType(double imageDistanceCm) {
        if (imageDistanceCm > 0) {
            return "действительное";
        } else {
            return "мнимое";
        }
    }

    public static double getMagnification(double objectDistanceCm, double imageDistanceCm) {
        return Math.abs(imageDistanceCm / objectDistanceCm);
    }

    public static void solveProblem(double objectDistanceCm, double opticalPowerDioptres) {
        double imageDistance = getImageDistance(objectDistanceCm, opticalPowerDioptres);
        String type = getImageType(imageDistance);
        double magnification = getMagnification(objectDistanceCm, imageDistance);

        System.out.println("Расстояние до изображения: " + Math.abs(imageDistance) + " см");
        System.out.println("Тип изображения: " + type);
        System.out.println("Увеличение: " + magnification + " раз");

        if (magnification > 1) {
            System.out.println("Изображение увеличенное");
        } else if (magnification < 1) {
            System.out.println("Изображение уменьшенное");
        } else {
            System.out.println("Изображение в натуральную величину");
        }
    }
}

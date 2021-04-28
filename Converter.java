public class Converter {

    public static int deFahrenheit(int fahrenheitDegree) {
        return (fahrenheitDegree - 32) / 9 * 5;
    }

    public static int deCelsius(int celsiusDegree) {
        return celsiusDegree * 9 / 5 + 32;
    }

}

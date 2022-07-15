public class Main {
    public static void main(String[] args) {
        byte exampleByte = 123;
        short exampleShort = -2345;
        int exampleInt = 123_456_789;
        long exampleLong = 1234567890987654321L;
        float exampleFloat = 3.141592654f;
        double exampleDouble = 2.718281828718281828718281828718281828;
        double sumAllVar = exampleByte + exampleShort + exampleInt + exampleLong + exampleFloat + exampleDouble;

        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float sumWeights = weightBoxer2 + weightBoxer1;
        System.out.println("Общий вес 2-х боксеров равен " + sumWeights + "кг.");
        float diffWeights = weightBoxer2 - weightBoxer1;
        System.out.println("2-й боксер тяжелее 1-го на " + diffWeights + "кг.");

        byte bananaCount = 5;


    }
}
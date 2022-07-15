public class Main {
    public static void main(String[] args) {
       // это первая задача
        byte exampleByte = 123;
        short exampleShort = -2345;
        int exampleInt = 123_456_789;
        long exampleLong = 1234567890987654321L;
        float exampleFloat = 3.141592654f;
        double exampleDouble = 2.718281828718281828718281828718281828;
        // чтобы компилятор не ругался, что переменнче не используются)
        double sumAllVar = exampleByte + exampleShort + exampleInt + exampleLong + exampleFloat + exampleDouble;

        //вторая задача Боксеры
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;
        float sumWeights = weightBoxer2 + weightBoxer1;
        System.out.println("Общий вес 2-х боксеров равен " + sumWeights + "кг.");
        float diffWeights = weightBoxer2 - weightBoxer1;
        System.out.println("2-й боксер тяжелее 1-го на " + diffWeights + "кг.");

        // 3 задача- вес завтрака
        byte bananaCount = 5;
        byte bananaWeightGr = 80;
        short milkVolume = 200;
        float milkDensity = 105 / 100;
        float milkWeightGr = milkVolume * milkDensity;
        byte icecreamCount = 2;
        byte icecreamWeightGr = 100;
        byte eggCount = 4;
        byte eggWeight = 70;
        float breakfastWeightGr
                = bananaCount * bananaWeightGr + milkWeightGr + icecreamCount * icecreamWeightGr + eggCount * eggWeight;
        System.out.println("Общий вес завтрака равен " + breakfastWeightGr / 1000 + "кг.");

        // задача 4 - сброс веса
        short weightNeedToLose = 7;
        int countDays250 = weightNeedToLose * 1000 / 250;
        int countDays500 = weightNeedToLose * 1000 / 500;
        float averageDays = (countDays250 + countDays500) / 2;
        System.out.println("Если будет терять по 250 г, понадобится " + countDays250 + "дней.");
        System.out.println("Если будет терять по 500 г, понадобится " + countDays500 + "дней.");
        System.out.println("В среднем понадобится " + averageDays + "д.");

        // бухгалтерия
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double salaryMashaNew = salaryMasha * 1.1;
        double salaryDenisNew = salaryDenis * 1.1;
        double salaryKristinaNew = salaryKristina * 1.1;
        System.out.println("Маша теперь получает " + salaryMashaNew + "рублей. Годовой доход вырос на " + (salaryMashaNew - salaryMasha) * 12 + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisNew + "рублей. Годовой доход вырос на " + (salaryDenisNew - salaryDenis) * 12 + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaNew + "рублей. Годовой доход вырос на " + (salaryKristinaNew - salaryKristina) * 12 + " рублей");

    }
}
package Retrofit.Utils;

import java.util.Random;

public class DataGenerator {
    private static final Random random = new Random();

    // Генерация случайного имени
    public static String generateFirstName() {
        return generateRandomString(5 + random.nextInt(5));
    }

    // Генерация случайной фамилии
    public static String generateLastName() {
        return generateRandomString(5 + random.nextInt(5));
    }

    // Генерация случайного номера телефона
    public static String generatePhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder("+");
        phoneNumber.append(random.nextInt(8) + 1); // Генерация первой цифры кода страны (1-9)
        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10)); // Генерация оставшихся цифр телефонного номера
        }
        return phoneNumber.toString();
    }

    // Генерация случайного адреса электронной почты
    public static String generateEmail() {
        return "user" + random.nextInt(10000) + "@example.com";
    }

    // Генерация случайного адреса
    public static String generateAddress() {
        return generateRandomString(10 + random.nextInt(10)) + " " +
                generateRandomString(5 + random.nextInt(5)) + " St.";
    }

    // Генерация случайного города
    public static String generateCity() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio", "San Diego"};
        return cities[random.nextInt(cities.length)];
    }

    // Генерация случайного идентификатора (ID)
    public static String generateID() {
        return generateRandomString(8);
    }

    // Генерация случайного уникального идентификатора (UUID)
    public static String generateUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    // Генерация случайного почтового индекса
    public static String generatePostalCode() {
        return String.format("%05d", random.nextInt(100000)); // Генерация 5-значного числа, дополненного нулями спереди
    }

    // Генерация случайного возраста от 18 до 80 лет
    public static int generateAge() {
        return 18 + random.nextInt(63);
    }

    // Генерация случайного пароля
    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < length; i++) {
            password.append(characters.charAt(random.nextInt(characters.length())));
        }
        return password.toString();
    }

    // Генерация случайного юзернейма
    public static String generateUsername() {
        return generateRandomString(8) + random.nextInt(100);
    }

    // Метод для генерации случайной строки заданной длины
    private static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);
        }
        return sb.toString();
    }
}

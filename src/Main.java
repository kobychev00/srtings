public class Main {
    public static void main(String[] args) {
        // урок 1.7 строки шпаргалка
        System.out.println("урок 1.7 строки. Шпаргалка");
        String address = "Адрес, который мы хотим указать при доставке";
        String street = "Манежная";
        street = street + " площадь";
        System.out.println("Адрес магазина – " + street);
        // урок 1.7 строки конспект
        System.out.println("урок 1.7 строки конспект");
        String phone = "7 960-415-75-37";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длиннный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        // задача 1, 2
        System.out.println("Задача 1, 2");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("а", "А");
        fullName = fullName.replace("b", "B");
        fullName = fullName.replace("c", "C");
        fullName = fullName.replace("d", "D");
        fullName = fullName.replace("e", "E");
        fullName = fullName.replace("f", "F");
        fullName = fullName.replace("g", "G");
        fullName = fullName.replace("h", "H");
        fullName = fullName.replace("i", "I");
        fullName = fullName.replace("j", "J");
        fullName = fullName.replace("k", "K");
        fullName = fullName.replace("l", "L");
        fullName = fullName.replace("m", "M");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("o", "O");
        fullName = fullName.replace("p", "P");
        fullName = fullName.replace("q", "Q");
        fullName = fullName.replace("r", "R");
        fullName = fullName.replace("s", "S");
        fullName = fullName.replace("t", "T");
        fullName = fullName.replace("u", "U");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("w", "W");
        fullName = fullName.replace("x", "X");
        fullName = fullName.replace("y", "Y");
        fullName = fullName.replace("z", "Z");
        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("б", "Б");
        fullName = fullName.replace("в", "В");
        fullName = fullName.replace("д", "Д");
        fullName = fullName.replace("е", "Е");
        fullName = fullName.replace("ё", "Е");
        fullName = fullName.replace("ж", "Ж");
        fullName = fullName.replace("з", "З");
        fullName = fullName.replace("и", "И");
        fullName = fullName.replace("й", "Й");
        fullName = fullName.replace("к", "К");
        fullName = fullName.replace("л", "Л");
        fullName = fullName.replace("м", "М");
        fullName = fullName.replace("н", "Н");
        fullName = fullName.replace("о", "О");
        fullName = fullName.replace("п", "П");
        fullName = fullName.replace("р", "Р");
        fullName = fullName.replace("с", "С");
        fullName = fullName.replace("т", "Т");
        fullName = fullName.replace("у", "У");
        fullName = fullName.replace("ф", "Ф");
        fullName = fullName.replace("х", "Х");
        fullName = fullName.replace("ц", "Ц");
        fullName = fullName.replace("ч", "Ч");
        fullName = fullName.replace("ш", "Ш");
        fullName = fullName.replace("щ", "Щ");
        fullName = fullName.replace("ъ", "Ъ");
        fullName = fullName.replace("ы", "Ы");
        fullName = fullName.replace("ь", "Ь");
        fullName = fullName.replace("э", "Э");
        fullName = fullName.replace("ю", "Ю");
        fullName = fullName.replace("я", "Я");
        System.out.println("ФИО сотрудника — " + fullName);


    }

}
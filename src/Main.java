public class Main {
    public static void main(String[] args) {

        //Задание №1
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
//        System.out.println(fullName);

        //Задание №2
//        System.out.println(fullName.toUpperCase());

        //Задание №3
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));
    }
}
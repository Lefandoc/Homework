package ru.geekbrains.homework5;

public class HomeWorkAppL5 {
    public static void main(String[] args) {
//        4. Создать массив из 5 сотрудников.
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Петрович", "Директор",
                "ivanov1981@mail.ru", "+79163451232", 70000, 50);
        employees[1] = new Employee("Сидоров Сергей Игоревич", "Зам. директора",
                "sidorov1986@ya.ru","+79151262378", 60000, 45);
        employees[2] = new Employee("Федоров Сергей Петрович", "Бухгалтер",
                "fedor38@mail.ru", "+79771723854", 50000, 38);
        employees[3] = new Employee("Марков Василий Михайлович", "Служба безопасности",
                "sovbez@ya.ru", "89252177345", 30000, 34);
        employees[4] = new Employee("Бобров Игорь Сергеевич", "Служба безопасности",
                "bober89@rambler.ru", "89178835649", 30000, 32);

//        5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < employees.length; i ++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }

}

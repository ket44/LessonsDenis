package Les05_Arrays;

import java.util.Arrays;

// автор Ищук ДН
public class Demo_with_2_arr {
    /* Два массива: сотрудники и их зарплаты
    Вычислить среднюю ЗП, максимальную
    и максимальное отклонение от среднего
     */
    public static void main(String[] args) {
        int N = 5; // количество сотрудников
        String[] staff = {"Петя", "Вася", "Катя", "Маша", "Иван"};
        int[] salary = {20000, 30000, 10000, 45000, 26000};

        for (int i = 0; i < staff.length; i++) {
            System.out.printf("Имя: %s, ЗП: %d" ,staff[i], salary[i]);
            System.out.println();
        }
        System.out.println("-----------");
        System.out.println("Средняя ЗП");
        double averageSalary;
        // Сумма всех значений масива
        int sumSalary = Arrays.stream(salary).sum();
        averageSalary = sumSalary / salary.length;
        System.out.println("Средняя ЗП = "+ averageSalary);
        // Ищем максимум ЗП и её индекс
        int maxSalary = Integer.MIN_VALUE; // переменная для хранения макс ЗП
        int maxSalaryIndex = 0; // для запоминания индекса
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > maxSalary){
                // ЗП сравниваем с запомненным МАКС
                maxSalary = salary[i]; // запоминаем новый макс
                maxSalaryIndex = i;  // и его индекс
            }
        }
        // мы можем длинные строки перенести на несколько, это ЧИТАБЕЛЬНЕЕ
        System.out.printf("У %S макс.ЗП = %d %n",
                staff[maxSalaryIndex],
                salary[maxSalaryIndex]);

        System.out.println("----Отклонение------");
        // считаем максимальное отклонение ЗП и ЕЁ ИНДЕКС
        double maxDeviation = -Integer.MAX_VALUE; // минимальнное целое для сравнения
        int indexMaxDeviation = 0;
        for (int i = 0; i < salary.length; i++) {
            // вычисляем модуль разности (модуль, чтобы убрать отрицательное значение)
            // и сравниваем с сохраненным отклонением
            if (maxDeviation < Math.abs(averageSalary - salary[i])){
                maxDeviation = Math.abs(averageSalary - salary[i]);
                indexMaxDeviation = i;
            }
        }
        System.out.println("Выведем максимальное отклонение от средней ЗП");
        System.out.printf("У %S макс.ЗП = %d с отклонением от средней ЗП: %.2f",
                staff[indexMaxDeviation],
                salary[indexMaxDeviation],
                maxDeviation);
    }
}

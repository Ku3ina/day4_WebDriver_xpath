package HW3;

public class Calculation {
    /**
     * Метод рассчета скидки, в зависимости от зарплаты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     * @return
     */
    public static double discount(double salary) {
        double sale = 0;
        if (salary < 5.0) {
            System.out.println("Скидка составляет - 30%");
            sale = 0.3;
        } else if (salary < 12.0) {
            System.out.println("Скидка составляет - 20%");
            sale = 0.2;
        } else if (salary < 15.0) {
            System.out.println("Скидка составляет - 15%");
            sale = 0.15;
        } else {
            System.out.println("Скидки не будет!");
        }
        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.
        return sale;
    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount    - скидка
     * @return стоимость билета со скидкой
     */

    public static double countTicketPrice(int ticketPrice, double discount) {
        if (ticketPrice > 0) {
            return ticketPrice - ticketPrice * discount; }
        else {
            return 0;
        }
    }
    // Метод должен корректно считать окончательную стоимость билета
}



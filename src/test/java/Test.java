import HW3.Calculation;
import org.testng.Assert;

/**
 * Код писать здесь
 */


public class Test {
    public static void main(String[] args) {
// throws Exeception - нужно бы добавить

        double a = 12.1;
        Calculation.discount(a);
        System.out.println("(при значении salary " + a + ")");
        double b = 6;
        HW3.Calculation.discount(a);
        System.out.println("(при значении salary " + b + ")");
        //  Calculation.discount(14.0);
        //  Calculation.discount(-0.0003);
        //  Calculation.discount(2.4);
        int ticketPrice = 400;
        double discount = 13.33333;
        System.out.println();
        System.out.println("цена на билет " + HW3.Calculation.countTicketPrice(ticketPrice, discount));
        System.out.println("(при значениях цены " + ticketPrice + " и скидки " + discount + ")");

        System.out.println("\nПроверка метода Calc");

        private void testDiscount(double salary, double sal){
            double sale = 0;
            System.out.println("ЗП" + salary);
            sale = Calculation.discount(salary);
            Assert.assertEquals(sale, sal, "Тест не пройден");
            System.out.println("Тест не пройден\n\t" + "Ожидаемый результат - " + sal * 100 + "% | Фактический результат - " + sale * 100 + "% \n");
        }
    }

    private void testTicketPrice(double startPrice, double discount, double discountPrice) {
        double sale = 0;
        System.out.print("\t - цена со скидкой", discount * 100 + "% при начальной цене" + startPrice);
        sale = Calculation.countTicketPrice(startPrice, discount);
        Assert.assertEquals(sale, discountPrice, "Тест не пройден");
        System.out.println("Тест не пройден\n\t" + "Ожидаемый результат - " + discountPrice * +"% | Фактический результат - " + sale + "% \n");
    }

      /*
        System.out.println(new Date().toString()); // указание времени отправки тестов?
        Test2 t2 = new Test2();
        t2.test2();
   }
       */
}
}

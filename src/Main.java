//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(75444, "Табурет", 2500, "Мебель");
        Product product2 = new Product(93785, "Фен", 5600, "Электроника");
        Product product3 = new Product(57690, "Дрель", 7100, "Ремонт");
        Product product4 = new Product(36458, "Масло Shell", 4900, "Автотовары");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));
        System.out.println(product3.equals(product4));
        System.out.println(product4.equals(product1));

        Product[] buy = {product3, product1};
        Product[] buy1 = {product2};
        Product[] buy2 = {product1, product3, product4};
        Product[] buy3 = {product3, product4};

        Order yuri = new Order(" Юрий ", buy);
        System.out.println(yuri);
        Order sergei = new Order(" Сергей ", buy2);
        System.out.println(sergei);
        Order daria = new Order(" Дарья ", buy1);
        System.out.println(daria);
        Order svetlana = new Order(" Светлана ", buy3);
        System.out.println(svetlana);

        System.out.println(yuri.equals(daria));
        System.out.println(yuri.equals(svetlana));
        System.out.println(yuri.equals(sergei));
        System.out.println(svetlana.equals(daria));
    }
}
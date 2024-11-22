//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subcriber Luis = new Subcriber("Luis");
        Subcriber Joshua = new Subcriber("Joshua");
        Subcriber Jiggs = new Subcriber("Jiggs");

        newsAgency.subscribe(Luis);
        newsAgency.subscribe(Joshua);
        newsAgency.subscribe(Jiggs);

        newsAgency.newsPubish("The New Iphone 16 has been released on September 16, 2024");

        newsAgency.unsubscribe(Luis);

        Subcriber Watarax = new Subcriber("Watarax");
        newsAgency.subscribe(Watarax);

        newsAgency.newsPubish("The Super Typhoon Pepito leaves 9 persons dead, P266M in agricultural damages");

    }
}
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Actor> actorList = new ArrayList<>();
        Actor actor1 = new Human("Peter");
        Actor actor2 = new Human("John");
        Actor actor3 = new Human("Basilius");
        Actor actor4 = new Human("Darius");
        Actor actor5 = new Human("Marcus");



        Market market = new Market();
        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);
        market.acceptToMarket(actor3);
        market.acceptToMarket(actor4);
        market.acceptToMarket(actor5);

        market.giveOrders();
        market.takeOrders();




    }
}
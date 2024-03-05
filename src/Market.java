import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    private final List<Actor> actorList;



    public Market() {
        this.actorList = new ArrayList<>();
    }



    // добавление актора в магазин
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Покупатель " + actor.getName() +" пришел в магазин");
        actorList.add(actor);
        takeInQueue(actor);
    }
    // удаление актора из магазина
    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        releaseFromQueue();
        actorList.removeIf(ActorBehaviour::isTakeOrder);
        System.out.println("Покупатели покинули магазин");
    }

    @Override
    public void update() {

    }
    // добавление актора в очередь
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " добавлен в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor: actorList) {
            if (actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println("Покупатель " + actor.getName() + " получил заказ");
            }
        }
        releaseFromMarket(actorList);
    }

    @Override
    public void giveOrders() {
        for (Actor actor: actorList) {
            actor.setMakeOrder(true);
            System.out.println("Покупатель " + actor.getName() + " сделал заказ");
        }
    }
    // удаление актора из очереди
    @Override
    public void releaseFromQueue() {
        System.out.println("Покупатели удалены из очереди");
    }

}

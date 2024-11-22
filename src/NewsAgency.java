import java.util.*;

public class NewsAgency implements NotifyNews{
    private List<UpdateNotify> updateNotify;
    private String news;

    public NewsAgency() {
        this.updateNotify = new ArrayList<>();
    }

    @Override
    public void subscribe(UpdateNotify updateNotify) {
        this.updateNotify.add(updateNotify);
        System.out.println(updateNotify.subscriberName() + " has subcribed ");
    }

    @Override
    public void unsubscribe(UpdateNotify updateNotify) {
        this.updateNotify.remove(updateNotify);
        System.out.println(updateNotify.subscriberName() + " has unsubcribed ");
    }

    @Override
    public void notifyUsers() {
        System.out.println("News Publish " + news);
        for(UpdateNotify updateNotify : updateNotify) {
            updateNotify.notifyUsers(news);
        }

    }
    public void newsPubish(String news) {
        this.news = news;
        System.out.println("News publishes: " + news);
        notifyUsers();
    }

}

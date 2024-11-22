public class Subcriber implements UpdateNotify {
    private String name;


    public Subcriber(String name) {
        this.name = name;
    }


    @Override
    public void notifyUsers(String news) {
        System.out.println("Hot news for " + name + " " + news);
    }

    public String subscriberName() {
        return name;

    }
}

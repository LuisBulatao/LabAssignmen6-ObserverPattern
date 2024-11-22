public interface NotifyNews {
    void subscribe(UpdateNotify updateNotify);
    void unsubscribe(UpdateNotify updateNotify);
    void notifyUsers();
}

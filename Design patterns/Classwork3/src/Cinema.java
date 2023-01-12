public interface Cinema {
    public Cinema getInstance();
}
class Comedy implements Cinema{
    public void getCinema(){
        ESRB esrb =ESRB.getESRB();
        esrb.register(getInstance());
    }
    public Cinema getInstance(){
        return new Comedy();
    }

}
class Tragedy implements Cinema{
    public void getCinema(){
        ESRB esrb =ESRB.getESRB();
        esrb.register(getInstance());
    }
    public Cinema getInstance(){
        return new Tragedy();
    }
}
class Animation implements Cinema{
    public void getCinema(){
        ESRB esrb =ESRB.getESRB();
        esrb.register(getInstance());
    }
    public Cinema getInstance(){
        return new Animation();
    }

}

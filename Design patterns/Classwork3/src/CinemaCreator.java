interface CinemaCreator {
    public Cinema createCinema();

}
class CreateComedy implements CinemaCreator{
    @Override
    public Cinema createCinema(){
        return new Comedy();
    }
}
class CreateAnimation implements CinemaCreator{
    public Cinema createCinema(){
        return new Animation();
    }
}
class CreateTragedy implements CinemaCreator{
    public Cinema createCinema(){
        return new Tragedy();
    }
}

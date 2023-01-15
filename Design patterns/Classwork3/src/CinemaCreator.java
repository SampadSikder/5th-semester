public class CinemaCreator {
    public Cinema createCinema(String cinemaType){
        if(cinemaType=="Comedy"){
            return new Comedy();
        }
        else if(cinemaType=="Animation"){
            return new Animation();
        }
        else if(cinemaType=="Tragedy"){
            return new Tragedy();
        }
        else{
            return null;
        }

    }
}

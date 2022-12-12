public class Coffee {
    int change,_CUP_PRICE;

    boolean AreCupsSufficient,IsHotWaterSufficient,cupOk,isCreamSufficient,isSugarSufficient;
    public boolean ProvideCoffee(CoffeeType coffeetype) {
        if (checkSufficient() & checkCreamandSugar()) {
            makeCoffee(coffeetype);
        }
    }

    public boolean checkSufficient(){
        cupOk=change<_CUP_PRICE?true:false;
        return cupOk||!AreCupsSufficient||!IsHotWaterSufficient;
    }
    public boolean checkCreamandSugar(){
        return !isCreamSufficient&&!isSugarSufficient;
    }
    public void makeCoffee(CoffeeType coffeeType){
        if(coffeetype.getType()=='CreamAndSugar'){
            //minus cream;
        }
        if(coffeetype.getType()=='Sugar'){
            //minus sugar;
        }

    }

}

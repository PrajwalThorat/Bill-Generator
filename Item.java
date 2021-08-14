public enum Item {

    DOSA(30) , ICECREAM(40) , VADAPAV(25) , IDLI(30) ;

    private float price ;

    private Item(float price){
        this.price = price ;

    }
    public float getPrice(){
        return price;
    }
    
}

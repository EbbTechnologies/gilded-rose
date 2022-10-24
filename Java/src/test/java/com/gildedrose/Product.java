public class Product{
    protected int sellIn;
    protected int quality;

    public Product(int sellInt,int quality){
        this.sellIn=sellInt;
        this.quality=quality;
    }

    public void EndDay(){

        if (this.sellIn<=0){
            if (this.quality >=2){
                this.quality-=2;
            }
            else {
                this.quality=0;
            }
        }
        else if (this.sellIn>=1){
            if (this.quality>1){
                this.quality-=1;
            }
            else {
                this.quality=0;
            }
        }
    }

    public void IncreaseQuality(int newQuality){
        if ((this.quality+newQuality)<=50){
            this.quality+=newQuality;
        }

    }

    public int getQuality(){return this.quality;}
    public int getSellIn(){return this.sellIn;}

    
}
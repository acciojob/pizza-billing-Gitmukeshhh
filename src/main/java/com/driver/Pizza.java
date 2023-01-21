package com.driver;

public class Pizza{

    private int price;
    private Boolean isVeg;
    private String bill;

    private  int cheese;
    private  int toppings;

     boolean isExtraCheeseAdded;
     boolean isExtraToppingAdded;
     boolean istakeawayAdded;
     boolean isbillgenrate;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isbillgenrate=false;
        istakeawayAdded=false;
        isExtraCheeseAdded=false;
        isExtraToppingAdded=false;
        bill="";

        if(isVeg){
            this.price=300;
            this.toppings=70;
        }else{
            this.price=400;
            this.toppings=120;
        }
           this.cheese=80;
           this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice()
    {
        return this.price;

    }


     public void addExtraCheese(){

        if(!isExtraCheeseAdded) {
            this.price = this.price + cheese;
            this.isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingAdded){
            this.price=this.price+toppings;
            isExtraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        if(!istakeawayAdded){
              this.price+=20;
              istakeawayAdded=true;
        }

    }

    public String getBill(){
        // your code goes here

         if(!isbillgenrate){

             if(isExtraCheeseAdded){
                 this.bill+="Extra Cheese Added: "+this.cheese+"\n";
             }
             if(isExtraToppingAdded){
                 this.bill+="Extra Topping Added: "+this.toppings+"\n";
             }
             if (istakeawayAdded){
                 this.bill+="Paperbag Added: "+"20"+"\n";
             }
                 this.bill+="Total Price: "+this.price+"\n";
                 isbillgenrate=true;
         }
        return this.bill;
    }

}

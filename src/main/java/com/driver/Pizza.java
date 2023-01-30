package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAway;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean addTakeAway;
    private boolean isBillGeneration;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAway = 20;

        if(isVeg==true){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        this.addExtraCheese = false;
        this.addTakeAway = false;
        this.addExtraToppings = false;
        this.isBillGeneration = false;
        this.bill = "Base Price Of The Pizza: " + this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addExtraCheese==false){
            this.price += this.cheesePrice;
            addExtraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addExtraToppings == false) {
            this.price = this.price + this.toppingsPrice;
            addExtraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addTakeAway == false){
            this.price = this.price + this.takeAway;
            addTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGeneration == false){
            if(addExtraCheese==true){
                this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(addExtraToppings == true) {
                this.bill += "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if(addTakeAway == true){
                this.bill += "Paperbag Added: "+this.takeAway+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";
            isBillGeneration = true;
        }
        return this.bill;
    }
}


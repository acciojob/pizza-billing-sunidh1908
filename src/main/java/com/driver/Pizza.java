package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;

    private boolean extraCheese;
    private boolean extraTopping;
    private boolean isTakeAway;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){

        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;
        this.extraCheese = false;
        this.extraTopping = false;
        this.isTakeAway = false;
        this.isVeg = isVeg;

        if(isVeg == true){
            this.price = 300;
            this.extraToppingPrice = 80;
        }
        else {
            this.price = 400;
            this.extraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == false){
            this.price = this.price + this.extraCheesePrice;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isTakeAway == false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAway = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAway == false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            isBillGenerated = true;
            if(extraCheese == true){
                this.bill = this.price + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if(extraTopping == true){
                this.bill = this.price + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if(isTakeAway == true){
                this.bill = this.price + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: " + this.price;
        }
        return this.bill;
    }
}

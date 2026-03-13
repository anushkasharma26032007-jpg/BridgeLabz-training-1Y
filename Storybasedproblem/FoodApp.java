package Storybasedproblem;
class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int id,double amount){
        orderId=id;
        baseAmount=amount;
    }

    double calculateBill(){
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order{

    RegularOrder(int id,double amount){
        super(id,amount);
    }

    double calculateBill(){
        return baseAmount + deliveryCharge;
    }
}

class PremiumOrder extends Order{

    PremiumOrder(int id,double amount){
        super(id,amount);
    }

    double calculateBill(){
        double discount = baseAmount*0.20;
        return baseAmount-discount+deliveryCharge;
    }
}

public class FoodApp {
    public static void main(String[] args){

        Order o1=new RegularOrder(1,500);
        Order o2=new PremiumOrder(2,500);

        System.out.println("Regular Order Bill: "+o1.calculateBill());
        System.out.println("Premium Order Bill: "+o2.calculateBill());
    }
}

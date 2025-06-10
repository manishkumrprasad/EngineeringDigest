package EngineeringDigest.CoreJava.Enumerations;

public enum Apple {
    A1(10) , A2(20) , A3(12) , A4(23), A5(17) ;

    int price = 0;
    int count = 0;

    Apple(int p){
        this.price = p;
        count += 1;
        System.out.println("-----------------------" + count);
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int p){
        this.price = p;
        System.out.println("Price set successfully");
    }


}

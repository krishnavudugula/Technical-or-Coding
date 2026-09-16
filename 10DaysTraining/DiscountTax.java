public class DiscountTax {
    public static void main(String[] args) {
        
        double AB = 23000;
        double tax = 0;
        double dis = 0;

        if(AB>25000){
            dis=AB*0.15;
            tax=AB*0.18;
        } 
        else if(AB>=10000 && AB<=25000){
            dis = AB*0.10;
            tax= AB*0.15;
        }
        else if(AB>=5000 && AB<10000){
            dis= AB*0.05;
            tax= AB*0.12;
        }
        else {
            tax = AB*0.10;
        }
        double result = AB - dis + tax;
        System.out.println(AB);
        System.out.println(dis);
        System.out.println(tax);
        System.out.println(result);
    }
}

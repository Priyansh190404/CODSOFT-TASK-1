import java.util.Scanner;

class currency{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Usd to Rupees, 2 for Rupees to Usd,3 for Rupees to Euro and 4 for Euro to Rupees,5 for Rupees to Jpy ,6 for Jpy to Rupees");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Enter amount in Usd");
            double Usd=sc.nextDouble();
            System.out.println("Amount in Rupees="+ UsdtoRupees(Usd));
        }
        else if(choice==2){
            System.out.println("Enter amount in Rupees");
            double Rupees=sc.nextDouble();
            System.out.println("Amount in Usd="+ RupeestoUsd(Rupees));
        }
        else if(choice==3){
            System.out.println("Enter amount in Rupees");
            double Rupees=sc.nextDouble();
            System.out.println("Amount in Euro="+ RupeestoEuro(Rupees));
        }
        else if(choice==4){
            System.out.println("Enter amount in Euro");
            double Euro=sc.nextDouble();
            System.out.println("Amount in Rupees="+ EurotoRupees(Euro));


        }
        else if(choice==5){
            System.out.println("Enter amount in Rupees");
            double Rupees=sc.nextDouble();
            System.out.println("Amount in Jpy="+ RupeestoJpy(Rupees));
        }
        else if(choice==6){
            System.out.println("Enter amount in Jpy");
            double Jpy=sc.nextDouble();
            System.out.println("Amount in Rupees="+ JpytoRupees(Jpy));
        }
        else{
            System.out.println("Invalid choice.");

        }
        
        }
        public static double UsdtoRupees(double Usd){
            return Usd*83.55;
        }
        public static double RupeestoUsd(double Rupees){
            return Rupees*0.012;
        }
        public static double RupeestoEuro(double Rupees){
            return Rupees*0.011;
        }
        public static double EurotoRupees(double Euro){
            return Euro*89.54;
        }
         public static double JpytoRupees(double Jpy){
            return Jpy*0.53068;
        } public static double RupeestoJpy(double Rupees){
            return Rupees*1.88366;
        }



    }

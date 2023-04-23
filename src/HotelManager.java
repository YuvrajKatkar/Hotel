import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class HotelManager {
    Hotel h;// int a
    static Scanner sc = new Scanner(System.in);
    public void chooseHotel(){
        System.out.println("Select a Hotel");
        if(h==null){
            System.out.println("1.Panchami Hotel 2.Khusboo Hotel");
            switch(sc.nextInt()) {
                case 1: h = new Hotel1();break;
                case 2: h = new Hotel2();break;
            }
        }
        else{
            System.out.println("Hotel is already selected now you can order food");
            //System.out.println("Do you want to change hotel");
        }

    }
    public void orderFood(){
        if(h==null){
            System.out.println("Select a Hotel a first");
        }
        else{
            if(h instanceof Hotel1){
                Hotel1 h1 = (Hotel1) h;
                System.out.println("Welcome to Panchami Hotel");
                while(true){
                    System.out.println("Enter which food you want to select out of below - [1-8]");
                    System.out.println("1. "+h1.food1+ " price: "+h1.price1+" ");
                    //1. Roti price: 20
                    //2. Naan price: 40
                    System.out.println("2. "+h1.food2+ " price: "+h1.price2+" ");
                    System.out.println("3. "+h1.food3+ " price: "+h1.price3+" ");
                    System.out.println("4. "+h1.food4+ " price: "+h1.price4+" ");
                    System.out.println("5. "+h1.food5+ " price: "+h1.price5+" ");
                    System.out.println("6. "+h1.food6+ " price: "+h1.price6+" ");
                    System.out.println("7. "+h1.food7+ " price: "+h1.price7+" ");
                    System.out.println("8. "+h1.food8+ " price: "+h1.price8+" ");
                    System.out.println("9. Confirm order and bring food");

                    switch (sc.nextInt()){
                        case 1:{
                            System.out.println("Select quantity: ");
                            h1.qty1 = h1.qty1 + sc.nextInt();
                            System.out.println("You have total "+h1.qty1+" for "+h1.food1);
                            break;
                        }
                        case 2:{
                            System.out.println("Select quantity: ");
                            h1.qty2 = h1.qty2 + sc.nextInt();
                            System.out.println("You have total "+h1.qty2+" for "+h1.food2);
                            break;
                        }
                        case 3:{
                            System.out.println("Select quantity: ");
                            h1.qty3 = h1.qty3 + sc.nextInt();
                            System.out.println("You have total "+h1.qty3+" for "+h1.food3);
                            break;
                        }
                        case 4:{
                            System.out.println("Select quantity: ");
                            h1.qty4 = h1.qty4 + sc.nextInt();
                            System.out.println("You have total "+h1.qty4+" for "+h1.food4);
                            break;
                        }
                        case 5:{
                            System.out.println("Select quantity: ");
                            h1.qty5 = h1.qty5 + sc.nextInt();
                            System.out.println("You have total "+h1.qty5+" for "+h1.food5);
                            break;
                        }
                        case 6:{
                            System.out.println("Select quantity: ");
                            h1.qty6 = h1.qty6 + sc.nextInt();
                            System.out.println("You have total "+h1.qty6+" for "+h1.food6);
                            break;
                        }
                        case 7:{
                            System.out.println("Select quantity: ");
                            h1.qty7 = h1.qty7 + sc.nextInt();
                            System.out.println("You have total "+h1.qty7+" for "+h1.food7);
                            break;
                        }
                        case 8:{
                            System.out.println("Select quantity: ");
                            h1.qty8 = h1.qty8 + sc.nextInt();
                            System.out.println("You have total "+h1.qty8+" for "+h1.food8);
                            break;
                        }
                        case 9:
                            System.out.println("Your order is placed");
                            return;
                    }
                }
            }
            else{
                Hotel2 h1 = (Hotel2) h;
                System.out.println("Welcome to Panchami Hotel");
                while(true){
                    System.out.println("Enter which food you want to select out of below - [1-8]");
                    System.out.println("1. "+h1.food1+ " price: "+h1.price1+" ");
                    System.out.println("2. "+h1.food2+ " price: "+h1.price2+" ");
                    System.out.println("3. "+h1.food3+ " price: "+h1.price3+" ");
                    System.out.println("4. "+h1.food4+ " price: "+h1.price4+" ");
                    System.out.println("5. "+h1.food5+ " price: "+h1.price5+" ");
                    System.out.println("6. "+h1.food6+ " price: "+h1.price6+" ");
                    System.out.println("7. "+h1.food7+ " price: "+h1.price7+" ");
                    System.out.println("8. "+h1.food8+ " price: "+h1.price8+" ");
                    System.out.println("9. Confirm order and bring food");
                    switch (sc.nextInt()){
                        case 1:{
                            System.out.println("Select quantity: ");
                            h1.qty1 = h1.qty1 + sc.nextInt();
                            System.out.println("You have total "+h1.qty1+" for "+h1.food1);
                            break;
                        }
                        case 2:{
                            System.out.println("Select quantity: ");
                            h1.qty2 = h1.qty2 + sc.nextInt();
                            System.out.println("You have total "+h1.qty2+" for "+h1.food2);
                            break;
                        }
                        case 3:{
                            System.out.println("Select quantity: ");
                            h1.qty3 = h1.qty3 + sc.nextInt();
                            System.out.println("You have total "+h1.qty3+" for "+h1.food3);
                            break;
                        }
                        case 4:{
                            System.out.println("Select quantity: ");
                            h1.qty4 = h1.qty4 + sc.nextInt();
                            System.out.println("You have total "+h1.qty4+" for "+h1.food4);
                            break;
                        }
                        case 5:{
                            System.out.println("Select quantity: ");
                            h1.qty5 = h1.qty5 + sc.nextInt();
                            System.out.println("You have total "+h1.qty5+" for "+h1.food5);
                            break;
                        }
                        case 6:{
                            System.out.println("Select quantity: ");
                            h1.qty6 = h1.qty6 + sc.nextInt();
                            System.out.println("You have total "+h1.qty6+" for "+h1.food6);
                            break;
                        }
                        case 7:{
                            System.out.println("Select quantity: ");
                            h1.qty7 = h1.qty7 + sc.nextInt();
                            System.out.println("You have total "+h1.qty7+" for "+h1.food7);
                            break;
                        }
                        case 8:{
                            System.out.println("Select quantity: ");
                            h1.qty8 = h1.qty8 + sc.nextInt();
                            System.out.println("You have total "+h1.qty8+" for "+h1.food8);
                            break;
                        }
                        case 9: System.out.println("Your order is placed, you can order again if you want");

                            return;
                    }
                }
            }
        }
    }
    public void bill(){
        if(h==null){
            System.out.println("Select hotel first and order food first");
        }
        else{
            if(h instanceof Hotel1){
                Hotel1 h1 = (Hotel1) h;
                if(h1.qty1==0 && h1.qty2==0 && h1.qty3==0 && h1.qty4==0 && h1.qty5==0 && h1.qty6==0 && h1.qty7==0 && h1.qty8==0){
                    System.out.println("Order food first ");
                }
                else{
                    System.out.println("Bill");
                    int count = 1;
                    float sum = 0;
                    if(h1.qty1!=0){
                        System.out.println(count+ ". Food : "+ h1.food1+" amount: "+h1.qty1*h1.price1);
                        sum += h1.qty1*h1.price1;
                    }
                    if(h1.qty2!=0){
                        System.out.println(count+ ". Food : "+ h1.food2+" amount: "+h1.qty2*h1.price2);
                        sum += h1.qty2*h1.price2;
                    }
                    if(h1.qty3!=0){
                        System.out.println(count+ ". Food : "+ h1.food3+" amount: "+h1.qty3*h1.price3);
                        sum += h1.qty3*h1.price3;
                    }
                    if(h1.qty4!=0){
                        System.out.println(count+ ". Food : "+ h1.food4+" amount: "+h1.qty4*h1.price4);
                        sum += h1.qty4*h1.price4;
                    }
                    if(h1.qty5!=0){
                        System.out.println(count+ ". Food : "+ h1.food5+" amount: "+h1.qty5*h1.price5);
                        sum += h1.qty5*h1.price5;
                    }
                    if(h1.qty6!=0){
                        System.out.println(count+ ". Food : "+ h1.food6+" amount: "+h1.qty6*h1.price6);
                        sum += h1.qty6*h1.price6;
                    }
                    if(h1.qty7!=0){
                        System.out.println(count+ ". Food : "+ h1.food7+" amount: "+h1.qty7*h1.price7);
                        sum += h1.qty7*h1.price7;
                    }
                    if(h1.qty8!=0){
                        System.out.println(count+ ". Food : "+ h1.food8+" amount: "+h1.qty8*h1.price8);
                        sum += h1.qty8*h1.price8;
                    }
                    System.out.println("CGST amount: "+sum*h1.cgst/100);
                    float cg = sum*h1.cgst/100;
                    System.out.println("SGST amount: "+sum*h1.sgst/100);
                    float sg = sum*h1.sgst/100;

                    float tip =0;
                    System.out.println("Do you pay any tip: 1.Yes 2.No");
                    if(sc.nextInt()==1){
                        System.out.println("Enter amount of tip you want to pay: ");
                        tip = sc.nextFloat();
                    }
                    sum = sum + cg+ sg+tip;
                    h.amount = sum;
                    System.out.println("Total amount to be paid: "+sum);
                }
            }
            else{
                Hotel2 h1 =(Hotel2) h;
                if(h1.qty1==0 && h1.qty2==0 && h1.qty3==0 && h1.qty4==0 && h1.qty5==0 && h1.qty6==0 && h1.qty7==0 && h1.qty8==0){
                    System.out.println("Order food first ");
                }
                else{
                    StringBuffer s1 = new StringBuffer();
                    File f1  = new File("");
                    try{
                        if(f1.createNewFile()){
                            FileWriter f2 = new FileWriter("");
                            f2.write("Bill");
                        }
                        else{
                            System.out.println("File not created");
                        }
                    }
                    catch (IOException e){

                    }
                    System.out.println("Bill");
                    int count = 1;
                    float sum = 0;
                    if(h1.qty1!=0){
                        System.out.println(count+ ". Food : "+ h1.food1+" amount: "+h1.qty1*h1.price1);
                        sum += h1.qty1*h1.price1;
                    }
                    if(h1.qty2!=0){
                        System.out.println(count+ ". Food : "+ h1.food2+" amount: "+h1.qty2*h1.price2);
                        sum += h1.qty2*h1.price2;
                    }
                    if(h1.qty3!=0){
                        System.out.println(count+ ". Food : "+ h1.food3+" amount: "+h1.qty3*h1.price3);
                        sum += h1.qty3*h1.price3;
                    }
                    if(h1.qty4!=0){
                        System.out.println(count+ ". Food : "+ h1.food4+" amount: "+h1.qty4*h1.price4);
                        sum += h1.qty4*h1.price4;
                    }
                    if(h1.qty5!=0){
                        System.out.println(count+ ". Food : "+ h1.food5+" amount: "+h1.qty5*h1.price5);
                        sum += h1.qty5*h1.price5;
                    }
                    if(h1.qty6!=0){
                        System.out.println(count+ ". Food : "+ h1.food6+" amount: "+h1.qty6*h1.price6);
                        sum += h1.qty6*h1.price6;
                    }
                    if(h1.qty7!=0){
                        System.out.println(count+ ". Food : "+ h1.food7+" amount: "+h1.qty7*h1.price7);
                        sum += h1.qty7*h1.price7;
                    }
                    if(h1.qty8!=0){
                        System.out.println(count+ ". Food : "+ h1.food8+" amount: "+h1.qty8*h1.price8);
                        sum += h1.qty8*h1.price8;
                    }

                    System.out.println("CGST amount: "+sum*h1.cgst/100);
                    float cg = sum*h1.cgst/100;
                    System.out.println("SGST amount: "+sum*h1.sgst/100);
                    float sg = sum*h1.sgst/100;

                    float tip =0;
                    System.out.println("Do you pay any tip: 1.Yes 2.No");
                    if(sc.nextInt()==1){
                        System.out.println("Enter amount of tip you want to pay: ");
                        tip = sc.nextFloat();
                    }
                    sum = sum + cg+ sg+tip;
                    h.amount = sum;
                    System.out.println("Total amount to be paid: "+sum);


                }
            }
        }
    }
    public void payment(){
        if(h==null){
            System.out.println("Hotel not select, select hotel first");
        }
        else{
            if(h.amount==0){
                System.out.println("Your order has not been placed, order again");
            }
            else{
                System.out.println("Pay amount greater than or equal to :"+h.amount);
                if(sc.nextFloat()>=h.amount){
                    System.out.println("Payment successful, Visit again!!");
                    h=null;
                }
                else{
                    System.out.println("Please pay complete amount, start again payment process ");
                }
            }
        }

    }
//    public void reserveTable(){
//        if(h instanceof Hotel1){
//            Hotel1 h1 = (Hotel1) h;
//
//        }
//    }
}

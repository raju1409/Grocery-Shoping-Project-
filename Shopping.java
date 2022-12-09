package com.pack1;
import java.util.Scanner;

public class Shopping {
    Scanner input1 = new Scanner(System.in);
    float DiscountAmount;int Option;int TotalCost;int countItems;String BillItems = "";String presentPassword = "123456";
    String ProductName;int AvailTomatoQty = 20;int AvailOnionQty = 20;int AvailPotatoQty = 20;int MinDiscountAmount = 1500;int MaxDiscountAmount = 3000;
    int AvailAppleQty = 20;int AvailBananaQty = 20;int AvailGrapeQty = 20;int AvailChickenQty = 20;byte MinDiscountPercentage = 5;byte MaxDiscountPercentage = 10;
    int AvailMuttonQty = 20;int AvailFishQty = 20;int TomatoPrice = 50;int OnionPrice = 40;int PotatoPrice = 60;int presentPasswordAttempts = 3;
    int ApplePrice = 20;int BananaPrice = 10;int GrapePrice = 25;int ChickenPrice = 250;int MuttonPrice = 700;int FishPrice = 300;

    int vegetablesList(){
        while(Option != 1) {
            System.out.println("\u001b[7mMenu\u001b[0m --> \u001b[7mVegetables Menu\u001b[0m --------------------------------------------");
            System.out.println("\u001b[38;5;68m=====================================================================");
            System.out.println("\u001b[7m|      ProductCode |  Product   |    Price/Kg    |  Avail.Quantity  |\u001b[0m");
            System.out.println("\u001b[38;5;68m|-------------------------------------------------------------------|");
            System.out.println("|       30         |  Tomato    |      " + TomatoPrice + addPriceSpaces(TomatoPrice) + "|      " + AvailTomatoQty + " KG/s" + addQtySpaces(AvailTomatoQty) + "|");
            System.out.println("|       31         |  Onion     |      " + OnionPrice + addPriceSpaces(OnionPrice) + "|      " + AvailOnionQty + " KG/s" + addQtySpaces(AvailOnionQty) + "|");
            System.out.println("|       32         |  Potato    |      " + PotatoPrice + addPriceSpaces(PotatoPrice) + "|      " + AvailPotatoQty + " KG/s" + addQtySpaces(AvailPotatoQty) + "|");
            System.out.println("=====================================================================\u001b[0m");
            System.out.println("  \u001b[7m Menu \u001b[0m : 1                                  \u001b[7m Get BILL \u001b[0m : 0");
            System.out.print("Choose the Product Code to Buy : ");
            Option = input1.nextInt();
            int Quantity;
            if (Option == 1) {
                return 1;
            }else if (Option == 30) {
                System.out.print("You have selected Tomato \nChoose Quantity : ");
                Quantity = input1.nextInt();
//                ProductPrice = 50;
                ProductName = "Tomato    ";
                if (AvailTomatoQty<0) {
                    System.out.println("\u001b[31mTomato's are Not Available !!\u001b[1m");
                    AvailTomatoQty = 0;
                }else if (Quantity>AvailTomatoQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Tomato's Quantity\u001b[0m");
                }else{
                    AvailTomatoQty -= Quantity;
                    this.calculate(Quantity, TomatoPrice, ProductName);
                }
            }else if (Option == 31){
                System.out.print("You have selected Onion \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Onion     ";
                if (AvailOnionQty<0) {
                    System.out.println("\u001b[31mOnion's are Not Available !!\u001b[0m");
                    AvailOnionQty = 0;
                }else if (Quantity>AvailOnionQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Onion's Quantity\u001b[0m");
                }else{
                    AvailOnionQty -= Quantity;
                    this.calculate(Quantity,OnionPrice, ProductName);
                }
            }else if (Option == 32){
                System.out.print("You have selected Potato \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Potato    ";
                if (AvailPotatoQty<0) {
                    System.out.println("\u001b[31mPotato's are Not Available !!\u001b[0m");
                    AvailPotatoQty = 0;
                }else if (Quantity>AvailPotatoQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Potato's Quantity\u001b[0m");
                }else {
                    AvailPotatoQty -= Quantity;
                    this.calculate(Quantity,PotatoPrice, ProductName);
                }
            }else if (Option == 0){
                return 0;
            }else {
                System.out.println("You have entered \u001b[31m INVALID Option \u001b[0m Please Try Again :)");
            }
        }return 0;
    }

    int fruitsList(){
        while(Option != 1) {
            System.out.println("\u001b[7mMenu\u001b[0m --> \u001b[7mFruits Menu\u001b[0m -----------------------------");
            System.out.println("\u001b[38;5;63m=====================================================================");
            System.out.println("\u001b[7m|      ProductCode |  Product   |    Price/Kg    |  Avail.Quantity  |\u001b[0m");
            System.out.println("\u001b[38;5;63m|-------------------------------------------------------------------|");
            System.out.println("|       20         |  Apple     |      "+ApplePrice+addPriceSpaces(ApplePrice)+"|      "+AvailAppleQty+addQtySpacesfruits(AvailAppleQty)+"|");
            System.out.println("|       21         |  Banana    |      "+BananaPrice+addPriceSpaces(BananaPrice)+"|      "+AvailBananaQty+addQtySpacesfruits(AvailBananaQty)+"|");
            System.out.println("|       22         |  Grape     |      "+GrapePrice+addPriceSpaces(GrapePrice)+"|      "+AvailGrapeQty+addQtySpacesfruits(AvailGrapeQty)+"|");
            System.out.println("=====================================================================\u001b[0m");
            System.out.println("  \u001b[7m Menu \u001b[0m : 1                                  \u001b[7m Get BILL \u001b[0m : 0");
            System.out.print("Choose the Product Code to Buy : ");
            Option = input1.nextInt();
            if (Option==1)
                return 1;
            int Quantity;
            if (Option == 20) {
                System.out.print("You have selected Apples \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Apple     ";
                if (AvailAppleQty<0) {
                    System.out.println("\u001b[31mApple's are Not Available !!\u001b[0m");
                    AvailAppleQty = 0;
                }else if (Quantity>AvailAppleQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Apple's Quantity\u001b[0m");
                }else {
                    AvailAppleQty -= Quantity;
                    this.calculate(Quantity, ApplePrice, ProductName);
                }
            }else if (Option == 21){
                System.out.print("You have selected Banana \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Banana    ";
                if (AvailBananaQty<0) {
                    System.out.println("\u001b[31mBanana's are Not Available !!\u001b[0m");
                    AvailBananaQty = 0;
                }else if (Quantity>AvailBananaQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Banana's Quantity\u001b[0m");
                }else {
                    AvailBananaQty -= Quantity;
                    this.calculate(Quantity, BananaPrice,ProductName);
                }
            }else if (Option == 22){
                System.out.print("You have selected Grapes \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Grapes    ";
                if (AvailGrapeQty<0) {
                    System.out.println("\u001b[31mGrape's are Not Available !!\u001b[0m");
                    AvailGrapeQty = 0;
                }else if (Quantity>AvailGrapeQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Grape's Quantity\u001b[0m");
                }else {
                    AvailGrapeQty -= Quantity;
                    this.calculate(Quantity, GrapePrice, ProductName);
                }
            }else if (Option == 0){
                return 0;
            }else {
                System.out.println("You have entered \u001b[31m INVALID Option \u001b[0m Please Try Again :)");
            }
        }return 0;
    }

    int meatList(){
        while(Option != 1) {
            System.out.println("\u001b[7mMenu\u001b[0m --> \u001b[7mFruits Menu\u001b[0m -----------------------------");
            System.out.println("\u001b[38;5;63m====================================================================");
            System.out.println("\u001b[7m|      ProductCode |  Product   |    Price/Kg    |  Avail.Quantity |\u001b[0m");
            System.out.println("\u001b[38;5;63m|------------------------------------------------------------------|");
            System.out.println("|       40         |  Chicken   |     "+ChickenPrice+addPriceSpaces(ChickenPrice)+"|      "+AvailChickenQty+" Kg/s"+addQtySpaces(AvailChickenQty)+"|");
            System.out.println("|       41         |  Mutton    |     "+MuttonPrice+addPriceSpaces(MuttonPrice)+"|      "+AvailMuttonQty+" Kg/s"+addQtySpaces(AvailMuttonQty)+"|");
            System.out.println("|       42         |  Fish      |     "+FishPrice+addPriceSpaces(FishPrice)+"|      "+AvailFishQty+" Kg/s"+addQtySpaces(AvailFishQty)+"|");
            System.out.println("====================================================================\u001b[0m");
            System.out.println("  \u001b[7m Menu \u001b[0m : 1                                  \u001b[7m Get BILL \u001b[0m : 0");
            System.out.print("Choose the Product Code to Buy : ");
            Option = input1.nextInt();
            if (Option==1)
                return 1;
            int Quantity;
            if (Option == 40) {
                System.out.print("You have selected Chicken \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Chicken   ";
                if (AvailChickenQty<0) {
                    System.out.println("\u001b[31mChicken is Not Available !!\u001b[0m");
                    AvailChickenQty = 0;
                }else if (Quantity>AvailChickenQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Chicken Quantity\u001b[0m");
                }else {
                    AvailChickenQty -= Quantity;
                    this.calculate(Quantity, ChickenPrice, ProductName);
                }
            }else if (Option == 41){
                System.out.print("You have selected Mutton \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Mutton    ";
                if (AvailMuttonQty<0) {
                    System.out.println("\u001b[31mMutton is Not Available !!\u001b[0m");
                    AvailMuttonQty = 0;
                }else if (Quantity>AvailMuttonQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Mutton Quantity\u001b[0m");
                }else {
                    AvailMuttonQty -= Quantity;
                    this.calculate(Quantity, MuttonPrice, ProductName);
                }
            }else if (Option == 42){
                System.out.print("You have s-elected Fish \nChoose Quantity : ");
                Quantity = input1.nextInt();
                ProductName = "Fish      ";
                if (AvailFishQty<0) {
                    System.out.println("\u001b[31mFish is Not Available !!\u001b[0m");
                    AvailFishQty = 0;
                }else if (Quantity>AvailFishQty){
                    System.out.println("\u001b[1m\u001b[31mQuantity entered More Than Available Fish Quantity\u001b[0m");
                }else {
                    AvailFishQty -= Quantity;
                    this.calculate(Quantity, FishPrice, ProductName);
                }
            }else if (Option == 0){
                return 0;
            }else {
                System.out.println("You have entered \u001b[31m INVALID Option \u001b[0m Please Try Again :)");
            }
        }return 0;
    }
    void checkPasswordAttempts() {

        System.out.println("You Have \u001b[32m" + presentPasswordAttempts + "\u001b[0m Attempts left !!");
        System.out.print("Enter Password : ");
        String Password;
        Password = input1.next();
        if (Password.equals(presentPassword)) {
            this.CheckGoods();
        } else {
            System.out.println("\u001b[31mInvalid PassWord\u001b[0m Try Again !!");
            presentPasswordAttempts -= 1;
        }
    }
    void menu(){
        while(Option!=100) {
            System.out.println("__________________________________________________");
            System.out.println("\u001b[7mMenu\u001b[0m----------------------------------------------");
            System.out.println("==================================================");
            System.out.println("|                 2)  Fruits                     |");
            System.out.println("|                 3)  Vegetables                 |");
            System.out.println("|                 4)  Meat                       |");
            System.out.println("|                                                |");
            System.out.println("| \u001b[32m99) CLIENT Login (To Update Items)\u001b[0m             |");
            System.out.println("==================================================");
            System.out.println("       Exit : 100          GET BILL : 0");
            System.out.println("\u001b[38;5;34m===GET "+MaxDiscountPercentage+" % DISCOUNT ON PURCHASE OVER "+ MaxDiscountAmount+"/-===");
            System.out.println("===GET  "+ MinDiscountPercentage+" % DISCOUNT ON PURCHASE OVER "+ MinDiscountAmount+"/- \u001b[0m");
            System.out.print("Choose Your Option here : ");
            Option = input1.nextInt();
            if (Option==0) {
                if (countItems != 0) {
                    this.getBill();
                    break;
                }else {
                    System.out.println("\u001b[31mYou Have Not Purchased Anything  Try Again !!!!\u001b[0m");
                }
            }
            else if (Option == 2) {
                Option = this.fruitsList();
                if (Option==0)
                    if (countItems != 0) {
                        this.getBill();
                        break;
                    }else{
                        System.out.println("\u001b[31mYou Have Not Purchased Anything  Try Again !!!!\u001b[0m");
                    }
            }else if (Option == 3){
                Option = this.vegetablesList();
                if (Option==0)
                    if (countItems != 0) {
                        this.getBill();
                        break;
                    }else{
                        System.out.println("\u001b[31mYou Have Not Purchased Anything  Try Again !!!!\u001b[0m");
                    }
            }else if (Option == 4){
                Option = this.meatList();
                if (Option==0)
                    if (countItems != 0) {
                        this.getBill();
                        break;
                    }else{
                        System.out.println("\u001b[31mYou Have Not Purchased Anything  Try Again !!!!\u001b[0m");
                    }
            }else if(Option == 99){
                if ( presentPasswordAttempts > 0){
                    this.checkPasswordAttempts();
                }else{
                    System.out.println("\u001b[41mAuthentication Declined\u001b[0m");
                }
            }else if (Option==1){
                continue;
            }else if (Option ==100 && countItems != 0){
                System.out.println("Thank You For Shopping !!!");
                break;
            }else if (Option==100){
                if (countItems == 0){
                    System.out.println("\u001b[31mYou have Not Purchased Anything !!\u001b[0m");
                }
                break;
            }
            else{
                System.out.println("You Have entered \u001b[1m\u001b[31m INVALID \u001b[0mOption. Please Try Again");
            }
        }System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shopping obj = new Shopping();
        System.out.println("MainMenu=========================");
        System.out.println("=================================");
        System.out.println("|         1)  Menu              |");
        System.out.println("|         100)  Exit            |");
        System.out.println("=================================");
        System.out.print("Choose Your Option here : ");
        obj.Option = input.nextInt();
        int Option11;
        if (obj.Option == 1) {
            obj.menu();
        } else if (obj.Option == 100 && obj.countItems == 0) {
            System.out.println("Thank You for Using !!\u001b[31mYou Hava Not Bought Anythong !!\u001b[0m");
        } else
            System.out.println("You have Entered \u001b[31m Invalid Option  \u001b[0m Try again !!");
    }


    void getBill(){
        if (BillItems.length()>0) {
            System.out.print("Please Enter Your Details To Get BILL !\nEnter Your Name : ");
            String CustomerName = input1.next();
            System.out.print("Enter Your Contact Number : ");
            String CustomerContact = input1.next();
            System.out.println("=================\u001b[7m Grocerry Mart\u001b[0m=================");
            System.out.println("|---------------------------------------------|");
            System.out.println("|================= \u001b[7mRECEIPT\u001b[0m ===================|");
            System.out.println("|---------------------------------------------|");
            System.out.println("| \u001b[7mS.NO\u001b[0m  |  \u001b[7mProduct\u001b[0m   |  \u001b[7mQuantity\u001b[0m  |   \u001b[7mprice\u001b[0m   |");
            System.out.println("|---------------------------------------------|");
//            BillItems = BillItems.substring(0, BillItems.length() - 1);
//        the last line break \n is removed
            System.out.println(this.BillItems);
            System.out.println("===============================================");
            System.out.println("Total Quantity of Items                 " + countItems + " no");
            System.out.println("Total Price                             " + TotalCost + "/-");

            if (checkDiscount(TotalCost) == MinDiscountPercentage) {
                DiscountAmount = (TotalCost * ((float)(MinDiscountPercentage)/100));
                System.out.println("\u001b[38;5;34mCONGRATULATION's You Got "+MinDiscountPercentage+" % DISCOUNT on Total Price\u001b[0m");
                System.out.println("DISCOUNT                               \u001b[38;5;34m-" + DiscountAmount + "/-\u001b[0m");
            } else if (checkDiscount(TotalCost) == MaxDiscountPercentage) {
                DiscountAmount = (TotalCost * ((float)(MaxDiscountPercentage)/100));
                System.out.println("\u001b[38;5;34mCONGRATULATION's You Got "+MaxDiscountPercentage+" % DISCOUNT on Total Price\u001b[0m");
                System.out.println("DISCOUNT                               \u001b[38;5;34m-" + DiscountAmount + "/-\u001b[0m");
            } else
                System.out.println("SORRY You Did Not Received Any Discount !!!");
            System.out.println("================================================");
            System.out.println("\u001b[7mGRAND TOTAL AMOUNT\u001b[0m                        \u001b[32m" + (TotalCost - DiscountAmount) + "/-\u001b[0m");
            System.out.println("================================================\n");
            System.out.print("\u001b[7mName\u001b[0m : " + CustomerName + "       \u001b[7mContact Number\u001b[0m : " + CustomerContact+"\n");
            System.out.println("================================================");
            System.out.println("\n=======================Thank You For Shopping !!=========================");
            System.out.println("\nTo SHOP Again Press 1\nTo Exit Press 0\nChoose Your Option here : " );
            byte OP;
            OP=input1.nextByte();
            if (OP==1) {
                this.menu();
            }else{
                System.out.println("Thank You For Shopping !!");
            }
        }
    }

    int checkDiscount(int Price){
        if (Price >0 && Price<MinDiscountAmount){
            return 0;
        }else if (Price>=MinDiscountAmount && Price<MaxDiscountAmount){
            return MinDiscountPercentage;
        }else if (Price>=MaxDiscountAmount){
            return MaxDiscountPercentage;
        }else
            return 0;
    }

    void calculate(int Quantity, int ProductPrice, String ProductName){
        TotalCost += (Quantity * ProductPrice);
        System.out.println("Your present Total cost is : " + TotalCost);
        int PricesLen = 6 - ((Quantity*ProductPrice)+"").length();
        int QuantityLen = 6 - ((Quantity)+"").length();
        int IndexLen = 6-((countItems+"").length());
        this.displayDiscount(TotalCost);
        String addPriceSpaces = "";
        String addQuantitySpaces = "";
        String addIndexSpaces = "";
        for (int k=0;k<IndexLen;k++){
            addIndexSpaces += " ";
        }for(int i=0;i<PricesLen;i++){
            addPriceSpaces += " ";
        }for(int j=0;j<QuantityLen;j++){
            addQuantitySpaces += " ";
        }
        BillItems +="| "+ ++countItems +addIndexSpaces+"|  "+ProductName+"|  "+Quantity+"KG/s"+addQuantitySpaces+"|   "+(Quantity*ProductPrice)+"/-"+addPriceSpaces+"|";
        BillItems += "\n";
    }

    void displayDiscount(int Price){
        if (Price >0 && Price<MinDiscountAmount){
            System.out.println("Shop More "+(MinDiscountAmount-Price)+"/- to Get "+MinDiscountPercentage+" % Discount !! ");
        }else if (Price>=MinDiscountAmount && Price<MaxDiscountAmount){
            System.out.println("\u001b[38;5;34mCONGRATULATIONS You Got "+MinDiscountPercentage+" % Discount on Total Price\u001b[0m");
            System.out.println("Shop More "+(MaxDiscountAmount-Price)+"/- to Get "+MaxDiscountPercentage+" % Discount !! ");
        }else if (Price>MaxDiscountAmount){
            System.out.println("\u001b[38;5;34mCONGRATULATIONS You Got "+MaxDiscountPercentage+" % Discount on Total Price\u001b[0m");
        }
    }

    void CheckGoods(){
        int Value = 0;
        while(Value !=1) {
            System.out.println("\u001b[38;5;72m======================================================================");
            System.out.println("|\u001b[0m      \u001b[7mProductCode\u001b[0m |  \u001b[7mProduct\u001b[0m   |    \u001b[7mPrice/Kg\u001b[0m     |  \u001b[7mAvail.Quantity\u001b[0m  \u001b[38;5;72m|");
            System.out.println("\u001b[38;5;72m|--------------------------------------------------------------------|");
            System.out.println("|       40         |   Chicken  |      "+ChickenPrice+addPriceSpaces(ChickenPrice)+"|      "+AvailChickenQty+" Kg/s"+addQtySpaces(AvailChickenQty)+"|");
            System.out.println("|       41         |   Mutton   |      "+MuttonPrice+addPriceSpaces(MuttonPrice)+"|      "+AvailMuttonQty+" Kg/s"+addQtySpaces(AvailMuttonQty)+"|");
            System.out.println("|       42         |   Fish     |      "+FishPrice+addPriceSpaces(FishPrice)+"|      "+AvailFishQty+" Kg/s"+addQtySpaces(AvailFishQty)+"|");

            System.out.println("|       30         |   Tomato   |      "+TomatoPrice+addPriceSpaces(TomatoPrice)+"|      "+AvailTomatoQty+" Kg/s"+addQtySpaces(AvailTomatoQty)+"|");
            System.out.println("|       31         |   Onion    |      "+OnionPrice+addPriceSpaces(OnionPrice)+"|      "+AvailOnionQty+" Kg/s"+addQtySpaces(AvailOnionQty)+"|");
            System.out.println("|       32         |   Potato   |      "+PotatoPrice+addPriceSpaces(PotatoPrice)+"|      "+AvailPotatoQty+" Kg/s"+addQtySpaces(AvailPotatoQty)+"|");

            System.out.println("|       20         |   Apple    |      "+ApplePrice+addPriceSpaces(ApplePrice)+"|      "+AvailAppleQty+addQtySpacesfruits(AvailAppleQty)+"|");
            System.out.println("|       21         |   Banana   |      "+BananaPrice+addPriceSpaces(BananaPrice)+"|      "+AvailBananaQty+addQtySpacesfruits(AvailBananaQty)+"|");
            System.out.println("|       22         |   Grape    |      "+GrapePrice+addPriceSpaces(GrapePrice)+"|      "+AvailGrapeQty+addQtySpacesfruits(AvailGrapeQty)+"|");
            System.out.println("======================================================================");
            System.out.println("Minimum Discount Amount : "+MinDiscountAmount+"/Rs   Minimum Discount Percentage : "+MinDiscountPercentage+" %");
            System.out.println("Maximum Discount Amount : "+MaxDiscountAmount+"/Rs   Maximum Discount Percentage : "+MaxDiscountPercentage+" %");
            System.out.println("Password Attempts : "+presentPasswordAttempts+"      "+"Password : "+presentPassword);
            System.out.println("======================================================================\u001b[0m");
            System.out.println("\u001b[7m LogOut \u001b[0m : 99");
            System.out.println(" \u001b[38;5;74mUpdate Price : 11               AvailableQuantity Press : 22");
            System.out.println(" To Update Minimum DISCOUNT Amount press : 120");
            System.out.println(" To Update Minimum DISCOUNT Percentage press : 121");
            System.out.println(" To Update Maximum DISCOUNT Amount press : 190");
            System.out.println(" To Update Maximum DISCOUNT Percentage press : 191\n");
            System.out.println(" Reset PASSWORD : 8");
            System.out.println(" Change Number Of PASSWORD ATTEMPTS : 7");
            System.out.print("Enter Your Option Here : \u001b[0m");
            Value = input1.nextInt();
            int ProductCode;
            if (Value == 99){
                break;
            }else if (Value == 8){
                System.out.print("Enter New Password : ");
                presentPassword = input1.next();
                System.out.println("\u001b[38;5;34mPassword Successfully Updated ! \u001b[0m");
            }
            else if(Value == 7){
                System.out.print("Enter Number Of Password Attempts to Change : ");
                presentPasswordAttempts = input1.nextInt();
                while(presentPasswordAttempts>10){
                    System.out.println("\u001b[31mPassword Attempts Cannot be More than \u001b[1m\u001b[31m10\u001b[0m");
                    System.out.print("Enter Number Of Password Attempts to Change : ");
                    presentPasswordAttempts = input1.nextInt();
                }
                System.out.println("\u001b[38;5;34mPassword Attempts Successfully Updated\u001b[0m");
            }
            else if (Value == 11){
                System.out.print("\u001b[38;5;74mPlease Enter The ProductCode To Update : ");
                ProductCode = input1.nextInt();
                System.out.print("Enter The Amount of Product to Update : \u001b[0m");
                int Amount = input1.nextInt();
                UpdatePrice(ProductCode,Amount);
            }else if(Value == 22) {
                System.out.print("\u001b[38;5;74mPlease Enter The ProductCode To Update : ");
                ProductCode = input1.nextInt();
                System.out.print("Enter The Quantity of Product to Update : \u001b[0m");
                int Quantity = input1.nextInt();
                UpdateQuantity(ProductCode, Quantity);
            }
//            Minimum Discount Amount
            else if (Value == 120){
                System.out.print("\u001b[38;5;74mEnter Minimum Discount Amount to Update : ");
                MinDiscountAmount = input1.nextInt();
                while(MinDiscountAmount>5000){
                    System.out.println("\u001b[31mMinimum Discount Amount cannot be More than 5000 Try Again\u001b[0m");
                    System.out.print("Enter Minimum Discount Amount to Update : ");
                    MinDiscountAmount = input1.nextInt();
                }System.out.println("\u001b[38;5;34mMinimum Discount Amount is Successfully Updated\u001b[0m");
            }
//            Minimum DISCOUNT Percentage
            else if (Value == 121){
                System.out.print("Enter Minimum Discount Percentage to Update : ");
                MinDiscountPercentage= input1.nextByte();
                while(MinDiscountPercentage>30){
                    System.out.println("\u001b[31mMinimum Discount Percentage cannot be More than 30 % Try Again\u001b[0m");
                    System.out.print("Enter Minimum Discount Percentage to Update : ");
                    MinDiscountPercentage = input1.nextByte();
                }System.out.println("\u001b[38;5;34mMinimum Discount Percentage is Successfully Updated\u001b[0m");
            }
//            Maximum Discount Amount
            else if (Value == 190){
                System.out.print("Enter Maximum Discount Amount to Update : ");
                MaxDiscountAmount = input1.nextInt();
                while(MaxDiscountAmount>5000){
                    System.out.println("\u001b[31mMaximum Discount Amount cannot be More than 5000 Try Again\u001b[0m");
                    System.out.print("Enter Maximum Discount Amount to Update : ");
                    MaxDiscountAmount = input1.nextInt();
                }System.out.println("\u001b[38;5;34mMaximum Discount Amount is Successfully Updated\u001b[0m");
            }
//            Maximum Discount Percentage
            else if (Value == 191){
                System.out.print("Enter Maximum Discount Percentage to Update : ");
                MaxDiscountPercentage = input1.nextByte();
                while(MinDiscountPercentage>70){
                    System.out.println("\u001b[31mMaximum Discount Percentage cannot be More than 70 % Try Again\u001b[0m");
                    System.out.print("Enter Maximum Discount Percentage to Update : ");
                    MinDiscountPercentage = input1.nextByte();
                }System.out.println("\u001b[38;5;34mMaximum Discount Percentage is Successfully Updated\u001b[0m");
            }else {
                System.out.println("\u001b[31mYou Have Entered Invalid Number Please Try Again !!\u001b[0m");
            }
        }
    }

    void UpdatePrice(int ProductCode,int Amount){
        if (ProductCode == 40){
            this.ChickenPrice = Amount;
        }else if (ProductCode == 41){
            this.MuttonPrice = Amount;
        }else if (ProductCode == 42){
            this.FishPrice = Amount;
        }else if (ProductCode == 30){
            this.TomatoPrice = Amount;
        }else if (ProductCode == 31){
            this.OnionPrice = Amount;
        }else if (ProductCode == 32){
            this.PotatoPrice = Amount;
        }else if (ProductCode == 20){
            this.ApplePrice = Amount;
        }else if (ProductCode == 21){
            this.BananaPrice = Amount;
        }else if (ProductCode == 22){
            this.GrapePrice = Amount;
        }else{
            System.out.println("\u001b[31mEntered Invalid Product Code Try Again\u001b[0m");
        }
    }

    void UpdateQuantity(int ProductCode,int Quantity){
        if (ProductCode == 40){
            this.AvailChickenQty = Quantity;
        }else if (ProductCode == 41){
            this.AvailMuttonQty = Quantity;
        }else if (ProductCode == 42){
            this.AvailFishQty = Quantity;
        }else if (ProductCode == 30){
            this.AvailTomatoQty = Quantity;
        }else if (ProductCode == 31){
            this.AvailOnionQty = Quantity;
        }else if (ProductCode == 32){
            this.AvailPotatoQty = Quantity;
        }else if (ProductCode == 20){
            this.AvailAppleQty = Quantity;
        }else if (ProductCode == 21){
            this.AvailBananaQty = Quantity;
        }else if (ProductCode == 22){
            this.AvailGrapeQty = Quantity;
        }else {
            System.out.println("\u001b[31mEntered Invalid ProductCode Try Again !!!\u001b[0m");
        }
    }

    String addPriceSpaces(int Number){
        String s = Number+"";
        String spaces = "";
        int len = 10-s.length();
        for (int l1 = 0; l1 < len; l1++){
            spaces += " ";
        }
        return spaces;
    }
    String addQtySpaces(int Number){
        String s1 = Number+"";
        String spaces1 = "";
        int len1 = 7-s1.length();
        for (int l2 = 0; l2 < len1; l2++){
            spaces1 += " ";
        }
        return spaces1;
    }

    String addQtySpacesfruits(int Number){
        String s3 = Number+"";
        String spaces3 = "";
        int len3 = 12-s3.length();
        for (int l3 = 0; l3 < len3; l3++){
            spaces3 += " ";
        }
        return spaces3;
    }
}

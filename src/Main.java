class Main {
    public static void main(String[] args) {
        HotelManager hm = new HotelManager();
        Hotel h = new Hotel();
        h.tables[0]=new Table(false);
        h.tables[1]=new Table(false);
        h.tables[2]=new Table(false);
        h.tables[3]=new Table(false);
        h.tables[4]=new Table(false);

        while(true) {
            System.out.println("1. Select Hotel 2. OrderFood 3. Bill 4. Payment \n5. Customer Entered in hotel 6. Customer left table 7.exit");
            switch (hm.sc.nextInt()){
                case 1: {
                    hm.chooseHotel();
                }break;
                case 2:{
                    hm.orderFood();
                }break;
                case 3:{
                    hm.bill();
                }break;
                case 4: hm.payment();
                    break;
                case 5: h.CustomerEntered();break;
                case 6: h.RemoveCustomerFromTable();break;
                case 7:
                    System.out.println("Application is closed");
                    return;
                    //Instead of closing the entire application we choose to return the flow to jvm(caller)
            }
        }
    }
}

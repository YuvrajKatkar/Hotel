class Main {
    public static void main(String[] args) {
        HotelManager hm = new HotelManager();
        while(true) {
            System.out.println("1. Select Hotel 2. OrderFood 3. Bill 4. Payment 5. exit");
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
                case 4: hm.payment();break;
                case 5:
                    System.out.println("Application is closed");
                    return;
                    //Instead of closing the entire application we choose to return the flow to jvm(caller)
            }
        }
    }
}
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

class Hotel {
    float cgst = 9;
    float sgst = 9;
    float amount =0;
    static int token = 0;

    User user;
    Table[] tables = new Table[5];
    Queue<User> waitingList = new PriorityQueue<>();
    public void CustomerEntered(){
        System.out.println("Are you alone or with someone?");
        System.out.println("1.Alone 2.With Someone");
        switch (HotelManager.sc.nextInt()){
            case 1->{
                System.out.println("Please enter your name: ");
                String name = HotelManager.sc.next();
                user = new User(name);
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=0;i<5;i++){
                    if (!tables[i].isReserved){
                        list.add(i);
                    }
                }
                if(!list.isEmpty()){
                    System.out.println("Choose which table you want:");
                    for(int i:list){
                        System.out.println("Table no: " + (i+1));
                    }
                    int no = HotelManager.sc.nextInt()-1;
                    tables[no].user = user;
                    tables[no].isReserved = true;
                    System.out.println("Table number is "+(1+no)+" reserved by "+user.name1);
                    return;
                }
                System.out.println("Currently all tables are occupied, you are assigned with token no: "+ ++token);
                user.token = token;
                waitingList.offer(user);
            }
            case 2->{
                System.out.println("Please enter your name: ");
                String name = HotelManager.sc.next();
                System.out.println("Please enter your partner's name: ");
                String name1 = HotelManager.sc.next();
                user = new User(name,name1);
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=0;i<5;i++){
                    if (!tables[i].isReserved){
                        list.add(i);
                    }
                }
                if(!list.isEmpty()){
                    System.out.println("Choose which table you want:");
                    for(int i:list){
                        System.out.println("Table no: " + (i+1));
                    }
                    int no = HotelManager.sc.nextInt()-1;
                    tables[no].user = user;
                    tables[no].isReserved = true;
                    System.out.println("Table number is "+(no+1)+"reservered by "+user.name1 + " & "+user.name2);
                    return;
                }
                System.out.println("Currently all tables are occupied, you are assegned with token no: "+ ++token);
                user.token = token;
                waitingList.offer(user);
            }
            default -> {
                System.out.println("Please select appropriate option");
            }
        }
    }
    public void RemoveCustomerFromTable(){
        System.out.println("Enter the table whose customer want's to leave: ");
        int no = HotelManager.sc.nextInt();
        tables[no].user=null;
        tables[no].isReserved=false;
        if(!waitingList.isEmpty()){
            tables[no].user = waitingList.poll();
            System.out.println("Table number is occupied by "+user.name1 );
        }
    }

}

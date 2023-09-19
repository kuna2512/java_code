/*public class interface_vehical {
    String Name="TVS";  // public+static+final
    int Speed=100;      // public+static+final

    void start();      // public+abstract
    void stop();       // public+abstract
    default void color ()
    {
        System.out.println("TVS Color is Red");
    }
    static void speed()
    {
        System.out.println("TVS Speed is 100 Km/H");
    }
}
class Customer implements vehical
{
    @Override
    public void start()
    {
        System.out.println("start(): insert key & press butoon "+Name);
    }
    @Override
    public void stop()
    {
        System.out.println("stop(): exit key");
    }

    public static void main(String[] args) {
        Customer c=new Customer();
        c.start();
        c.stop();
        vehical.speed();
        System.out.println(Speed);
}
    }
*/
//        inheritance

interface G {
    void Show();
}
interface FF
{
    void Disp();
}
class Multiple1 implements G,FF
{
    public void Show()
    {
        System.out.println("Interface G");
    }
    public void Disp()
    {
        System.out.println("Interface FF");
    }

    public static void main(String[] args) {
        Multiple1 m=new Multiple1();
        m.Show();
        m.Disp();
    }
}
// 5:58
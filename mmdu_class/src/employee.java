          // simple inheritance.
public class employee {
    float salary=80000;

}
class Programer extends employee
{
    int bonus=20000;

    public static void main(String[] args) {
        Programer P=new Programer();
        System.out.println("salary"+P.salary+P.bonus);
    }
}
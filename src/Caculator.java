public class Caculator
{
    static int result = 0;

    static int add(int num)

    {
        result += num;
        return result;
    }

    public static void main(String[] args)
    {
        Caculator cal = new Caculator();

        System.out.println(cal.add(3));
        System.out.println(cal.add(4));
        System.out.println(cal.add(5));
    }
}

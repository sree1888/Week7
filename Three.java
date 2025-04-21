abstract class patternprinter{
    abstract void  printpattern(int n);
    abstract void displaytitle();
    }
class Star extends patternprinter{
    public void printpattern(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                }
                System.out.println();
                }
                }
                public void displaytitle() {
                    System.out.println("Right angled triangle with stars");
                    }
                    }
class Number extends patternprinter{
    public void printpattern(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
                }
                System.out.println();
                }
                }
                public void displaytitle() {
                    System.out.println("Right angled triangle with numbers");
                }
}     
public class Three {
    public static void main(String[] args) {
        patternprinter p1 = new Star();
        p1.displaytitle();
        p1.printpattern(7);

        patternprinter p2 = new Number();
        p2.displaytitle();
        p2.printpattern(7);
    }
}


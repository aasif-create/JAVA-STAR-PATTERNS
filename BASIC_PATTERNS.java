
public class BASIC_PATTERNS
{
    public static void main(String[] args)
    {
        System.out.println("<--------------------------------------------------------------->");

        System.out.println("1. SOLID RECTANGLE(*)");
        for(int i=1;i<5;i++){
            for(int j =0;j<5;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("<--------------------------------------------------------------->");

        System.out.println("2. HOLLOW RECTANGLE(*)");
        int n=5;
        int m=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++) {
                if (i == 1 || j == 1 || i == n || j == m)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
                System.out.println();
        }

        System.out.println("<--------------------------------------------------------------->");

        System.out.println("3.LEFT HALF PYRAMID (*)");
        int a = 6;
        for(int i=1 ;i<a;i++)
        {
            for(int j=1 ; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("<--------------------------------------------------------------->");
        System.out.println("4.INVERTED HALF PYRAMID (*)");
        for(int i=n ;i>1;i--) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }

            System.out.println();
        

        }
        System.out.println("<--------------------------------------------------------------->");

        System.out.println("5.INVERTED HALF PYRAMID [ROTATED BY 180 DEGREE] (*)");
        int n1 =5;
        for(int i=1 ; i<n1 ;i++)
        {
            for(int j=1 ;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("<--------------------------------------------------------------->");

    }
}

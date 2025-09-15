public class Patterns {

    //Q1
    public void squareStar()
    {
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();
    }

    //Q2
    public void rightTriangleStar()
    {
        for(int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();
    }

    //Q3
    public void rightTriangleNums()
    {
        for(int i=0;i<5;i++) {
            int n = 1;
            for (int j = 0; j <= i; j++)
                System.out.print(n++);

            System.out.println();
        }
        System.out.println();
    }

    //Q4
    public void invertedRightTriangleStar()
    {
        for(int i=5;i>=0;i--) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println();
    }

    //Q5
    public void pyramidStar()
    {
        int r=5;
        for(int i=0;i<r;i++) {
            for (int j = 0; j<r-i; j++)
                System.out.print(" ");
            for (int j=0;j<2*i - 1;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    //Q6
    public void diamondStar()
    {
        int r=5;
        for(int i=0;i<r;i++) {
            for (int j = 0; j<r-i; j++)
                System.out.print(" ");
            for (int j=0;j<2*i - 1;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=r;i>=0;i--) {
            for (int j = 0; j<r-i; j++)
                System.out.print(" ");
            for (int j=0;j<2*i - 1;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    //Q7
    public void pascalsTriangle()
    {
        for (int i = 0; i < 5; i++) {
            int c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
        System.out.println();
    }

    //Q8
    public void pyramidNums()
    {
        int r=5;
        for(int i=0;i<r;i++) {
            for (int j = 0; j<r-i; j++)
                System.out.print(" ");
            for (int j=1;j<=i;j++)
                System.out.print(j);
            for(int j=i-1;j>0;j--)
                System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }

    //Q9
    public void hollowSquareStar()
    {
        int s = 5;
        for(int i=0;i<s;i++)
        {
            if(i == 0 || i == s-1) {
                for (int j = 0; j < s; j++)
                    System.out.print("*");
                System.out.println();
            }
            else
            {
                System.out.print("*");
                for(int j=1;j<s-1;j++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
        }
        System.out.println();
    }

    //Q10
    public void floydsTriangle()
    {
        int n = 1;
        for(int i=0;i<5;i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(n++);

            System.out.println();
        }
        System.out.println();
    }

    //Q11

    //Q12
    public void hollowPyramidStar()
    {
        int r=7;
        for(int i=0;i<r;i++) {
            for (int j = 0; j<r-i; j++)
                System.out.print(" ");
            int n = 2*i-1;
            for (int j=0;j<n;j++) {
                if(j == 0 || j == n-1 || i == r-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

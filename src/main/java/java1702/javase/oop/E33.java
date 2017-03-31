package java1702.javase.oop;

/**
 * Created by zhoumeng on
 * 2017/3/29.
 * 9:39.
 */
//打印出杨辉三角形（要求打印出10行)
class E33 {
    public E33() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        int i,j,n=8,l,r;
        int a[]=new int[9];
        System.out.println(1);
        for(i=1;i<=n;i++)
        { l=1;
            System.out.print(1+" ");
            for(j=1;j<=i;j++)
            { r=a[j];
                a[j]=l+r; /*每个数是上面两数之和*/
                l=r;
                System.out.print(a[j]+" ");
            }

            System.out.println();

        }

    }
}

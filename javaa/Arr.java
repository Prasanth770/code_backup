public class Arr {
    public static void main(String[] args) {
        int ar[] = {50,60,2,98,27,23,5};
        for(int i=0; i<ar.length;i++) {
            System.out.println("1.-------------");

            int a[] = new int[5];
            a[0]=10;
            a[1]=10;
            a[2]=20;
            a[3]=30;
            a[4]=40;

            for(int k=0; k<a.length;k++){
                System.out.println(a[k]);
            }

            System.out.println("-------------");
            System.out.println("-------------");

            for(int x:ar) {
                System.out.println(x);
            }

            System.out.println("-------------");
            System.out.println("-------------");

            int min = ar[0];
            for(int j=0;j<ar.length;j++) {
                if(min >ar[i]) {
                    min=ar[i];
                }
            }
            System.out.println("-------------");
            System.out.println("Min : "+ min);
            System.out.println("-------------");
        }
        
    }
    
}

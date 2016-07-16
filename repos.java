public class repct {
    public static void main(String[] args) {
        String s1,s2;
        int x,y,i,j,flag=0,n1,n2,m,n;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        char[] a=s1.toCharArray();
         x=s1.length();
        y=s2.length();
        char[] b=s2.toCharArray();
        for(i=0;i<x-1;i++)
        {
        for(j=i+1;j<x;j++)
        {
            
        
       if(a[i]==a[j]){
           n1=i;
           n2=j;
           
           
       for(i=0;i<y-1;i++)
        {
        for(j=i+1;j<y;j++)
        {
            
        
       if(b[i]==b[j]&&i==n1&&j==n2){
           System.out.println("true");
    flag=1;
           
           
       }
           
        
           }
    }
       }
    }}
    if(flag==0){
        System.out.println("false");
    }
   
       }}

        int i,j=0,count=0;
        int[] a=new int[5];
        int[] b=new int[5];
        char c;
        String[] s=new String[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
          a[i]=sc.nextInt();  
        }
        for(i=0;i<5;i++){
          s[i]=Integer.toBinaryString(a[i]);
        }
        System.out.println("dhbf");
        int len;
        for(i=0;i<s.length;i++)
        {count=0;
         len=s[i].length();
        for(j=0;j<len;j++){
            c=s[i].charAt(j);
            if(c=='1')
            {count++;
                b[i]=count;
               
            }}}
        
         for(i=0;i<b.length;i++)
         {int temp;
         for(j=i+1;j<b.length;j++)
         {
             if(b[i]<b[j])
             {
                 temp=a[i];
                 a[i]=a[j];
                 a[j]=temp;
               
             }
         }
         }
           for(i=0;i<5;i++){
        System.out.print(" "+a[i]);}
        
    }
}


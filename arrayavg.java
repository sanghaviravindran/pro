int[] a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
          a[i]=sc.nextInt();  
        }
        int i,j=1,k,sum = 0,avg,n1=0,n2=0,sec=0;
        while(j<4){
          sum=0;sec=0;n1=0;n2=0;  
       for(i=0;i<j;i++)
        {n1++;
                sum+=a[i];}
          for(k=i;k<5;k++)
            {n2++;
                sec=sec+a[k];}
               sum=sum/n1;
               sec=sec/n2;
               if(sum==sec)
               {
              for(i=0;i<j;i++)
        {
          System.out.print(""+a[i]);
        }
        for( k=i;k<5;k++)
        {
          System.out.print(""+a[k]);
        } }
       j++;

               }
                
            }
        }
    
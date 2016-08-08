public class MainClass {
   public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
      int Disks;
Disk=sc.nextInt();
      doTowers(Disks, 'A', 'B', 'C');
   }
   public static void doTowers(int topN, char from, char inter, char to) 
{
      if (top == 1){
         System.out.println("Disk 1 from "
         + from + " to " + to);
      }else {
         doTowers(top - 1, from, to, inter);
         System.out.println("Disk "
         + topN + " from " + from + " to " + to);
         doTowers(top - 1, inter, from, to);
      }
   }
}
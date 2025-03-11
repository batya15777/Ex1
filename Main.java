import java.util.Scanner;
public class Main {
    public static void main(String[] args) {



    }


public static void checkId() {
    Scanner scanner = new Scanner(System.in);
    while(true){
     int[] arr = new int[9];
     int[] helper = {1,2,1,2,1,2,1,2,1};
     System.out.println("please enter id: ");
     int id = scanner.nextInt();
     String strAsId = Integer.toString(id);
     int index = 8;
     for(int i = strAsId.length()-1; i>=0 ; i--)
     {
         arr[index--] = Integer.parseInt(strAsId.charAt(i)+"");
     }
     for(int i = 0; i<arr.length;i++)
     {
         helper[i]= arr[i]*helper[i];
         if(helper[i]>9)
         {
             helper[i] = helper[i]%10 +helper[i]/10;
         }
     }
     int sum = 0 ;
     for(int i= 0; i<helper.length;i++)
     {
         sum+= helper[i];
     }
     if(sum %10 !=0 )
     {
         System.out.println("false");
     }
     else
     {
         System.out.println("true");
     }



}



}
public static void wordle(){
    Scanner scanner = new Scanner(System.in);
    String[] words = {"Apple", "Bread", "Light", "Happy", "Dream",
                      "River", "Stone", "Music", "World", "Smile"};
    String res = "";
    String str = words[(int)((Math.random()*words.length))+1].toLowerCase();
    for(int i = 0; i< 6;i++)
    {
      res = "";
      System.out.println("please guess word: ");
      String guess = scanner.next().toLowerCase();
      if(guess.length() != 5)
      {
          i--;
      }
      else {
          if(str.equals(guess))
          {
              System.out.println("win!!");
              return;
          }
          for(int j =0;j<5;j++)
          {
              if(guess.charAt(j) == str.charAt(j))
              {
                  res += "G";
              }
              else if(str.contains(guess.charAt(j)+""))
              {
                  res += "Y";

              }
              else
              {
                  res += "_";
              }

          }
          System.out.println(res);
      }
    }
    System.out.println("the correct word is: "+str);










}




    }




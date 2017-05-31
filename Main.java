import java.util.Scanner;

class Main {

  public static void main(String arg[]){


int temp[][] = { 
{10, 10 ,10, 10, 10, 10, 10 ,10, 10, 10},
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 20, 20,  0, 20, 20, 20 ,10 ,10},
{10, 10, 20, 20, 20, 20, 20, 20 ,10 ,10},
{10, 10, 20,  0, 20, 20, 20, 20 ,10 ,10},
{20, 20, 30, 30, 40,  0, 30, 30 ,20, 20},
{20, 30, 30, 40, 50, 50, 40, 30, 30 ,20},
{30,  0, 50,  0, 50, 50,  0, 50 ,40, 30} };

  double max=0,price=0;

  int t = 0,j=0,i=0,field1=0,field2 = 0,choice=0;
  do
  {
  Scanner in = new Scanner(System.in);
    for(i=0;i<9;i++){
    for(j=0;j<10;j++){

  System.out.print(temp[i][j]+" ");
  }
  System.out.println("");
  }

  //Ask the user
  System.out.println("Choose a seat to book!");
  System.out.println("Which row would you like?");

  field1 = in.nextInt();
  if(field1>9)
  
  System.out.println("**It has to be from 1 through 9**");

  System.out.println("Which column would you like?");
  
  field2 = in.nextInt();
  if(field1>8)
  System.out.println("**It has to be from 1 through 8**");

  if(temp[field1][field2]==0)
  System.out.println("seat already booked");
  else
  {
  temp[field1][field2]=0;
  System.out.println("Seat is booked!");
  }

  System.out.println("Enter the price of seat to book:");

  price=in.nextInt();
  
    for(i=0;i<9;i++){
    for(j=0;j<10;j++){
  
    if(price==temp[i][j])
    System.out.print(temp[i][j]+" ");
    else
    System.out.print(" x ");
  }
    System.out.println("");
  }
  System.out.println("Enter the choice to continue");
  choice=in.nextInt();
  }
  while(choice==0);
}

}

/* a Gold batch number is a positive even that
   can be expressed as the sum of two odd prime number.*/
 import java.io.*;//importing io package
class Gold_Batch//class created
{
    public static void main(String args[])throws IOException//main method created
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //creating a single shared Bufferedreader to input in the terminal window
        System.out.println("Enter the last limit ");//printing statement to get the range
        int n1=Integer.parseInt(br.readLine());//Variable to store input
        System.out.println("Enter the number");//printing staement to get the number
        int n=Integer.parseInt(br.readLine());//Stroring the value in a variable
        int pos ,pos1;
        if(n>9&&n<n1)//checking whether the input is within the range
        {
            if(n%2==0)//checking whether the number is the input is odd no or not 
            {
                System.out.println("the combinations of "+n+" are");  
                for(int i=3;i<=(n/2);i+=2)//loop to check the number possibility
                {
                    pos=0;//variable initialized
                pos1=0;
                    for(int j=3;j<n;j+=2)//loop to get another position of the odd number
                    {
                        if(i+j==n)//checking whether the summation of the number is equal to the number provided by the user.
                        {
                            pos=i;
                            pos1=j;
                        }
                    }
                    int temp=0,temp1=0;//Declared and initialized variables
                    for(int j=2;j<pos;j++)//checking whether the number at the position is even or not.
                    {
                        if(pos%j==0)
                        {
                        temp=1;
                        break;
                    }
                }
                for(int j=2;j<pos1;j++)//checking whether the number at the position is even or not.
                    {
                        if(pos1%j==0)
                        {
                        temp1=1;
                        break;
                    }
                }
                if(temp==0&&temp1==0&&pos!=pos1)//checking whether the temporaary variable is increased or not
                {
                    if(pos>0)
                    {
                        System.out.println(pos+","+pos1);//printing the numbers
                    }
                }
            }
        }
           else 
            System.out.println("not a valid no");
        }
        else
        System.out.println("not a valid no");
    }//end of main()
}//end of class
        
                           

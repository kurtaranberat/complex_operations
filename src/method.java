import  java.util.Scanner;
public class method {

     static int plus(int a, int b){
        int result=a+b;
        System.out.println(result);
        return result;
     }
    static int minus (int a, int b ){
        int result=a-b;
        System.out.println(result);
        return result;
    }
    static  int  impact (int a,int b ){
        int result=a*b;
        System.out.println(result);
        return result;
    }
    static  double  divide (int a,int b ){
        double  result=a / b;
        System.out.println(result);
        return result;
    }
    static int  supernumerary (int a,int b ){
        int result=(int)(Math.pow(a,b));
        System.out.println(result);
        return result;
    }
    static  int factorial (int a ,int b ){
         int result=1;
        for (int i =1;i<=b;i++){
            result*=i;
        }
        return  result;
    }

    static int  modding (int a,int b ){
        return a % b;
               
    }
    static  int  domain_account(int a,int b ){
        int result=(a+b)*2 ;
        System.out.println("alan="+a*b+"    cevre="+result);
        return result;
    }




    public  static  void  main(String[]args){
      Scanner brt =new Scanner(System.in);
      String menü="1- toplama\n"
                 +"2- cıkarma \n"
                 +"3- carpama\n"
                 +"4- bolmeö\n"
                 +"5-üslü sayı \n"
                 +"6- mod \n"
                 +"7- faktoryel \n"
                 +"8- alan ve cevre bulma ";

      System.out.println(menü);
      System.out.print("bir islen sec:");
      int select=brt.nextInt();

      System.out.print( "birinci  sayı iriniz= ");
      int a = brt.nextInt();
      System.out.print( "ikinci  sayı iriniz= ");
      int b = brt.nextInt();


      switch (select) {
          case 1:
              plus(a,b);
              break;
          case 2:
              minus(a,b);
              break;
          case 3:
              impact(a,b);
              break;
          case 4:
              divide(a,b);
              break;
          case 5:
              supernumerary(a,b);
              break;
          case 6:
              modding(a,b );
              System.out.println(a%b);
              break;
          case 7:
              factorial(a ,b );
              break;
          case 8:
              domain_account(a,b);
              break;

          default:
      }

    }
}

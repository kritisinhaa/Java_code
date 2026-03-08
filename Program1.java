public class Program1 {
  //reversing the string
  public static void main(String[] args) {
    String str="hello hi bye welcome abc jspider";
    String rev="";
  
        for(int i=str.length()-1; i>=0;i--){
          rev=rev+str.charAt(i);
        }
        System.out.println(rev);
      }
      
    }
    

  
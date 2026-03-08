public class Program3 {
  //Anagram:two string having same character but in different position is know as Anagram
  static String sort(String s){
    char [] arr=s.toCharArray();
    
    for(int i=0; i<s.length();i++){
      for(int j=0;j<s.length();j++){
        if(arr[j]>arr[j+1])
        {
          char temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    return new String(arr);
  }
      

  public static void main(String[] args) {
    String s1="hello";
    String s2="elhlo";
    String ans1=sort(s1);
    String ans2=sort(s2);
    if(ans1.equals(ans2)){
      System.out.println("Anagram");
    }
    else{
      System.out.println("Not a Anagram");
    }

    
  }
  
}

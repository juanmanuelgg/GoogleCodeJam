//ASotelo
import java.util.*;
public class AlienLanguage {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int L=sc.nextInt(),D=sc.nextInt(),N=sc.nextInt();
    String w[]=new String[D];
    for (int d=0; d<D; d++) w[d]=sc.next();
    for (int n=0; n<N; n++) {
      String s=sc.next().replace('(','[').replace(')',']');
      int r=0;
      for (String c:w) if (java.util.regex.Pattern.matches(s,c)) r++;
      System.out.println("Case #"+(n+1)+": "+r);
    }
  }
}

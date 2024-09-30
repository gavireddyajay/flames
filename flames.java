import java.util.*;
public class flames{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		String str1=sin.nextLine();
		String str2=sin.nextLine();
		HashMap<Character,Integer> ar1=new HashMap<>();
		HashMap<Character,Integer> ar2=new HashMap<>();
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			if(ar1.containsKey(ch)){
				ar1.put(ch,ar1.get(ch)+1);
			}
			else{
				ar1.put(ch,1);
			}
		}
		for(int i=0;i<str2.length();i++){
			char ch=str2.charAt(i);
			if(ar2.containsKey(ch)){
				ar2.put(ch,ar2.get(ch)+1);
			}
			else{
				ar2.put(ch,1);
			}
		}
		char co='a';
		while(co<='z'){
			
			if((ar1.containsKey(co)&&ar1.get(co)>=1)&&(ar2.containsKey(co)&&ar2.get(co)>=1)){
				ar1.put(co,ar1.get(co)-1);
				ar2.put(co,ar2.get(co)-1);
			}
			else{
				co++;
			}
		}
		int count=0;
		for(int i=97;i<=122;i++){
			char ch=(char)i;
			if(ar1.containsKey(ch)){
				count=count+ar1.get(ch);
			}
			if(ar2.containsKey(ch)){
				count=count+ar2.get(ch);
			}
		}
		
		char[] array={'f','l','a','m','e','s'};
		int ans=6;
		int start=0;
		int nav=0;
		while(ans>1){
			if(start==6){
				start=0;
			}
			if(array[start]>='a'&&array[start]<='z'){
				nav++;
				if(nav==count){
					array[start]='$';
					ans=ans-1;
					nav=0;
				}
				start++;
			}
			else{
				start++;
			}
		}
		if(array[0]!='$'){
			System.out.print("friends");
		}
		else if(array[1]!='$'){
			System.out.print("lovers");
		}
		else if(array[2]!='$'){
			System.out.print("Attraction");
		}
		else if(array[3]!='$'){
			System.out.print("Marriage");
		}
		else if(array[4]!='$'){
			System.out.print("enemies");
		}
		else{
			System.out.print("Sister");
		}
			
	
				
			
	}
}
			
				
		
			

public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEF";
		String s1 = "CDEFAB";

		System.out.println(isRotated(s, s1));
	}
	public static boolean isRotated(String s1, String s2)
	{
		if(s1.length()!=s1.length())
			return false;
		
		boolean clock = true;
		boolean ac = true;
		
		int n = s1.length();
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)!=s2.charAt((i+2)%n)){
				clock = false;
			}
		}
			
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt((i+2)%n)!=s2.charAt(i))
			{
				ac = false;
			}
		}
		return (clock || ac);
		}
	}

 

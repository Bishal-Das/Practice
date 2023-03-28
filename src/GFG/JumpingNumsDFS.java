package GFG;

public class JumpingNumsDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 15;
		jump(x);
		
	}
		static void jump(long x) {
			for(long i = 1L; i <=9; i++)
				dfs(i, x);
		}
		
		static void dfs(long iter, long num)
		{
			if(iter > num)
				return;
			
			System.out.println(iter);
			 int lastdigit = (int)(iter%10);
			 
			 long next1 = iter*10 + lastdigit+1;  //11 12
			 long next2 = iter*10 + lastdigit-1;  //9
			 
			 if(lastdigit == 0)
				 dfs(next1, num);
			 
			 else if(lastdigit == 9)
				 dfs(next2, num);
			 
			 else {
				 dfs(next1, num);
				 dfs(next2, num);
			 } 
		}

	}

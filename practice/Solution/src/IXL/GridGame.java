package IXL;


	public class GridGame {
	    public int countMax(String[] steps) {
	        int m = Integer.MAX_VALUE, n = Integer.MAX_VALUE;
	        for (int i = 0; i < steps.length; i++) {
	            String[] step = steps[i].split(" ");
	            int x = Integer.parseInt(step[0]);
	            int y = Integer.parseInt(step[1]);
	            m = Math.min(m, x);
	            n = Math.min(n, y);
	        }
	        return m * n;
	    }
	    public static void main(String[] args) {
	        GridGame sol = new GridGame();
	        String[] steps = new String[] {"1 3", "2 4", "5 1"};
	        System.out.println(sol.countMax(steps));
	    }
	}

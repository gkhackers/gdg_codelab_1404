public class Fibonacci{
    public static void main(String []args){
	if(args.length == 0)
	{
		System.out.println("You should put a pramameter.");
		System.exit(0);
	}
        int start = Integer.parseInt(args[0]);
        long fib1 = 0;
        long fib2 = 1;
        for(int i = 0; i <= (start -2); i++) {
            long fib3 = fib1 + fib2;
            System.out.println("F"+ i + " = " + fib1 + ", F" + (i+1) + " = " + fib2 + ", F" + (i+2) + " =  " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}

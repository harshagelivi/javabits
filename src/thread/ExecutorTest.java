package thread;

import java.util.concurrent.Executor;

public class ExecutorTest
{
    public static void main(String[] args)
    {
        /*
         * we give all runnable to Executor. It takes care of scheduling them and running them
         */
        Executor executor = new myExecutor();
        executor.execute(new MyRunnable());
        

    }

}

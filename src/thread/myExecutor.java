package thread;

import java.util.concurrent.Executor;

public class myExecutor implements Executor
{

    
    
    @Override
    public void execute(Runnable r)
    {
        new Thread(r).start();
        
    }

}

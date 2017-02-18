/**
 * Created by 310124463 on 11/02/17.
 */
public class ScheduledServerStopper {

    private void releaseProcesses()
    {
        System.out.println("ScheduledServer.releaseProcesses");
    }

    private void destroy()
    {
        System.out.println("ScheduledServer.destroy");
    }

    private void destroySystemObjects()
    {
        System.out.println("ScheduledServer.destroySystemObjects");
    }

    private void shutDown()
    {
        System.out.println("ScheduledServer.shutDown");
    }

    public void stopServer()
    {
        releaseProcesses();
        destroy();
        destroySystemObjects();
        shutDown();
    }



}

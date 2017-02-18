

public class ScheduledServerStarter {

    private void startBooting()
    {
        System.out.println("ScheduledServer.startBooting");
    }

    private void readSystemConfigFile()
    {
        System.out.println("ScheduledServer.readSystemConfigFile");
    }

    private void intialize()
    {
        System.out.println("ScheduledServer.intialize");
    }

    private void createSystemObjects()
    {
        System.out.println("ScheduledServer.createSystemObjects");
    }

    public void startServer()
    {
        startBooting();

        readSystemConfigFile();

        intialize();

        createSystemObjects();
    }

}

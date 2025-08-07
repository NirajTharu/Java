interface Vechile {
    void start();
    void stop();
}

class Car implements Vechile{
    @Override
    public void start()
    {
        System.out.println("The car is started.s");
    }
    @Override
    public void stop()
    {
        System.out.println("The Car is stopped.");
    }
    
    class Bus implements Vechile{
    @Override
    public void start()
    {
        System.out.println("The Bus is started.s");
    }
    @Override
    public void stop()
    {
        System.out.println("The Bus is stopped.");
    }
}
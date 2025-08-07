class inheritance {
    public static void mian(String [] args)
    {
        System.out.println("");
    }
    
}
class Aminals{
 void Sound(){
    System.out.println("Eating Sound");
 }
}
{
    class Dog extends Aminals{
        @Override
        void sound()
        {
            System.out.println("Dog barks");
        }
        public static void mian(String [] args)
        {
            Dog d = new Dog();
            d.sound();
        }
    }
}

package Lesson01062023;

class Sample
{
    private static int i = 0;

    private Sample()
    {
    }

    public static Sample CreateInstance() throws Exception {
        if(i <3)
        {
            i++;
            return new Sample();
        }

        else
            throw new Exception("Can not create more then 5 instance of this class");
    }

}
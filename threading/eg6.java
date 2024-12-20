// created in year 2019
class cmn
{
private String something;
public void keep(String something)
{
this.something=something;
System.out.printf("I have kept %s, now I am tired, I am going to sleep\n",this.something);
try
{
Thread.sleep(1000);
}catch(InterruptedException ie)
{
System.out.println(ie);
}
System.out.printf("I have awake, now I am picking %s\n",this.something);
}
}
// created in year 2020
class Worker extends Thread
{
private String something;
private cmn someplace;
Worker(cmn someplace,String something)
{
this.someplace=someplace;
this.something=something;
start();
}
public void run()
{
synchronized(this.someplace)
{
this.someplace.keep(something);
}
}
}
class eg6psp
{
public static void main(String args[])
{
cmn commonPlace=new cmn();
Worker w1=new Worker(commonPlace,"Gold");
Worker w2=new Worker(commonPlace,"Diamond");
Worker w3=new Worker(commonPlace,"Silver");
}
}
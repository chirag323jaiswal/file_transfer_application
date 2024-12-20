class aaa implements Runnable
{
aaa()
{
Thread t=new Thread(this);
t.start(); // run will be loaded on thread
}
public void run()
{
for(int j=1001;j<1150;j++) {
System.out.print(j+" ");
}
}
}
class eg1psp
{
public static void main(String args[])
{
aaa a=new aaa();
for(int i=501;i<650;i++) {
System.out.print(i+" ");
}
}
}
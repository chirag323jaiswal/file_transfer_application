class aaa extends Thread
{
aaa()
{
start();
}
public void run()
{
for(int j=1001;j<1150;j++) {
System.out.print(j+" ");
}
}
}
class eg2psp
{
public static void main(String args[])
{
aaa a=new aaa();
for(int i=501;i<650;i++) {
System.out.print(i+" ");
}
}
}
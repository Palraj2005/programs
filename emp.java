package employee;
import java.io.*;
public class emp
{
public String na,ca;
public int id;
public double bpay;
public double nt,pf,lic,hra,det,da;
public emp(String a,String b,int c,double d)
{
na=a;
ca=b;
id=c;
bpay=d;
}
public void display()
{
System.out.println("name:"+na);
System.out.println("category:"+ca);
System.out.println("id:"+id);
System.out.println("basic pay:"+bpay);
da=bpay*5/100;
System.out.println("da:"+da);
lic=bpay*8/100;
System.out.println("lic:"+lic);
hra=bpay*10/100;
System.out.println("hra:"+hra);
pf=bpay*10/100;
System.out.println("pf:"+pf);
det=pf+lic;
System.out.println("det:"+det);
nt=bpay+hra-det;
System.out.println("netpay:"+nt);
}
}

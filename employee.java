import java.util.Scanner;

public class employee {
    String f_name,l_name;
    Integer id;
    String date;
    Integer experience;
    employee()
    {
        f_name=l_name=date="";
        id=0;
    }

    public void setdate(Integer day,Integer month,Integer year) {
        this.date = day+"/"+month+"/"+year;
        Integer x=0;
        if(month<=2&&day<=19)
        {
            x+=365*(2019-year)+(month-2)*30+day-19;
        }
        else if(day>=19)
        {
            x+=365*(2019-year-1)+(12-month+1)*30+day-19;
        }
        else
        {
            x+=365*(2019-year-1)+(12-month+2)*30+19-day;
        }
        experience=x;
    }

    public void setf_name(String f_name) {
        this.f_name = f_name;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public void setl_name(String l_name) {
        this.l_name = l_name;
    }

    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }
}
class hourlyemployee extends employee
{
    Double noh,payperhr;

    public void setNoh(Double noh) {
        this.noh = noh;
    }

    public void setPayperhr(Double payperhr) {
        this.payperhr = payperhr;
    }

    public Double getNoh() {
        return noh;
    }

    public Double getPayperhr() {
        return payperhr;
    }

   public Double grosssalary()
   {
       return noh*payperhr;
   }
}
class salariedemployee extends employee
{
    Double payperm,overtimepay,bonusam;

    public void setPayperm(Double payperm) {
        this.payperm = payperm;
    }

    public void setOvertimepay(Double overtimepay) {
        this.overtimepay = overtimepay;
    }

    public void setBonusam(Double bonusam) {
        this.bonusam = bonusam;
    }

    public Double getPayperm() {
        return payperm;
    }

    public Double getOvertimepay() {
        return overtimepay;
    }

    public Double getBonusam() {
        return bonusam;
    }
    public Double grosssalary()
    {
        return payperm+overtimepay+bonusam;
    }

}
class developer extends salariedemployee
{
    String depid,depdetails;

    developer(String depid) {
        this.depid = depid;
    }
    public void sort(developer d[],Integer n)
    {
        Integer i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(d[j].experience<d[j+1].experience)
                {
                    developer a=d[j];
                    d[j]=d[j+1];
                    d[j+1]=a;
                }
            }
        }
        System.out.println("the developer details in decreasing order of experience is:");
        System.out.println("sno. "+"firstname "+"lastname "+ "departmentid "+ " gross salary ");
        for(i=0;i<n;i++)
        {
            System.out.println(i+1+" "+d[i].f_name+" "+d[i].l_name+" "+d[i].depid+" "+d[i].grosssalary());
        }
    }
}
class researcher extends salariedemployee
{
    String depid,depdetails;

    researcher(String depid) {
        this.depid = depid;
    }
    public void sort(researcher d[],Integer n)
    {
        Integer i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(d[j].experience<d[j+1].experience)
                {
                    researcher a=d[j];
                    d[j]=d[j+1];
                    d[j+1]=a;
                }
            }
        }
        System.out.println("the researcher details in decreasing order of experience is:");
        System.out.println("sno. "+"firstname "+"lastname "+ "departmentid "+ " gross salary ");
        for(i=0;i<n;i++)
        {
            System.out.println(i+1+" "+d[i].f_name+" "+d[i].l_name+" "+d[i].depid+" "+d[i].grosssalary());
        }
    }
}
class executive extends salariedemployee
{
    String depid,depdetails;

    executive(String depid) {
        this.depid = depid;
    }

    public void sort(executive d[], Integer n)
    {
        Integer i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(d[j].experience<d[j+1].experience)
                {
                    executive a=d[j];
                    d[j]=d[j+1];
                    d[j+1]=a;
                }
            }
        }
        System.out.println("the executive details in decreasing order of experience is:");
        System.out.println("sno. "+"firstname "+"lastname "+ "departmentid "+ " gross salary ");
        for(i=0;i<n;i++)
        {
            System.out.println(i+1+" "+d[i].f_name+" "+d[i].l_name+" "+d[i].depid+" "+d[i].grosssalary());
        }
    }
}
class test
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Integer n,d_c=0,r_c=0,e_c=0;
        Double dd=0.0,rr=0.0,ee=0.0;
        System.out.println("enter number of employee");
        n=sc.nextInt();
        sc.nextLine();
        Integer i;
        salariedemployee [] s=new salariedemployee[n];
        salariedemployee[] xx=new salariedemployee[n];
        String[] ids=new String[n];
         for(i=0;i<n;i++)
        {
            String id;
            sc.nextLine();
            System.out.println("employee "+(i+1)+ " details");
            System.out.println("enter the department of employee (1 ,2 or 3):");
            id=sc.nextLine();
            ids[i]=id;
            if(id=="1")
            {
                s[i]=new developer(id);
                //dev[d_c]=new developer(id);
                d_c++;
            }
            else if(id=="2")
            {
                s[i]=new researcher(id);
                //re[r_c]=new researcher(id);
                r_c++;
            }
            else
            {
                s[i]=new executive(id);
                //ex[e_c]=new executive(id);
                e_c++;
            }


        System.out.println("enter first name:");
        s[i].setf_name(sc.nextLine());
        System.out.println("enter last name");
        s[i].setl_name(sc.nextLine());
        System.out.println("enter paypermonth");
        s[i].setPayperm(sc.nextDouble());
        System.out.println("enter overtimepay");
        s[i].setOvertimepay(sc.nextDouble());
        System.out.println("enter bonus");
        s[i].setBonusam(sc.nextDouble());
        System.out.println("enter day, month and year of joining");
        Integer day,month,year;
        day=sc.nextInt();month=sc.nextInt();year=sc.nextInt();
        s[i].setdate(day,month,year);
        System.out.println("enter employee id");
        s[i].setid(sc.nextInt());
        if(id=="1")
        {
            dd+=s[i].grosssalary();
        }
        else if(id=="2")
        {
            rr+=s[i].grosssalary();
        }
        else
        {
            ee+=s[i].grosssalary();
        }

    }
        dd=dd/d_c;ee=ee/e_c;rr=rr/r_c;
        Double x=ee;
        Integer idd=3;
        if(dd>ee){x=dd; idd=1;}
        if(x<rr){x=rr;idd=2;}
        //salariedemployee[] k=new salariedemployee[n];
        Integer ff=0;
        if(idd==1)
        {
            System.out.println("developers have maximum avg gross salary of "+dd);

           for(i=0;i<n;i++)
           {
               if(ids[i]=="1")
               {
                   xx[ff]=new developer("1");
                   xx[ff]=s[i];
                   ff++;
               }
           }
           ff=d_c;
        }
        else if(idd==2)
        {
            System.out.println("researchers have maximum avg gross salary of "+rr);

            for(i=0;i<n;i++)
            {
                if(ids[i]=="2")
                {
                    xx[ff]=new researcher("2");
                    xx[ff]=s[i];
                    ff++;
                }
            }
            ff=r_c;
        }
        else
        {
            System.out.println("executives have maximum avg gross salary of "+ee);

            for(i=0;i<n;i++)
            {
                if(ids[i]=="3")
                {
                    xx[ff]=new executive("3");
                    xx[ff]=s[i];
                    ff++;
                }
            }
            ff=r_c;
        }
        ff=1;
        Integer j;
        for(i=0;i<ff;i++)
        {
            for(j=0;j<i-1;j++)
            {
                if(xx[j].grosssalary()>xx[j+1].grosssalary()){
                salariedemployee mm=xx[j];
                xx[j]=xx[j+1];
                xx[j+1]=mm;
            }}
        }
        System.out.println("the employess details in this department is");
        for(i=0;i<1;i++)
        {
            System.out.println("firstname:"+s[2].f_name+" lastname:"+s[2].l_name+" department id"+3+" gross salary"+ s[i].grosssalary());
        }
        System.out.println("each employee salary after 10% bonus is");
        for(i=0;i<n;i++)
        {
            System.out.println("first name: "+s[i].f_name+ " yearly salary "+(0.1*(s[i].grosssalary())+s[i].grosssalary())*12);
        }
    }

}
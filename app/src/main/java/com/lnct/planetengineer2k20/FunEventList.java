package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class FunEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public FunEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
        this.title=title;
        this.icon=icon;
        this.orginization=orginization;
        this.fees=fees;
        this.venue=venue;
        this.date=date;
        this.cname1=cname1;
        this.cno1=cno1;
        this.cname2=cname2;
        this.cno2=cno2;
        this.scname1=scname1;
        this.sno1=sno1;
        this.scname2=scname2;
        this.sno2=sno2;
    }
    public String getTitle(){return title;}
    public int getIcon(){return icon;}
    public String getOrginization(){return orginization;}
    public String getFees(){return fees;}
    public String getVenue(){return  venue;}
    public String getDate(){return date; }
    public String getCname1(){return cname1;}
    public String getCno1(){return cno1;}
    public String getCname2(){return cname2;}
    public String getCno2(){return cno2;}
    public String getScname1(){return scname1;}
    public String getSno1(){return sno1;}
    public String getScname2(){return scname2;}
    public String getSno2(){return sno2;}
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setOrginization(String orginization) {
        this.orginization = orginization;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public void setVenue(String venue){this.venue=venue;}
    public void  setDate(String date){this.date=date;}
    public void setCname1(String cname1) {
        this.cname1 = cname1;
    }

    public void setCno1(String cno1) {
        this.cno1 = cno1;
    }

    public void setCname2(String cname2) {
        this.cname2 = cname2;
    }

    public void setCno2(String cno2) {
        this.cno2 = cno2;
    }

    public void setScname1(String scname1) {
        this.scname1 = scname1;

    }
    public void setSno1(String sno1) {
        this.sno1=sno1;
    }
    public void setScname2(String scname2){
        this.scname2=scname2;
    }

    public void setSno2(String sno2) {
        this.sno2=sno2;
    }


    public static ArrayList<FunEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new FunEventList("Welcome To Hogwarts",R.drawable.hogwart,"LNCT IT","30/person and 50/2","In Front of LNCT IT Department","04,05,06-03-2020","Prof.Akshay Jadhav","9424446307","Prof. Huma Gupta","9098502329","Shivam Bhawsar","6265409694","Vaishali Anand","9425166439"));
        arrayList.add(new FunEventList("Musical Chair",R.drawable.mchair,"Maths LNCTS","50/person","Open Theatre in Front CSE Department","04-03-2020","Dr.Sanjeet Kumar","9893157058","Dr. Bhupendra Tripathi","9827745024","Abhishek Sharma","8109280363","Shriharsh Mohril","8226094997"));
        arrayList.add(new FunEventList("Snakes and Ladders",R.drawable.snake,"NSS LNCT","50/person","In Front of IT Block(Left Side)","04-03-2020, 05-03-2020, 06-03-2020","Prof. Naveen Asati","9301196690","Prof. Nand Kishore Meena ","9893470677","Muskan Soni","7440655301","Reshu Dwivedi","9340418810"));
        arrayList.add(new FunEventList("Matki phod",R.drawable.matki,"JNCT","50/person","JNCT Campus","05,06-03-2020","Prof.Amit Sawaskade","9993648909","Prof.Prachi Parashar","9770124543","Prachi Rajak","6261946262","Haeshita Goswami","6264538413"));
        arrayList.add(new FunEventList("Hollywood/Bollwood Cafe",R.drawable.holyboly,"LNCT Chemistry","50/person,100/Team","LNCT (G-10)","05-03-2020","Dr.Pratibha Sharma","8223990710","Dr.Arti Malviya","9826867920","Ayan Agrawal","9340575526","Satyam Singh","9122569887"));
        arrayList.add(new FunEventList("Move Your Body",R.drawable.move,"LNCTS CSE","50/person","Near Management parking Space LNCT","05-03-2020","Mr.Manoj Kumar","8269576451","Mr.Gaurav Nayak","9753681199","Swati Sahu","9617826042","Aniket Jain","8989623455"));
        arrayList.add(new FunEventList("Ludo King",R.drawable.ludo,"LNCTS CSE","100/Team","Open Threater in front of LNCT CES Department","04,05,06-03-2020","Mr.Pragati","8269277449","Mr.Dipak Singh Tomar","9926328891","Hemant Soni","8107479136","Jaswinder Kaur","6394931855"));

        return arrayList;
    }
}


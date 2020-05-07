package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class SportsEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public SportsEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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


    public static ArrayList<SportsEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new SportsEventList("Sling Shot",R.drawable.sling,"JNCT","50/person","JNCT","05,06-03-2020","Mr. Sameer Purohit","9229210190","Ms.Megha Purohit","8962155318","Prashuk","7804806642","Kisan ","8827142266"));
        arrayList.add(new SportsEventList("Get Sweat Go",R.drawable.sweat,"LNCT EC","50/person","In Front of EC Dept. LNCT","05,06-03-2020","Mr.Prashat Chaturvedi","8109528276","Mr. Arun Patel","9993419156","Nainy Chowksey","9425193808","Nisha Thakur","9131299768"));
        arrayList.add(new SportsEventList("InCrick(Indoor Cricket)",R.drawable.cricket,"LNCT EX","300/Team","LNCTE-Seminar Hall","05,06-03-2020","Prof.Manvendra Singh","9993928077","Prof.Kamlesh Vishwakarma","909853919","Alok Kumar","8678884862","Dinesh Kumar","7070289974"));
        arrayList.add(new SportsEventList("Hurdle and Hustle(Obstacle Race)",R.drawable.hurdle,"NCC","100/person","Central Libraray Ground","04,05-03-2020","Dr.Yogesh Singh","7869950404","NA","NA","Somil Chourasiya","9240206251","Aman Parashar","9827591150"));
        arrayList.add(new SportsEventList("Pittu",R.drawable.pittu,"JNCT","50/person","JNCT","05,06-03-2020","Dr. V.K. Chaturvedi","7000714463","Prof.Shilpa Tripathi","7000295722","Ayaan Ali","7697556512","Dushyant","8319899231"));
        arrayList.add(new SportsEventList("Gilly Danda",R.drawable.gilly,"JNCT","50/person,200/Team","JNCT","05,06-03-2020","Dr.Vandana Singh","9329273180","Mr.Vijay Singh Pawar","9993902028","Ritesh Kumar","8539896669","Akarsh Singh","9691069292"));
        arrayList.add(new SportsEventList("Tug of War",R.drawable.tugofwar,"JNCT","50/person","JNCT","05,06-03-2020","Prof.Mohit Pandya","9826652849","Prof.Ekta","9713273509","Abhishek Singh","6264435656","Aniket Digarse","8827780760"));
        arrayList.add(new SportsEventList("Dubba I Spy",R.drawable.kick,"JNCT","50/person","JNCT","05,06-03-2020","Prof.Amit Kumar","9935331234","Dr.Rishu Upadhyaya","8319120717","Kishan","8863979048","Manish Ranjan","9122385387"));
        arrayList.add(new SportsEventList("Slow Bike Race",R.drawable.slowbike,"LNCTS ME","50","LNCTE Bus Ground","04,05-03-2020","Mr.Haider Naqvi","9039252419","Mr. Sushil Chourey","9074151161","Rehan Fazal","7004176524","Mohd Anul Khan","8423479634"));
        return arrayList;
    }
}



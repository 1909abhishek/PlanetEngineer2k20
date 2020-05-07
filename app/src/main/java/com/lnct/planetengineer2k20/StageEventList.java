package com.lnct.planetengineer2k20;
import java.util.ArrayList;
public class StageEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public StageEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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
     public static ArrayList<StageEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new StageEventList("AD Mad Show",R.drawable.admad,"LNCT Pharmacy","50/person","LNCP Seminar Hall","04-03-2020","Mr.Shivikant Shukla","9039448850","Ms.Fauziya Husaini","6392251097","Rishita Dubey","7389239679","Pranav Pandey","6205841335"));
        arrayList.add(new StageEventList("Nukkad Natak",R.drawable.nukkadnatak,"NSS","500","LNCTE Garden","05-03-2020","Prof.Nand Kishore Meena","9893470677","Prof.Naveen Asati","9301196690","Tushar Rokde","9424747388","Swastik Baithalu","9669511980"));
        arrayList.add(new StageEventList("Mono Act",R.drawable.nukkad,"LNCTU Agriculture","50/person","LNCTE Auditorium","06-03-2020","Mrs.Namita Singh","8982011432","Mr.Rohit Mehra","8085166447","Neetesh Bhargava","8519056567","Ayushi Shah","9131858376"));
        arrayList.add(new StageEventList("Tamasha(Skit)",R.drawable.skit,"Chemical LNCT","300","LNCTS T-28 New Block","04-03-2020","Prof.Sarvesh","9674084844","NA","NA","Rishika","9479309346","Sanidhya","9479918255"));
        arrayList.add(new StageEventList("Youth House(Chhatr Sansad)",R.drawable.youth,"LNCTU Law Department","50/person","NA","NA","NA","NA","NA","NA","NA","NA","NA","NA"));
        arrayList.add(new StageEventList("Game of Attires Reloaded(Fashion Show)",R.drawable.attire,"LNCTS EC","300/1,500/2","LNCT Auditorium","06-03-2020","Dr.Soheb Munir","8109222591","Prof.Shashilata Rawat","8349007343","Ariba Mev","9131766700","Shubham Kumar","7273879716"));
        return arrayList;
    }
}



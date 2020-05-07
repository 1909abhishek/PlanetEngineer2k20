package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class FoodEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public FoodEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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


    public static ArrayList<FoodEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new FoodEventList("Yum Yum Kitchen",R.drawable.cook,"LNCT EC","200","In Front of LNCT CSE Department","04-03-2020","Dr.Bharti Gupta","9425607515","Prof.Sunny Jain","7987797814","Kratika Pathak","7509552722","Ayush Jain","7000623709"));
        arrayList.add(new FoodEventList("LNCT Haat",R.drawable.haat,"Planet Core Team","500/ 3 day","Workshop Ground","04-03-2020,05-03-2020, 06-03-2020","NA","NA","NA","NA","Prince Raj","9504700747","Harshvardhan Singh","8827434377"));

        return arrayList;
    }
}



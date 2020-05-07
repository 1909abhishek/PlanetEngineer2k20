package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class MicEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public MicEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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


    public static ArrayList<MicEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new MicEventList("Kavi Samelan",R.drawable.kavi,"LNCT Khayal Club","50/person","LNCTS Seminar Hall S-21","04-03-2020","Dr.Amit Shrivastav","9826029451","Prof.G Divya Anushree","8818800593","Shubham Jaat","7611146026","Kriti Pare","8109112507"));
        arrayList.add(new MicEventList("Beat Boxing",R.drawable.beat,"LNCT Music Club","50/person","LNCTE Auditorium","06-03-2020","NA","NA","NA","NA","NA","NA","NA","NA"));
        arrayList.add(new MicEventList("Sur Taal(Singing)",R.drawable.sur,"LNCT Music Club","150/person and 200/duet","LNCTE Auditorium","05,06-03-2020","Mr.Vikas Kumar","9826961805","Ms.Sudeshna Ghosh","9893365922","Kaushiki Kriti","7634875534","Jaya Dwivedi","9675878736"));
        arrayList.add(new MicEventList("Laughter Lounge(Standup Comedy)",R.drawable.comedy,"Maths LNCT","50/person","Seminar Hall","06-03-2020","Dr.RituRaj Nighojkar","9981395802","Dr.Roshni Sharma","9522124140","Shikha Mishra","9266058944","Shubham Kumar","7470507499"));
        arrayList.add(new MicEventList("Sakshatkar(Mock Interview)",R.drawable.inte,"T & P Deparment","50/person","T & P Deparment","04-03-2020","Prof.Rohit Pathak","8839413842","NA","NA","Ashish Rajpoot","9755335139","Sharish Khan","8085215770"));
        arrayList.add(new MicEventList("Once upon a time(Story Telling)",R.drawable.once,"Planet Core Team","50/person","LNCT F-17","06-03-2020","Dr.Amit Shrivastava","9826029451","Mr.Rajeev Gupta","9340323328","Shriya Bansal","9111355474","Qeenjal Soni","9179088028"));
        arrayList.add(new MicEventList("War of Words(Debate)",R.drawable.warofwords,"Humanities Dept. LNCT","100/person","LNCT Seminar Hall","05-03-2020","Dr.Abhilasha Singh","7804083646","Prof.Anupama Sinha","9165288122","Gunansha Uprit","8319597541","Bishwajit Kumar","9798661115"));
        arrayList.add(new MicEventList("Extemporaneous(Extempore)",R.drawable.extempore,"Orators Club","50/person","Seminar Hall LNCT","06-03-2020","Dr.Brijesh Verma","9977071725","Dr. Deepika Agrawal","9981595209","Pratham Jain","9926714321","Shivansh Raguwanshi","9575850465"));


        return arrayList;
    }
}



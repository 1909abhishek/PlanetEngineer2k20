package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class BrainEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public BrainEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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


    public static ArrayList<BrainEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new BrainEventList("Meme It(Meme Creation)",R.drawable.meme,"LNCTS CE","50/person","LNCTS old block ground","05-03-2020","Prof.Juhi Nigam","9399260140","Prof.Ajay Kumar Chaudhari","8871438206","Shubham Serva","7000961429","Kajol","8789787435"));
        arrayList.add(new BrainEventList("Technical Quiz",R.drawable.techquiz,"LNCT EX","50","LNCT G-10,F-10","05,06-03-2020","Prof.Vivek Rai","9630418148","Dr.Syed Uvaid Ullah","7225829290","Ankul Kumar Singh","6266763002","Amanpreet Singh","7974071282"));
        arrayList.add(new BrainEventList("100rs Venture",R.drawable.venture,"LNCT IT","500","Workshop Ground","04,05,06-03-2020","Mr.Kamlesh Chandravanshi","9009217763","Ms.Pushpendra Tomar","9981321423","Aakarsh Singh Bais","7089492941","Ritu Jain","7000039082"));
        arrayList.add(new BrainEventList("Robotics",R.drawable.robotics,"LNCT EE","250/solo and 500/Team","CME Indoor Ground","05,06-03-2020","Mr.Rohit Verma","9755505072","Mr.Prakhar singh Bhadoria","73542266684","Sanjeev Kumar Patel","9285256475","Rahul Kumar","8540863561"));
        arrayList.add(new BrainEventList("Quizophile(General Quiz)",R.drawable.genequiz,"LNCTS Human.","50/person and 80/pair","LNCT G-10","04-03-2020","Dr. Pooja Saxena","6264687073","NA","NA","Sahil Singh","8770947164","Rohit Mangwani","8109275400"));
        arrayList.add(new BrainEventList("Innovation Idea Presentation",R.drawable.inovative,"Hackhathon Club","50/person","LNCT Comp.Lab G-01","05-03-2020","Mr.Jay Prakash Maurya","7354549227","Ms. Tripti Saxena","9753485817","Chinmay Maheshwari","9755125157","Abhay Tiwari","7905999153"));
        arrayList.add(new BrainEventList("Paper Presentation",R.drawable.paper,"IIC cell","50/person","LNCT T-8","04-03-2020","Dr.Vineet Richhariya","9926351836","Prof.Jitendra Raghuwanshi","9300751991","Kumar Aman","7667164301","Pranjal Sharma","9131386629"));
        arrayList.add(new BrainEventList("SherLocked",R.drawable.sherlock,"LNCT ME","50/person,100/Team","Central workshop","05-03-2020","Mr.Anil Chourasia","9074601481","NA","NA","Dhruv Khanduri","8962942170","Syed Husnain Ali","7974554768"));

        return arrayList;
    }
}



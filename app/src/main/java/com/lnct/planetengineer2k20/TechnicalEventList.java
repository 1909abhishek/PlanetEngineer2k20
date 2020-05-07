package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class TechnicalEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public TechnicalEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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


    public static ArrayList<TechnicalEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new TechnicalEventList("Cyber Security(Workshop)",R.drawable.cyber,"LNCT MCA","200","LNCTE-120","05-03-2020","Dr.Kavita Kanathey","9406541830","Prof.Vishwa Gupta","9826223649","Rahul Dharmani","7415770378","Akansha Gupta","7224040422"));
        arrayList.add(new TechnicalEventList("Digital Marketing(Workshop)",R.drawable.digital,"LNCT MBA","200/person","LNCTE-120","04-03-2020","Dr.Sapna Awasthi","9827635668","Prof.Abhishek Jain","9893322097","Shubham Chourasiya","8085359913","Kajal Samadhiya","7770978949"));
        arrayList.add(new TechnicalEventList("Code Vita",R.drawable.codevita,"LNCTE CSE","100/1,150/2","LNCTE-119","04-03-2020","Prashant Shrivastava","9981428813","Prof.Diksha Kureshaniya","8962237772","Divyam Singh","9131501373","Gaurav Sinha","6261233725"));
        arrayList.add(new TechnicalEventList("LAN Gaming",R.drawable.langaming,"LNCTE CSE","50/person","LNCTE-119","05,06-03-2020","Mr.Harendra Singh","8518852274","Mr.Ashish Chaturvedi","9753657456","Aman Kumar","9801312044","Aaryan Chaubey","738911005"));
        arrayList.add(new TechnicalEventList("IOT Workshop",R.drawable.iot,"LNCT CSE","200","LNCT G-01","04,05,06-03-2020","Dr.Sadhna K Mishra","9826948116","Prof.Neha Tiwari","9630620945","Prakhar Patel","9529641006","Nishad Patidar","8718933044"));
        arrayList.add(new TechnicalEventList("CAD Designing",R.drawable.cad,"LNCT CE","50/person","Old MCA block Lab","04-03-2020","Prof.Kapil Mandloi","9584522747","Dr.DK Jain","9425609435","Ishwar Mahore","6266871101","Santosh Sahu","9755513612"));
        arrayList.add(new TechnicalEventList("Mr.AutoMobile",R.drawable.auto,"LNCT Mechanical","50","LNCT F-17","04-03-2020","Prof.Sachin Kumar Nikam","9977014343","Prof.Anil Chourasia","9074601481","Ayush Singh","9111498841","Ishu Singh","8529897001"));
        arrayList.add(new TechnicalEventList("Circuitrix",R.drawable.circuit,"LNCT EX","150/person,200/Double","CME T-04(A Electrical WORK SHOP)","05,06-03-2020","MR.Vikas Kumar","9826961805","NA","NA","Ashish Kumar","8578094853","Pradeep Mehto","7979017528"));
        arrayList.add(new TechnicalEventList("Workshop On FILE HANDLING",R.drawable.filehand,"LNCT EC","100","COMPUTER LAB LNCT G-14","05,06-03-2020","Dr.Shravan Sable","9424418451","Mr. Sourabh Pandey","9893546881","Aadarsh Kumar","7781815738","Aaditya Kumar","8539921860"));

        return arrayList;
    }
}



package com.lnct.planetengineer2k20;

import java.util.ArrayList;

public class ColorEventList {
    String title,cname1,cname2,orginization,fees,cno1,cno2,venue,date,scname1,scname2,sno1,sno2 ;
    int icon;
    public ColorEventList(String title, int icon, String orginization, String fees,String venue,String date, String cname1, String cno1, String cname2, String cno2,String scname1,String sno1,String scname2,String sno2){
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


    public static ArrayList<ColorEventList> getData(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(new ColorEventList("Chitran(Photography)",R.drawable.photography,"Media Centre","50/person","LNCT Auditorium Lobby","04,05,06-03-2020","Mr.Maninder Singh","8770837309","Ms. Sakshi Rashtogi","8305858382","Abhishek Anand","7979727452","Paras Thakur ","9407383910"));
        arrayList.add(new ColorEventList("Splash(Wall Painting)",R.drawable.wall,"Architecture Dept. LNCTU","100/person","Hostel Wall","04-03-2020","Dr.Sheetal Sharma","8103555591","Prof. Ankita Shrivasta","999758578","Ahmed Rais","7024651722","Anshul Sagoria","8770263881"));
        arrayList.add(new ColorEventList("Rang Srijan(Rangoli)",R.drawable.rangoli,"Architecture Dept. LNCTU","50/person","MCA Old Block F-06","05-03-2020","Mr.Sudhir Chandel","9589883231","Dr.Sheetal Sharma","810355591","Isha Bansal","9685799338","Shourya Jain","9926033261"));
        arrayList.add(new ColorEventList("Mehendi",R.drawable.mehandi,"Architecture Dept. LNCTU","50","MCA old block S-06","05-03-2020","Ankita Shrivastava","9993758578","Shashi Saxena","9926271413","Mansi ","9993837238","Vidhi","8966820698"));
        arrayList.add(new ColorEventList("Mohe Rang De(Face Painting)",R.drawable.face,"Architecture Dept. LNCTU","50/person","MCA old block S-01","05-03-2020","Mr.Sudhir Chandel","9589889231","Mr.Rachit Saxena","9098914189","Ram Biswas Sharma","79869349881","Ruqaiya Begam","6260789126"));
        arrayList.add(new ColorEventList("Nail Art",R.drawable.nailart,"Architecture Dept. LNCTU","50/person","MCA Old Block S-06","05-03-2020","Dr.Sheetal Sharma","8103555591","Shashi Saxena","9926271413","Vanshika","7024539187","Sumiran","8839873890"));
        arrayList.add(new ColorEventList("Shine The Sheet(Poster Making)",R.drawable.poster,"Architecture Dept. LNCTU","50","LNCT S-17","06-03-2020","Mr.Shashi Saxena","9926271413","Mr.Rachit Saxena","9098914189","Chavi Dingra","8989544829","Harshvardhan","9691576663"));
        arrayList.add(new ColorEventList("Shilp Kari(Clay Modelling)" ,R.drawable.shilp,"Architecture Dept. LNCTU","50/person","MCA old block F-06","06-03-2020","Mr.Shashi Saxena","9926271413","Mr.Anant Verma","9074302825","Vivek Chaturvedi","9955595093","Anahita Joshi","8305591121"));
        arrayList.add(new ColorEventList("Short Flim Making" ,R.drawable.filmmaking,"LNCT Physics","100/person","LNCT F-17","05-03-2020","Dr.Sangeeta Kapur","9424410576","Dr.Touseef Pera","7006354245","Aman Kumar","8295334621","Sumit Kumar","9473239356"));

        return arrayList;
    }
}



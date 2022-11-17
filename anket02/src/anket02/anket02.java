package anket02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class anket02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner (System.in);
		 
		 HashMap hashmap=new HashMap();
		 int dongu;
		 int[] cevaplar= {0,0,0,0,0};
		 ArrayList <Integer> rs= new ArrayList();
		 int i=0;
		 int kullanici=0;
		
		 
		  while(1==1)
		  {  kullanici++;
			  System.out.println("Hogeldiniz "+ kullanici+ ". kullanici!");
			  
		      System.out.println("cevre kirliliğine verdiğiniz önemi 1-5 arası puanlayınız...");
			  int cevap= scan.nextInt();
			  if(0<=cevap && cevap<=5) {
			  cevaplar[0]=cevaplar[0]+cevap;
			  }
			   else {System.out.println("lutfen uygun değerler arasında oylayınız.");
			  cevap= scan.nextInt();
			  cevaplar[0]=cevaplar[0]+cevap;
			  }
			  rs.add(cevap);
			  
			  System.out.println("egitime verdiğiniz önemi 1-5 arası puanlayınız...");
			  int cevap1= scan.nextInt();
			  if(0<=cevap && cevap<=5) {
			  cevaplar[1]=cevaplar[1]+cevap1;
			  }
			  else {System.out.println("lutfen uygun değerler arasında oylayınız.");
			  cevap1= scan.nextInt();
			  cevaplar[1]=cevaplar[1]+cevap1;}
			  rs.add(cevap1);
			  
			  System.out.println("gocmen problemine verdiğiniz önemi 1-5 arası puanlayınız...");
			  int cevap2= scan.nextInt();
			  if(0<=cevap && cevap<=5) {
			  cevaplar[2]=cevaplar[2]+cevap2;
			  }
			  else {System.out.println("lutfen uygun değerler arasında oylayınız.");
			  cevap2= scan.nextInt();
			  cevaplar[2]=cevaplar[2]+cevap2;}
			  rs.add(cevap2);
			  
			  System.out.println("ekonomiye verdiğiniz önemi 1-5 arası puanlayınız...");
			  int cevap3= scan.nextInt();
			  if(0<=cevap && cevap<=5) {
			  cevaplar[3]=cevaplar[3]+cevap3;
			  }
			  else {System.out.println("lutfen uygun değerler arasında oylayınız.");
              cevap3= scan.nextInt();
			  cevaplar[3]=cevaplar[3]+cevap3;}
			  rs.add(cevap3);
			  
			  System.out.println("siyasete verdiğiniz önemi 1-5 arası puanlayınız...");
			  int cevap4= scan.nextInt();
			  if(0<=cevap && cevap<=5) {
			  cevaplar[4]=cevaplar[4]+cevap4;
			  }
			  else {System.out.println("lutfen uygun değerler arasında oylayınız.");
              cevap4= scan.nextInt();
			  cevaplar[4]=cevaplar[4]+cevap4;}
			  rs.add(cevap4);
			
			  
			  System.out.println("devam etmek istiyorsanız bire basın...");
			  dongu=scan.nextInt();
			  
			  if(dongu!=1) {
				  break;
			  }
			 
		      } 
	
		  
		  
		  hashmap.put("birinci",cevaplar[0]);
		  hashmap.put("ikinci",cevaplar[1]);
		  hashmap.put("ucuncu",cevaplar[2]);
		  hashmap.put("dorduncu",cevaplar[3]);
		  hashmap.put("besinci",cevaplar[4]);
		    
		      for (int j = 0; j <kullanici * 5; j += 5) {
				System.out.printf("%d . kisi  |   %d    |   %d    |  %d   |   %d    |   %d     |",j/5+1 ,rs.get(j),rs.get(j + 1), rs.get(j + 2), rs.get(j + 3), rs.get(j + 4));
				System.out.println();}

		       System.out.println("Toplam oy:    "+ hashmap.get("birinci")+ "        "+ hashmap.get("ikinci")+"        "+ hashmap.get("ucuncu")+"      "+hashmap.get("dorduncu")+"        "+hashmap.get("besinci"));
		 
		     
		      if(cevaplar[0]>=cevaplar[1]&& cevaplar[0]>=cevaplar[2]&& cevaplar[0]>=cevaplar[3]&& cevaplar[0]>=cevaplar[4]) {
		    	 System.out.println("en onem verilen sorun: cevre kirliligidir.");
		      }
		      else if(cevaplar[1]>=cevaplar[0]&& cevaplar[1]>=cevaplar[2]&& cevaplar[1]>=cevaplar[3]&& cevaplar[1]>=cevaplar[4]) {
			    	 System.out.println("en onem verilen sorun: egitim.");
			      }
		      else if(cevaplar[2]>=cevaplar[1]&& cevaplar[2]>=cevaplar[0]&& cevaplar[2]>=cevaplar[3]&& cevaplar[2]>=cevaplar[4]) {
			    	 System.out.println("en onem verilen sorun: gocmen problemi.");
			      }
		      else if(cevaplar[3]>=cevaplar[1]&& cevaplar[3]>=cevaplar[2]&& cevaplar[3]>=cevaplar[0]&& cevaplar[3]>=cevaplar[4]) {
			    	 System.out.println("en onem verilen sorun: ekonomi.");
			      }
		      else if(cevaplar[4]>=cevaplar[1]&& cevaplar[4]>=cevaplar[2]&& cevaplar[4]>=cevaplar[3]&& cevaplar[4]>=cevaplar[0]) {
			    	 System.out.println("en onem verilen sorun:siyaset.");
			      }
		      
	}

}

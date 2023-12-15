import java.util.Scanner; //ctrl+shift+o 5아님 ㅋㅋㅋㅋㅋ

public class Welcome { 
	static final int NUM_BOOK=3;     //상수 설정
	static final int NUM_ITEM=7;
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		//System.out.println("Welcome to Shopping Mall");
		//System.out.println("Welcome to Book Market!");\
		
		String [][] mBook=new String[NUM_BOOK][NUM_ITEM]; //3행7열
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name=s1.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String userMobile=s1.nextLine();  
		
		String greeting="Welcome to Shopping Mall";
		String tagline="Welcome to Book Market!";
		
		boolean quit=true;          //false;
		while(quit) {               //!quit
		System.out.println("*************************************************");
		System.out.println("\t"+greeting);
		System.out.println("\t"+tagline);

		
		menuIntroduction();
		
		System.out.print("메뉴 번호를 선택해 주세요 :");
		int n=s1.nextInt();
		if(n<1 || n>8) {
			System.out.println("1부터 8까지의 숫자 중 하나를 입력하세요 : ");
		}else {
			switch(n) {
			case 1:
				menuGuestInfo(name, userMobile);
				break;                           //+name +userMobile =>변수, name뒤에+: 연결    //System.out.print("총수입은 " +sum+ " 이다");
			
			case 2:
				menuCartItemlist();	
				break;
				
			case 3:
				menuCartClear();
                break;
			
			case 4:
				menuCartAddItem();
                break;
			
			case 5:
				menuCartRemoveCount();
                break;
			
			case 6:
				menuRemoveItem();
				break;
			
			case 7:
				menuCartBill();
				break;
			
			case 8:
				menuExit();
				quit=false;       //true일때 돌다가(1~7) false(8)만나면 빠져나옴. 종료됨.
				break;
				
		  }
		}
	  }
	}                                                                                 //System.out.println(n+"번을 선택했습니다.");
		
		    public static void menuIntroduction( ) {
			    System.out.println("*************************************************");
			    System.out.println("1. 고객정보 확인하기 \t4. 바구니에 항목 추가하기");
			    System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		    	System.out.println("3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
			    System.out.println("7. 영수증 출력하기 \t\t8. 종료");
		 	    System.out.println("*************************************************");
	    	}
		    
            public static void menuGuestInfo(String name, String userMobile) {
			    System.out.println("현재 고객정보 : ");
			    System.out.println("이름 : "+name + " 연락처 : "+userMobile);
            }
            
            public static void menuCartItemlist() {
                System.out.println("장바구니 상품 목록 보기 : ");
            }
            
            public static void menuCartClear () {
				System.out.println("장바구니 비우기");
            }
            
            public static void menuCartAddItem(String[][] book) {  //	System.out.println("장바구니 항목 추가하기: ");
			   BookList(book);
			   boolean quit=false;
			   while(!quit) {
			    System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");
			    Scanner s1=new Scanner(System.in);  //스캐너 기존 것 쓰면 된다셨는데 새로 적었음 ㅋㅋㅋ
			    String str=s1.nextLine();   //ID 받음
			    
			    boolean flag=true;
			    int numId=-1;
			    
			   for(int i=0; i<NUM_BOOK; i++) {
				   if(str.equals(book[i][0])) {
					   numId=i;
					   flag=true;
					   break;
				   
			   }if(flag) {
				   System.out.print("장바구니에 추가하시겠습니까? Y|N");
				   str=s1.nextLine();
				   if(str.toUpperCase().equals("Y")) {
					   System.out.println(book[numId][0] + "도서가 장바구니에 추가되었습니다");
				   }
				   quit=true;
			   }else {
				   System.out.println("다시 입력해주세요");
			   }
				/*for(int j=0; j<NUM_ITEM; j++) {
					System.out.print(book[i][j]);
				}
				System.out.println(); */
			  }
            }
          }
            public static void menuCartRemoveCount() {
				System.out.println("장바구니의 항목 수량 줄이기");
            }
            
            public static void menuRemoveItem() {
				System.out.println("장바구니의 항목 삭제하기");
            }
            
            public static void menuCartBill() {
				System.out.println("영수증 표시하기");
            }
            
            public static void menuExit() {
				System.out.println("종료");
            }
            
            public static void BookList(String[][] book) {
            	book[0][0] = "ISBN1234";
            	book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
            	book[0][2] = "27000";
            	book[0][3] = "송미영";
            	book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
            	book[0][5] = "IT전문서";
            	book[0][6] = "2018/10/08";
            	
            	book[1][0] = "ISBN1235";
            	book[1][1] = "안드로이드 프로그래밍";
            	book[1][2] = "33000";
            	book[1][3] = "우재남";
            	book[1][4] = "실습 단계별 명쾌한 멘토링!";
            	book[1][5] = "IT전문서";
            	book[1][6] = "2022/01/22";
            	
            	book[2][0] = "ISBN1236";
            	book[2][1] = "스크래치";
            	book[2][2] = "22000";
            	book[2][3] = "고종일";
            	book[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
            	book[2][5] = "컴퓨터 입문";
            	book[2][6] = "2019/06/10";
            }
            

}

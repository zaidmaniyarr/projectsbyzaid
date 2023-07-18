import java.util.Scanner;

class Vehicle
{
    String name;
    String colour;
    String company;
    double price;


}

class twoWheelar extends Vehicle
{
    public static void  twoWheelar()
    {
        Scanner sc= new Scanner(System.in);

        System.out.println ("1 ==> bajaj2");
        System.out.println ("2 ==> honda");
        System.out.println ("3 ==> yamaha");
        System.out.println ("4 ==> kawasaki");
       

        System.out.print("==============================WHICH TWO WHEELAR BIKE YOU WANNA BUY=================================");



        int twoWheelar = sc.nextInt();
        switch (twoWheelar)
        {
            case 1 :
                bajaj2 A = new bajaj2();
				A.bajaj2();
                break;
            case 2 :
                honda B = new honda();
				B.honda();
                break;
            case 3 :
                yamaha C = new yamaha();
				C.yamaha();
                break;
            case 4 :
                kawasaki D = new kawasaki();
				D.kawasaki();
                break;
            
        }




    }
}




class bajaj2 extends twoWheelar    // bajaj 2 wheelar start 
{
    public static void bajaj2()
    {
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> Pulsar");
        System.out.println ("2 ==> Dominar");
        System.out.println ("3 ==> Platinum");
        System.out.println ("4 ==> Discover");
        System.out.println ("5 ==> Avenger");


		System.out.println("=======================WHICH BAJAJ BIKE TWO WHEELAR YOU WANNA BUY==============================");
    

        int bajaj2 = sc.nextInt();
        switch (bajaj2)
        {
            case 1 :
                platinum A = new platinum();
                break;
            case 2 :
                dominar B = new dominar();
                break;
            case 3 :
                pulsar C = new pulsar();
                break;
            case 4 :
                discover D = new discover();
                break;
            case 5 :
                avenger E = new avenger();
                break;


        }
    }
}

class platinum extends bajaj2
{
    platinum ()
    {
        System.out.println(" Name : Platinum");
        System.out.println(" Colour : Red, Black, Blue");
        System.out.println(" Company: bajaj");
        System.out.println(" Price : 1,00,000/- ");
		System.out.println(" Milage : 55 km/hr");
    }

}

class dominar extends bajaj2
{
    dominar ()
    {
        System.out.println(" Name : Dmoinar");
        System.out.println(" Colour : Blacl, blue, red");
        System.out.println(" company: bajaj");
        System.out.println(" price : 2,00,000/- ");
		System.out.println(" Milage : 55 km/hr");
    }

}

class pulsar extends bajaj2
{
    pulsar ()
    {
        System.out.println(" Name : Pulsar");
        System.out.println(" Colour : Red, Blue, Black");
        System.out.println(" Company: bajaj");
        System.out.println(" Price : 2,00,000 /-");
		System.out.println(" Milage : 55 km/hr");
    }
}

class discover extends bajaj2
{
    discover ()
    {
        System.out.println(" Name : Discover");
        System.out.println(" Colour : Red ,Blue, Black");
        System.out.println(" company: bajaj");
        System.out.println(" price : 1,50,000 /-");
		System.out.println(" Milage : 65 km/hr");
    }

}

class avenger extends bajaj2
{
    avenger ()
    {
        System.out.println(" Name : Avenger");
        System.out.println(" Colour : Red ,Blue, Black");
        System.out.println(" Company: bajaj");
        System.out.println(" price : 250000 /-");
		System.out.println(" Milage : 62 km/hr");
    }
}




class honda extends twoWheelar     // honda  2 wheelar start
{
   public static void honda()
    {
	   Scanner sc= new Scanner(System.in);

        System.out.println (" 1 ==> CB Shine");
        System.out.println (" 2 ==> Dream Yuga");
        System.out.println (" 3 ==> Navi");
        System.out.println (" 4 ==> CBR 1000");
        System.out.println (" 5 ==> Hornet");

		System.out.println("==================================WHICH HONDA BIKE WILL YOU BUY==================================" );

        int honda = sc.nextInt();
        switch (honda)
        {
            case 1 :
                cbshine A = new cbshine();

                break;
            case 2 :
                dreamyuga B = new dreamyuga();
                break;
            case 3 :
                navi C = new navi();
                break;
            case 4 :
                cbr1000 D = new cbr1000();
                break;
            case 5 :
                hornet E = new hornet();
                break;


        }
    }

}
class cbshine extends honda
{
    cbshine ()
    {
        System.out.println(" Name : CB shine ");
        System.out.println(" Colour : Red, Black, Blue");
        System.out.println(" Company: Honda");
        System.out.println(" price : 150000 /-");
		System.out.println(" Milage : 62 km/hr");
    }
}

class dreamyuga extends honda
{
    dreamyuga ()
    {
        System.out.println(" Name : Dream yuga");
        System.out.println(" Colour : Red, Blue");
        System.out.println(" Company: Honda");
        System.out.println(" price : 170000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class navi  extends honda

{
   navi ()
    {
        System.out.println(" Name : Navi");
        System.out.println(" Colour : Red, Blue,Black");
        System.out.println(" company: honda");
        System.out.println(" price : 200000");
		System.out.println(" Milage : 62 km/hr");
    }

}

class cbr1000 extends honda
{
    cbr1000 ()
    {
        System.out.println(" Name : CBR 1000");
        System.out.println(" Colour : Red");
        System.out.println(" Company: Honda");
        System.out.println(" price : 400000");
		System.out.println(" Milage : 162 km/hr");
    }
}

class hornet extends honda
{
    hornet ()
    {
        System.out.println(" Name : Hornet");
        System.out.println(" Colour : Blacl, Blue, White");
        System.out.println(" Company: Honda");
        System.out.println(" Price : 150000");
		System.out.println(" Milage : 62 km/hr");
    }
}





class yamaha extends twoWheelar     // yahama 2 wheelar start
{
	public static void yamaha()
    {
		Scanner sc= new Scanner(System.in);

        System.out.println ("1 ==> R15");
        System.out.println ("2 ==> MT15");
        System.out.println ("3 ==> FZ");
        System.out.println ("4 ==> RX100");
        System.out.println ("5 ==> RX350");

		 System.out.println("==============================WHICH YAMAHA BIKE YOU WANNA BUY===================================");

        

        int yamaha = sc.nextInt();
        switch (yamaha)
        {
            case 1 :
                r15 A = new r15();
                break;
            case 2 :
                mt15 B = new mt15();
                break;
            case 3 :
                fz C = new fz();
                break;
            case 4 :
                rx100 D = new rx100();
                break;
            case 5 :
                rx350 E = new rx350();
                break;


        }
    }	
}

class r15 extends yamaha
{
	 r15 ()
    {
        System.out.println(" Name : R15");
        System.out.println(" Colour : Black");
        System.out.println(" Company: Yamaha");
        System.out.println(" price : 160000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class mt15 extends yamaha
{
    mt15 ()
    {
        System.out.println(" Name : MT-15");
        System.out.println(" Colour : Black");
        System.out.println(" Company: Yamaha");
        System.out.println(" price : 200000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class fz extends yamaha
{
   fz ()
    {
        System.out.println(" Name : FZ");
        System.out.println(" Colour : Red");
        System.out.println(" Company: Yamaha");
        System.out.println(" Price : 250000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class rx100 extends yamaha
{
   rx100 ()
    {
        System.out.println(" Name : RX 100");
        System.out.println(" Colour : Blacl, White");
        System.out.println(" Company: Yamaha");
        System.out.println(" Price : 280000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class rx350 extends yamaha
{
    rx350 ()
    {
        System.out.println(" Name : RX 350 ");
        System.out.println(" Colour : Red");
        System.out.println(" Company: bajaj");
        System.out.println(" Price : 230000");
		System.out.println(" Milage : 62 km/hr");
    }
}


class kawasaki extends twoWheelar              // kawasaki
{
	public static void kawasaki()
    {
		Scanner sc= new Scanner(System.in);

        System.out.println ("1 ==> Ninja");
        System.out.println ("2 ==> ZX10r");
        System.out.println ("3 ==> Z1000");
        System.out.println ("4 ==> z900");
        System.out.println ("5 ==> h2");

		System.out.println("============================WHICH KAWASAKI BIKE YOU WANNA BUY====================================");

       

        int kawasaki = sc.nextInt();
        switch (kawasaki)
        {
            case 1 :
                ninja A = new ninja();
                break;
            case 2 :
                zx10r B = new zx10r();
                break;
            case 3 :
                z1000 C = new z1000();
                break;
            case 4 :
                z900 D = new z900();
                break;
            case 5 :
                h2 E = new h2();
                break;


        }
    }
}

class ninja extends kawasaki
{
   ninja ()
    {
        System.out.println(" Name : Ninja ");
        System.out.println(" Colour : Green");
        System.out.println(" Company: kawasaki");
        System.out.println(" Price : 630000");
		System.out.println(" Milage :162 km/hr");
    }
}

class zx10r extends kawasaki
{
    zx10r ()
    {
        System.out.println(" Name : ZX 10R ");
        System.out.println(" Colour : Black");
        System.out.println(" Company: Kawasaki");
        System.out.println(" Price : 430000");
		System.out.println(" Milage : 122 km/hr");
    }
}


class z1000 extends kawasaki
{
   z1000 ()
    {
        System.out.println(" Name : Z 1000 ");
        System.out.println(" Colour : Green, Black");
        System.out.println(" Company: kawasaki");
        System.out.println(" Price : 330000");
		System.out.println(" Milage : 144 km/hr");
    }
}


class z900 extends kawasaki
{
   z900 ()
    {
        System.out.println(" Name : Z900 ");
        System.out.println(" Colour : Red");
        System.out.println(" Company: kawasaki");
        System.out.println(" Price : 430000");
		System.out.println(" Milage : 155 km/hr");
    }
}

class h2 extends kawasaki
{
   h2 ()
    {
        System.out.println(" Name : H2");
        System.out.println(" Colour : Black, Green");
        System.out.println(" Company: kawasaki");
        System.out.println(" Price : 630000");
		System.out.println(" Milage : 182 km/hr");
    }
}






class threeWheelar extends Vehicle
{
    public static void threeWheelar()
	{
		Scanner sc= new Scanner(System.in);

        System.out.println ("1 ==> bajaj");
        
       

        System.out.print("===============================WHICH THREE WHEELAR YOU WANNA BUY====================================");



        int threeWheelar = sc.nextInt();
        switch (threeWheelar)
        {
            case 1 :
                bajaj3  A = new bajaj3();
				A.bajaj3();
                break;
            
        }

    }
}



// 3 wheelar start

class bajaj3 extends threeWheelar     // 3 wheelar start
{
	 public static void bajaj3()
    {
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> Compact RE");
        System.out.println ("2 ==> Maxima Z");
        System.out.println ("3 ==> Piaggio Ape");
        System.out.println ("4 ==> Treo");
        

		System.out.println("=========================WHICH BAJAJ THREE WHEELAR YOU WANNA BUY=================================");
    

        int bajaj3 = sc.nextInt();
        switch (bajaj3)
        {
            case 1 :
                compactRE A = new compactRE();
                break;
            case 2 :
                maximaZ B = new maximaZ();
                break;
            case 3 :
                piaggioApe C = new piaggioApe();
                break;
            case 4 :
                treo D = new treo();
                break;
            


        }
    }
}

class compactRE extends bajaj3
{
   compactRE ()
    {
        System.out.println(" Name : Compact RE");
        System.out.println(" Colour : Black, yellow");
        System.out.println(" Company: bajaj");
        System.out.println(" Price : 130000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class maximaZ extends bajaj3
{
   maximaZ ()
    {
        System.out.println(" Name : maxima Z");
        System.out.println(" Colour : Black, Green");
        System.out.println(" Company: Bajaj");
        System.out.println(" Price : 130000");
		System.out.println(" Milage : 52 km/hr");
    }
}


class piaggioApe extends bajaj3
{
    piaggioApe()
    {
        System.out.println(" Name : Piaggio Ape");
        System.out.println(" Colour : Black, Yellow");
        System.out.println(" Company: Bajaj");
        System.out.println(" Price : 130000");
		System.out.println(" Milage : 62 km/hr");
    }
}

class treo extends bajaj3
{
    treo ()
    {
        System.out.println(" Name : Treo");
        System.out.println(" Colour : Black, Green");
        System.out.println(" Company: bajaj");
        System.out.println(" Price : 130000");
		System.out.println(" Milage : 82 km/hr");
    }
}
class fourWheelar extends Vehicle
{
    public static void fourWheelar()
	{
		Scanner sc= new Scanner(System.in);

        System.out.println ("1 ==> Maruti");
        System.out.println ("2 ==> Hyundai");
        System.out.println ("3 ==> Toyota");
        System.out.println ("4 ==> Audi");
       

        System.out.print("=============================WHICH FOUR WHEELAR BIKE YOU WANNA BUY==============================");



        int fourWheelar = sc.nextInt();
        switch (fourWheelar)
        {
            case 1 :
                maruti A = new maruti();
				A.maruti();
                break;
            case 2 :
                hyundai B = new hyundai();
				B.hyundai();
                break;
            case 3 :
                toyota C = new toyota();
				C.toyota();
                break;
            case 4 :
                audi D = new audi();
				D.audi();
                break;
            
        }
    }
}


class maruti extends fourWheelar    //maruti 4 wheelar start
{
	public static void maruti()
    {
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> WagonR");
        System.out.println ("2 ==> Swift");
        System.out.println ("3 ==> Baleno");
        System.out.println ("4 ==> Alto");
        System.out.println ("5 ==> Ertiga");


		System.out.println("==========================WHICH MARUTI CAR FOUR WHEELAR YOU WANNA BUY=============================");
    

        int maruti = sc.nextInt();
        switch (maruti)
        {
            case 1 :
                wagonr A = new wagonr();
                break;
            case 2 :
                swift B = new swift();
                break;
            case 3 :
                baleno C = new baleno();
                break;
            case 4 :
                alto D = new alto();
                break;
            case 5 :
                ertiga E = new ertiga();
                break;


        }
    }
}

class wagonr extends maruti
{
    wagonr  ()
    {
        System.out.println(" Name : WagonR");
        System.out.println(" Colour : Black, Brown, Grey");
        System.out.println(" Company: Maruti");
        System.out.println(" Price : 430000");
		System.out.println(" Milage : 80 km/hr");
    }
}

class swift extends maruti
{
   swift ()
    {
        System.out.println(" Name : Swift");
        System.out.println(" Colour : Black, White, Grey, ");
        System.out.println(" Company: Maruti");
        System.out.println(" Price : 630000");
		System.out.println(" Milage : 102 km/hr");
    }
}


class baleno extends maruti
{
   baleno ()
    {
        System.out.println(" Name : Baleno");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Maruti");
        System.out.println(" Price : 750000");
		System.out.println(" Milage : 92 km/hr");
    }
}

class alto extends maruti
{
    alto ()
    {
        System.out.println(" Name : Alto");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Maruti");
        System.out.println(" Price : 330000");
		System.out.println(" Milage : 82 km/hr");
    }
}


class ertiga extends maruti
{
   ertiga ()
    {
        System.out.println(" Name : Ertiga");
        System.out.println(" Colour : Black, Maroon, White");
        System.out.println(" Company: Maruti");
        System.out.println(" Price : 730000");
		System.out.println(" Milage : 102 km/hr");
    }
}


class hyundai extends fourWheelar    // hyundai
{
	public static void hyundai()
	{
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> i10");
        System.out.println ("2 ==> i20");
        System.out.println ("3 ==> Brezza");
        System.out.println ("4 ==> Creta");
        System.out.println ("5 ==> Venue");


		System.out.println("===========================WHICH HYUNDAI CAR FOUR WHEELAR YOU WANNA BUY===========================");
    

        int hyundai = sc.nextInt();
        switch (hyundai)
        {
            case 1 :
                i10 A = new i10();
                break;
            case 2 :
                i20 B = new i20();
                break;
            case 3 :
                brezza C = new brezza();
                break;
            case 4 :
                creta D = new creta();
                break;
            case 5 :
                venue E = new venue();
                break;


        }
	}
}

class i10 extends hyundai
{
    i10 ()
    {
        System.out.println(" Name : i10");
        System.out.println(" Colour : Black, White, Grey");
        System.out.println(" Company: Hyundai");
        System.out.println(" Price : 730000");
		System.out.println(" Milage : 92 km/hr");
    }
}

class i20 extends hyundai
{
   i20 ()
    {
        System.out.println(" Name : i20");
        System.out.println(" Colour : Black, Grey, White");
        System.out.println(" Company: Hyndai");
        System.out.println(" Price : 630000");
		System.out.println(" Milage : 82 km/hr");
    }
}

class brezza extends hyundai
{
    brezza ()
    {
        System.out.println(" Name : Brezza");
        System.out.println(" Colour : Black, Red, Yellow");
        System.out.println(" Company: Hyundai");
        System.out.println(" Price : 830000");
		System.out.println(" Milage : 82 km/hr");
    }
}

class creta extends hyundai
{
   creta ()
    {
        System.out.println(" Name : Creta");
        System.out.println(" Colour : Black, Red, White");
        System.out.println(" Company: Hyundai");
        System.out.println(" Price : 630000");
		System.out.println(" Milage : 182 km/hr");
    } 
}

class venue extends hyundai
{
   venue ()
    {
        System.out.println(" Name : Venue");
        System.out.println(" Colour : Black, White, Red");
        System.out.println(" Company: Hyundai");
        System.out.println(" Price : 1330000");
		System.out.println(" Milage : 182 km/hr");
    }
}


class toyota extends fourWheelar      // toyota
{
	public static void toyota()
	{

		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> fortuner");
        System.out.println ("2 ==> innova");
        System.out.println ("3 ==> cruiser");
        System.out.println ("4 ==> glanzer");
        System.out.println ("5 ==> hilux");


		System.out.println("===========================WHICH TOYOTA CAR FOUR WHEELAR YOU WANNA BUY============================");
    

        int toyota = sc.nextInt();
        switch (toyota)
        {
            case 1 :
                fortuner A = new fortuner();
                break;
            case 2 :
                innova B = new innova();
                break;
            case 3 :
                cruiser C = new cruiser();
                break;
            case 4 :
                glanzer D = new glanzer();
                break;
            case 5 :
                hilux E = new hilux();
                break;


        }
		
	}
}

class fortuner extends toyota
{
    fortuner ()
    {
        System.out.println(" Name : Fortuner");
        System.out.println(" Colour : Black, White, Grey");
        System.out.println(" Company: Toyota");
        System.out.println(" Price : 4230000");
		System.out.println(" Milage : 182 km/hr");
    }
}

class innova extends toyota
{
     innova ()
    {
        System.out.println(" Name : Innova");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Toyota ");
        System.out.println(" Price : 1530000");
		System.out.println(" Milage : 182 km/hr");
    }
}

class cruiser extends toyota
{
    cruiser ()
    {
        System.out.println(" Name : Cruiser");
        System.out.println(" Colour : Black, White, Red");
        System.out.println(" Company: Toyota ");
        System.out.println(" Price : 2330000");
		System.out.println(" Milage : 152 km/hr");
    }
}

class glanzer extends toyota
{
     glanzer ()
    {
        System.out.println(" Name : Glanzer");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Toyota");
        System.out.println(" Price : 1230000");
		System.out.println(" Milage : 122 km/hr");
    }
}

class hilux extends toyota
{
     hilux ()
    {
        System.out.println(" Name : Hilux");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Toyota");
        System.out.println(" Price : 1130000");
		System.out.println(" Milage : 132 km/hr");
    }
}



class audi extends fourWheelar               // audi
{
	public static void audi()
	{
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> Audi A4");
        System.out.println ("2 ==> Audi A6");
        System.out.println ("3 ==> Audi Q3");
        System.out.println ("4 ==> Audi Q5");
        System.out.println ("5 ==> Audi Q7");


		System.out.println("======================WHICH AUDI CAR FOUR WHEELAR YOU WANNA BUY=================================");
    

        int audi = sc.nextInt();
        switch (audi)
        {
            case 1 :
                a4 A = new a4();
                break;
            case 2 :
                a6 B = new a6();
                break;
            case 3 :
                q3 C = new q3();
                break;
            case 4 :
                q5 D = new q5();
                break;
            case 5 :
                q7 E = new q7();
                break;


        }
	}
}

class a4 extends audi
{
	a4 ()
    {
        System.out.println(" Name : Audi A4");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Audi");
        System.out.println(" Price : 56,30,000 /- ");
		System.out.println(" Milage : 30 km/hr");
    }
}

class a6 extends audi
{
	a6 ()
    {
        System.out.println(" Name : Audi A6");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Audi  ");
        System.out.println(" Price : 53,30,000 /- ");
		System.out.println(" Milage : 22 km/hr");
    }
}

class q3 extends audi
{
	q3 ()
    {
        System.out.println(" Name : Audi Q3");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Audi");
        System.out.println(" Price : 45,30,000/-");
		System.out.println(" Milage : 32 km/hr");
    }
}

class q5 extends audi
{
	q5 ()
    {
        System.out.println(" Name : Audi Q5");
        System.out.println(" Colour : Black, White");
        System.out.println(" Company: Audi");
        System.out.println(" Price : 67,30,000/-");
		System.out.println(" Milage : 182 km/hr");
    }
}

class q7 extends audi
{
	q7 ()
    {
        System.out.println(" Name : Audi Q7");
        System.out.println(" Colour : White, Green");
        System.out.println(" Company: Audi");
        System.out.println(" Price : 78,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}




// 8 WHEELAR START

class eightWheelar extends Vehicle
{
    public static void eightWheelar()
	{
		Scanner sc= new Scanner(System.in);

        System.out.println ("1 ==> Tata");
        System.out.println ("2 ==> Mahindra");
       
       

        System.out.print("============================WHICH EIGHT WHEELAR YOU WANNA BUY======================================");



        int eightWheelar = sc.nextInt();
        switch (eightWheelar)
        {
            case 1 :
                tata A = new tata();
				A.tata();
                break;
            case 2 :
                mahindra B = new mahindra();
				B.mahindra();
                break;
            
            
        }

    }
}

class tata extends eightWheelar    //tata 8 wheelar
{
	public static void tata()
	{
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> Ace");
        System.out.println ("2 ==> Signa");
        System.out.println ("3 ==> Ultra");
        System.out.println ("4 ==> LPK");
        System.out.println ("5 ==> SFC");


		System.out.println("============================WHICH TATA EIGHT WHEELAR YOU WANNA BUY===============================");
    

        int tata = sc.nextInt();
        switch (tata)
        {
            case 1 :
                ace A = new ace();
                break;
            case 2 :
                signa B = new signa();
                break;
            case 3 :
                ultra C = new ultra();
                break;
            case 4 :
                lpk D = new lpk();
                break;
            case 5 :
                sfc E = new sfc();
                break;


        }
	}
}

class ace extends tata
{
    ace ()
    {
        System.out.println(" Name : Ace");
        System.out.println(" Colour : White, Brown");
        System.out.println(" Company: Tata");
        System.out.println(" Price : 48,30,000/-");
		System.out.println(" Milage : 29 km/hr");
    }
}

class signa extends tata
{
    signa ()
    {
        System.out.println(" Name : Signa");
        System.out.println(" Colour : White, Black");
        System.out.println(" Company: Tata");
        System.out.println(" Price : 38,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}

 class ultra extends tata 
{
       ultra ()
		 {
        System.out.println(" Name : Ultra");
        System.out.println(" Colour : White, Brown");
        System.out.println(" Company: Tata");
        System.out.println(" Price : 68,30,000/-");
		System.out.println(" Milage : 22 km/hr");
		 }
}


class lpk extends tata 
{
       lpk ()
    {
        System.out.println(" Name : Lpk");
        System.out.println(" Colour : White");
        System.out.println(" Company: Tata");
        System.out.println(" Price : 58,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
 }

 class sfc extends tata
	 {
        sfc ()
		 {
        System.out.println(" Name : SFC");
        System.out.println(" Colour : White");
        System.out.println(" Company: Tata");
        System.out.println(" Price : 48,30,000/-");
		System.out.println(" Milage : 22 km/hr");
		  }
    }




class mahindra extends eightWheelar     // mahindra 8 wheelar
{
	public static void mahindra()
	{
		Scanner sc= new Scanner(System.in);

		

        System.out.println ("1 ==> Jayo ");
        System.out.println ("2 ==> Furio");
        System.out.println ("3 ==> Optimo");
        System.out.println ("4 ==> Biazo");
        System.out.println ("5 ==> Tiago");


		System.out.println("=======================WHICH MAHINDRA EIGHT WHEELAR YOU WANNA BUY================================");
    

        int mahindra = sc.nextInt();
        switch (mahindra)
        {
            case 1 :
                jayo A = new jayo();
                break;
            case 2 :
                furio B = new furio();
                break;
            case 3 :
                optimo C = new optimo();
                break;
            case 4 :
                biazo D = new biazo();
                break;
            case 5 :
                tiago E = new tiago();
                break;


        }
	}
}

class jayo extends mahindra
{
     jayo ()
    {
        System.out.println(" Name : Jayo");
        System.out.println(" Colour : White");
        System.out.println(" Company: Mahindra");
        System.out.println(" Price : 68,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}

class furio extends mahindra
{
     furio ()
    {
        System.out.println(" Name : Furio");
        System.out.println(" Colour : White");
        System.out.println(" Company: Mahindra");
        System.out.println(" Price : 58,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}

class optimo extends mahindra
{
     optimo ()
    {
        System.out.println(" Name : Optimo");
        System.out.println(" Colour : White");
        System.out.println(" Company: Mahindra");
        System.out.println(" Price : 58,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}

class biazo extends mahindra
{
    biazo ()
    {
        System.out.println(" Name : Biazo");
        System.out.println(" Colour : White");
        System.out.println(" Company: Mahindra");
        System.out.println(" Price : 78,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}

class tiago extends mahindra
{
    tiago ()
    {
        System.out.println(" Name : Tiago");
        System.out.println(" Colour : White");
        System.out.println(" Company: Mahindra");
        System.out.println(" Price : 78,30,000/-");
		System.out.println(" Milage : 22 km/hr");
    }
}



class Driver {
    public static void start() {
        Scanner sc = new Scanner(System.in);
		
		
        System.out.println(" 1 ===> Two Wheelar");
        System.out.println(" 2 ===> Three Wheelar");
        System.out.println(" 3 ===> Four WHeelar");
        System.out.println(" 4 ===> Eight wheelar");

		
		System.out.println("================================ ENTER WHICH VEHICLE DO YOU WANT================================");
		


        
        {
            int brand = sc.nextInt();

            switch (brand) {
                case 1:
                    twoWheelar a = new twoWheelar();
                    a.twoWheelar();
                    break;

                case 2:
                    threeWheelar b = new threeWheelar();
                    b.threeWheelar();
                    break;

                case 3:
                    fourWheelar c = new fourWheelar();
                    c.fourWheelar();
                    break;

                case 4:
                    eightWheelar d = new eightWheelar();
                    d.eightWheelar();
                    break;

            }
        }
    }

    public static void main(String[] args)
		{

		System.out.println("=================================================================================================");
        System.out.println("=                                 WELCOME TO VEHICLE SHOWROOM                                   =");
		System.out.println("=================================================================================================");

        start();

		System.out.println("=================================================================================================");
        System.out.println("=                                          THANK YOU                                            =");
		System.out.println("=================================================================================================");
    }

}
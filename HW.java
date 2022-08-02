import java.util.ArrayList;
/////ex1
public class Main {
    public static void main(String[] args) {

        String name[]=new String[3]  ;
        name[0]=("Saleh");
        name[1]=("Khalid");
        name[2]=("Majed");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }}

////ex2
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=33;i++){
            if (i%5==0){
                continue;
            } System.out.println(i);
        }

    }
}

	//// ex3


            import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] arr={"1", "2", "3", "4", "5"};
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);
    }
}

//// ex4
public class Main {
    public static void main(String[] args) {
        String []  myArray= new String[10];
        myArray[0]="sara";
        myArray[1]="asma";
        myArray[2]="lama";
        myArray[3]="saleha";
        myArray[4]="maha";
        myArray[5]="aziz";
        myArray[6]="anas";
        myArray[7]="hanan";
        myArray[8]="mashari";
        myArray[9]="refah";
        for (int i=0;i<10;i++){
            if (!myArray[i].startsWith("A"))
                System.out.println(myArray[i]);
        }


    }

}

///ex5


        import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};
        System.out.println("Printing array values :");
        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }
}



////ex6


public class Main {
    public static void main(String[] args) {
        int a=0;
        a(3,4,6);
    }
    public static  ArrayList a (int number1,int number2,int number3){
        ArrayList number=new ArrayList();
        number.add(number1);
        number.add(number2);
        number.add(number3);

        return number;
    }
}

//ex7

        import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String  firstName;
        String lastName;
        String  fullName = "firstName" + " " + "lastName";
        System.out.println("Hello, my  "+ fullName+ ".");





    }
}




//////// ex8





public class Main {
    public static void main(String[] args) {
    int total= average(1,2,3,4);
    System.out.println(total);
    }
    {
        int  reslt (int num1 ,int num2,int num3,int num4);
        reslt(num1+num2+num3+num4/4);

        return reslt;


    }

}



public class BasicsofOops {
    public static void main(String[] args) {
        Pen pen = new Pen("delux",2,"yellow");
        // Pen pen2 = new Pen("natraj", 3 , "red");

        // String[] companyName = {"delux" , "natraj" , "softpoint" , "hardpoint" , "clockpen"};
        // int[] tip = {2,3,4,5,6};
        // String[] color = {"yellow" , "red" , "blue" , "green" , "violent"};
        // for(int i =0 ; i < 5 ; i++) {
        //     Pen pen
        // }
        System.out.println("this is pen object color : " + pen.color + " company name is : " + pen.companyName);
    }
}


class BankAccount {
     String username;
     
    
}


class Pen {
     String companyName;
     int tip;
     String color;

    public Pen(String companyName, int tip , String color) {
        this.companyName = companyName;
        this.tip = tip;
        this.color = color;
    }



    public void changeColor(String color) {
        this.color = color;
    }

    public void changeTip(int tip) {
        this.tip = tip;
    }

    public void changecompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void printProperties() {
        System.out.println(companyName);
        System.out.println(color);
        System.out.println(tip);
    }

}

// Acess modifiers starts from here 

/**
 * 
 *      *outside package

Access Modifier

within class

Private

Y

within package

N

outside package by subclass only

N

N

Default

Y

Y

N

N

Protected

Y

Y

Y

N

Public

Y

Y

Y
 * 
 */

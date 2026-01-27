package reviews;
//Incorrect Code (Try to achieve using class)

// class A {
//     void show() {
//         System.out.println("Class A");
//     }
// }

// class B extends A {
//     void show() {
//         System.out.println("Class B");
//     }
// }

// class C extends A {
//     void show() {
//         System.out.println("Class C");
//     }
// }

// class D extends B, C {
// }

// class DiamondProblem {
//     public static void main(String[] args) {
//         D obj = new D();
//         obj.show();
//     }
// }

//Correct Code using Interface


interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("Interface B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("Interface C");
    }
}

class D implements B, C {

    public void show() {
        B.super.show();   // or C.super.show()
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}


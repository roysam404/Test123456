package com.SamplePackage;

 abstract class my {
    public void mymethod() {
        System.out.print("Abstract");
    }
}

class poly {
    public static void main(String a[]) {
//        my m = new my() {}; // example object of ClassOne is not created but the instance of an Anonymous Subclass
        my m1 = new my() {}; // Example if abtraction
//        m.mymethod();
//        m1.mymethod();
    }
}

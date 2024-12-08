class Abc1{

 @FunctionalInterface

interface Add 
{
    int add(int a, int b);
}


    public static void main(String[] args) {
        
        Add add = (a, b) -> a + b;

 
        int sum = add.add(12, 12);

   
        System.out.println("Sum : " + sum);
    }
}
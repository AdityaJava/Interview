package Youtube;

class Parent{
    /*
    This is example of overloading
     */
    public Integer add(Integer a, Integer b){
        System.out.println("parent");
        return a+b;
    }

    public Integer add(Integer a, Integer b,Integer c){
        System.out.println("parent");
        return a+b+c;
    }

}

class Child extends Parent{
    public Integer add(Integer a, Integer b,Integer c){
        System.out.println("child");
        return a+b+c+1;
    }

}
public class MethodOveridingOverloadingExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.add(1,2,3));

        Parent parent1 = new Parent();
        System.out.println(parent1.add(1,2));
        System.out.println(parent1.add(1,2,3));

    }
}

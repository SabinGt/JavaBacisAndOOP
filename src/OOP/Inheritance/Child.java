package OOP.Inheritance;

public class  Child extends ParentClass {

    public Child() {
        System.out.println("This is Child class constructor");

    }
    public Child(int id, String name){
        this.id=id;
        this.name=name;

    }


    public void display(){
        System.out.println("The id and name in parent class are: "+id+","+name);
        System.out.println("The color is : "+ super.color);
    }
}

public class Author {
    private String name;
    private int age;
    Author (){
        name=null;
        age=0;
    }
    Author(String name, int age){
        this.age=age;
        this.name=name;
    }
    public void setAuthor(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}

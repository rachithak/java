class animal{
    void cat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("barking");
    }
    public static void main(String[] args){
        dog d=new dog();
        d.cat();
        d.bark();
    }
}
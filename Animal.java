abstract class Animal{
    abstract void sound();

}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion is Roaring");
}
}
class Tiger extends Animal{
    void sound(){
        System.out.println("Tiger is growling");
    }
}
class One{
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
        Tiger tiger = new Tiger();
        tiger.sound();
    }
}
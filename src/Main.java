public class Main {
    public static void main(String[] args) {
        Voter v1=new Voter("Mihael","KarlStrasse 11",23);
        Voter v2=new Voter("Andreas","BachStrasse 110",18);
        Voter v3=new Voter("Stefan","BagStrasse 2/123",55);
       // v1.setAge(71);

        System.out.println("name Voter: "+v1.getName());
        System.out.println("adress Voter: "+v1.getAddress());
        System.out.println("age Voter: "+v1.getAge());

        System.out.println("name Voter: "+v2.getName());
        System.out.println("adress Voter: "+v2.getAddress());
        System.out.println("age Voter: "+v2.getAge());

        System.out.println("name Voter: "+v3.getName());
        System.out.println("adress Voter: "+v3.getAddress());
        System.out.println("age Voter: "+v3.getAge());
    }
}
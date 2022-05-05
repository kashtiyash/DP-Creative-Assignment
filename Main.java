public class Main {

    public static void main(String[] args) {

        Blogger blogger = new Blogger();

        Fan sciFiFan = new Fan(blogger, "Panay");
        Fan carFan = new Fan(blogger, "Yash");
        Fan movieFan = new Fan(blogger, "Sahil");
        Fan animeFan = new Fan(blogger, "Aman");

        System.out.println("");

        blogger.displayMessage("Hey, new Blog post on Movies.");
        System.out.println("");

        blogger.notifyObservers();
        System.out.println("");

        blogger.removeObserver(animeFan);
        System.out.println();

        blogger.displayMessage("Hey, new Blog post on Cars.");
        System.out.println();
        blogger.notifyObservers();
    }

}
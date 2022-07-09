package task_alterra.section11;

public class Fish {

    private String type;
    private String feed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed = feed;
    }

    private static void show_identity(){
        Fish fish = new Fish();

        String[] jenis = {"paus","cupang","arwana","sapu-sapu"};
        String[] makanan = {"plankton","cacing","jangkrik","pelet"};

        for (int i = 0; i < jenis.length; i++) {
            fish.setType(jenis[i]);
            fish.setFeed(makanan[i]);

            System.out.println("saya ikan dengan detail, Jenis: "+fish.getType()+", makanan: "+fish.getFeed());
        }
    }

    public static void main(String[] args) {
        show_identity();
    }
}

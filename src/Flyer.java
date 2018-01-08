
public interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
    
     public static String met() {
        return "I am able to fly.";
    }
}

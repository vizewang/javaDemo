package inner_class;


/**
 * Created by weizwang on 2015/8/11.
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                this.label = whereTo;
            }

            public String readLabel() {
                return label;

            }

        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p=new Parcel5();
        Destination d=p.destination("Tas");
        System.out.println(d.readLabel());
    }
}

package allclasses.stepacheva;

public class DancePair {
    private String partner1;
    private String partner2;
    private String style;

    public DancePair(String partner1, String partner2, String style) {
        this.partner1 = partner1;
        this.partner2 = partner2;
        this.style = style;
    }

    public String getPartner1() {
        return partner1;
    }

    public String getPartner2() {
        return partner2;
    }

    public String getStyle() {
        return style;
    }

    public boolean isCompletePair() {
        return partner1 != null && !partner1.isEmpty() &&
               partner2 != null && !partner2.isEmpty();
    }

    public int evaluate() {
        return isCompletePair() ? 10 : 0;
    }

    @Override
    public String toString() {
        return "DancePair{" +
                "partner1='" + partner1 + '\'' +
                ", partner2='" + partner2 + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}

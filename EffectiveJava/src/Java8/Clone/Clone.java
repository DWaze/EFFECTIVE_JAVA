package Java8.Clone;

public class Clone implements Cloneable {
    private int phone_number;
    private String name;

    Clone(int phone_number, String name){
        this.phone_number = phone_number;
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Clone clone = (Clone)obj;
        return this.phone_number == clone.getPhone_number() && this.name.equals(clone.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

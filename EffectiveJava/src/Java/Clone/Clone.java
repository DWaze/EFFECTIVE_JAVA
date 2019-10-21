package Java.Clone;

public class Clone implements Cloneable {

    int phone_number;
    String name;

    Clone(int phone_number, String name){
        this.phone_number = phone_number;
        this.name = name;
    }

    Clone() {

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

    @Override
    public String toString() {
        return "Clone{" +
                "phone_number=" + phone_number +
                ", name='" + name + '\'' +
                '}';
    }
}

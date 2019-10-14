package Java8.Equals_Hashcode;

public class Student {
    private String registrationNumber;

    public Student(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

//   equals method allow us to check if two object are equal or not
//   by defining our oun equals method we specify the equality that we wont
//   in this case wae have to check if two students are not the same and for that we chack the registration number
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            String regNumber = ((Student) obj).getRegistrationNumber();
            return regNumber != null && regNumber.equals(this.getRegistrationNumber());
        }
        return false;
    }

//   hashCode is method that returns the memory location of an object in a form of an int
//   here we have redefined the hashCode method so that it returns the hashCode of the String registrationNumber (id)
//   in this scenario if we create two object with the same registration number they will have the same hashCode
    @Override
    public int hashCode() {
        return this.registrationNumber.hashCode();
    }
}

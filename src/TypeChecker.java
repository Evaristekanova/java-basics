public class TypeChecker <T>{
    T whatType;

    public TypeChecker(T whatType) {
        this.whatType = whatType;
    }
    public void displayType() {
        System.out.println("The "+ whatType.getClass().getSimpleName().toLowerCase()+ " value is: "+whatType);
    }
}

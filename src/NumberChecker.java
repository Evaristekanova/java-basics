public class NumberChecker <T extends Number>{
    public T numberType;

    public NumberChecker(T numberType) {
        this.numberType = numberType;
    }

    public void print(){
        System.out.println(numberType);
    }
}

public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    
    public int remainingMinutesInOven(int arg){
        return this.expectedMinutesInOven() - arg;
    }
    
    public int preparationTimeInMinutes(int arg) {
        return arg * 2;
    }

    public int totalTimeInMinutes(int arg1, int arg2) {
        return this.preparationTimeInMinutes(arg1) + arg2;
    }
}

package OoplabRed.OoplabRedCal;

//TODO Calculator

public class Cal {
    private float result;

    public Cal() {
    }

    public Cal(float result) {
        this.result = result;
    }

    public float add(float val) {
        return result += val;
    }

    public float sub(float val) {
        return result -= val;
    }

    public float muli(float val) {
        return result *= val;
    }

    public float div(float val) {
        return result /= val;
    }

    public float pow(float pow) {
        return result = (float) Math.pow(result, pow);
    }

    public float getResult() {
        return result;
    }

    public float abs() {
        return Math.abs(result);
    }


}


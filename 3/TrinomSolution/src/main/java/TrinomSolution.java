
public class TrinomSolution {
    public double Root(Trinomial trinomial){
        double[] arr = trinomial.solution();
        if (arr.length == 0) throw new IllegalArgumentException("Нет корней");
        if (arr.length == 1) return arr[0];
        if (arr[0] >= arr[1]) return arr[0];
        else return arr[1];
    }

    public static void main(String[] args){

    }
}

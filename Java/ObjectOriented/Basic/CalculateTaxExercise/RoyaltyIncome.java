package ObjectOriented.Basic.CalculateTaxExercise;

public class RoyaltyIncome extends Income{
    public RoyaltyIncome(double income){
        super(income);
    }
    //TODO:
    @Override
    public double getTax(){
        if (income <= 5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}

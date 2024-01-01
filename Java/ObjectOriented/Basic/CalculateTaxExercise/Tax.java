package ObjectOriented.Basic.CalculateTaxExercise;

public class Tax {
    public static void main(String[] args) {
        //TODO:给一个有工资收入和稿费收入的算税
        Income[] incomes = new Income[] {new Income(3000),new SalaryIncome(8000),new RoyaltyIncome(12000)};
        //TODO:
        System.out.println(total(incomes));
    }
    public static double total(Income ...incomes){
        double total = 0;
        for(Income income : incomes){
            total = total + income.getTax();
        }
        return  total;
    }
}

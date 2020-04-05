public class BonusMilesService {
    public int calculate(int price) {
        int bonusMiles = 20;//цена одной мили
        int miles = price / bonusMiles;//кол-во бонусных миль за билет
        return miles;
    }
}

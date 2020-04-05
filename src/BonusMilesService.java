public class BonusMilesService {
    public int calculate (int price) {
        int bonusmiles = 20;//цена одной мили
        int miles = price / bonusmiles;//кол-во бонусных миль за билет
        return miles;
    }
}

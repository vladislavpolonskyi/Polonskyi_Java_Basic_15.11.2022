package lesson12;

public enum Drink {
        COCA_COLA(2.4),
        COFFEE(1.0),
        LEMONADE(2.0),
        MINERAL_WATER(0.5),
        MOJITO(1.5),
        TEA(2.15);
        public final double price;

        Drink(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
}

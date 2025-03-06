import java.util.List;

public class Park {
    public static class Attraction {
        private String name;
        private String workTime;
        private double price;

        public Attraction(String name, String workTime, double price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public String toString() {
            return "Аттракцион: " + name + ", Время работы: " + workTime + ", Стоимость: " + price + " руб.";
        }
    }

    private List<Attraction> attractions;
}
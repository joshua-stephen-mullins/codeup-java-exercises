public class ServerNameGenerator {

    public static String randomize(String[] array){
        int max = array.length;
        int min = 0;
        int range = max - min + 0;
        int randomIndex = (int)((Math.random() * range) + min);
        return array[randomIndex];
    }

    public static void main(String[] args) {
        String[] adjectives = {"Big", "Little", "Dapper", "Weeny", "Haggard", "Bulbous", "Proper", "Good", "Stylish", "Cool"};
        String[] nouns = {"Boat", "Hat", "Tiger", "Peanut", "Donut", "Car", "Plastic", "Bottle", "Soap", "Ring"};

        System.out.println("Here is your server name: \n " + randomize(adjectives) + "-" + randomize(nouns));

    }
}


    class Bike {
        void sound() {
            System.out.println("Generic bike sound");
        }
    }
    class Honda extends Bike {
        void sound() {
            System.out.println("Honda bike sound: Dhoom Dhoom");
        }
    }
    class Yamaha extends Bike {
        void sound() {
            System.out.println("Yamaha bike sound: Vroom Vroom");
        }
    }
    class Overridding {
        public static void main(String[] args) {
            Bike bike = new Bike();
            Honda hondaBike = new Honda();
            Yamaha yamahaBike = new Yamaha();
            bike.sound();
            hondaBike.sound();

            yamahaBike.sound();
        }
    }


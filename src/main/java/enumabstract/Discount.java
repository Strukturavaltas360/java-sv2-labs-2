package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        double getAmountToPay(int price, int pieces) {
            return 0.8 * price * pieces;
        }
    },
    BLACK_FRIDAY_OFFER {
        double getAmountToPay(int price, int pieces) {
            if (pieces < 3) {
                return 0.75 * price * pieces;
            }
            return 0.5 * price + 0.75 * price * (pieces - 1);
        }
    };

    abstract double getAmountToPay(int price, int pieces);
}

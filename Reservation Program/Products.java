public class Products {
        String smartPhones, tablet, laptop;
        int qProduct, tabPrice, lapPrice;

        private static final String[] Categories = {"Smartphones", "Tablets", "Laptops"};

        private static final String[] Smartphones = {
                "iPhone 6",
                "iPhone 6 Plus",
                "iPhone SE(1st gen)",
                "iPhone 7",
                "iPhone 7 Plus",
                "iPhone 8",
                "iPhone 8 Plus",
                "iPhone X",
                "iPhone XR",
                "iPhone XS",
                "iPhone XS MAX",
                "iPhone 11",
                "iPhone 11 Pro",
                "iPhone 11 Pro Max",
                "iPhone SE(2nd gen)",
                "iPhone 12",
                "iPhone 12 mini",
                "iPhone 12 Pro",
                "iPhone 12 Pro Max",
                "iPhone 13",
                "iPhone 13 mini",
                "iPhone 13 Pro",
                "iPhone 13 Pro Max",
                "iPhone SE(3rd gen)"};

        private static final int[] phonePrices = {19000, 22500, 8450, 19468, 21990, 21270, 36990, 45888,
                29500, 30200, 46209, 17450, 33590, 40950, 32990,
                200, 28850, 23950, 39650, 41450, 43450,200, 200, 200};

        private static final String[] Tablets = {"iPad",
                "iPad mini",
                "iPad Air",
                "iPad Pro 11-inch",
                "iPad Pro 12-inch"};

        private static final int[] tabletPrices = {18990, 28990, 34990, 44990, 60990 };

        private static final String[] Laptops ={"MacBook Air",
                "MacBook Pro 13-inch",
                "Macbook Pro 14-inch",
                "MacBook Pro 16-inch"};

        static final int[] laptopPrices = {53990, 70990, 115990, 145990};

        //setter and getter
        public static String[] getCategories() {
                return Categories;
        }

        public void setSmartphone(String phones){
                this.smartPhones = phones;
        }
        public static String[] getSmartphones() {
                return Smartphones;
        }

        public void setTablet(String tablet) {
                this.tablet = tablet;
        }
        public static String[] getTablet() {
                return Tablets;
        }

        public void setLaptop(String laptop) {
                this.laptop = laptop;
        }
        public static String[] getLaptop() {
                return Laptops;
        }

        public void setqProduct(int qProduct) {
                this.qProduct = qProduct;
        }

        public int getqProduct() {
                return qProduct;
        }

        public static int[] getPhonePrices() {
                return phonePrices;
        }

        public void setTabPrice(int tabPrice) {
                this.tabPrice = tabPrice;
        }
        public static int[] getTabletPrices() {
                return tabletPrices;
        }

        public void setLapPrice(int lapPrice) {
                this.lapPrice = lapPrice;
        }
        public static int[] getLaptopPrices() {
                return laptopPrices;
        }
}



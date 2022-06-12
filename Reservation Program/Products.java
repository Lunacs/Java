public class Products {
        String smartPhones, tablet, laptop;
        int qproducts, tabPrice, lapPrice;

        private static final String[] Categories = {"iPhones", "iPads", "Macs", "Apple Watches"};

        private static final String[] iPhone = {
                "iPhone 6",
                "iPhone 6 Plus",
                "iPhone SE(1st gen)",
                "iPhone 7",
                "iPhone 7 Plus",
                "iPhone 8",
                "iPhone 8 Plus",
                "iPhone X",//
                "iPhone XR",
                "iPhone XS",
                "iPhone XS MAX",
                "iPhone 11",
                "iPhone 11 Pro",
                "iPhone 11 Pro Max",
                "iPhone SE(2nd gen)",
                "iPhone 12 mini",//
                "iPhone 12 ",
                "iPhone 12 Pro",
                "iPhone 12 Pro Max",
                "iPhone 13",
                "iPhone 13 mini",
                "iPhone 13 Pro",
                "iPhone 13 Pro Max",
                "iPhone SE(3rd gen)"};

        private static final int[] iPhonePrices = {19000, 22500, 8450, 19468, 21990, 21270, 36990, 40888,
                32500, 30200, 32000, 31990, 33590, 40950, 32990, 35990,
                42990, 48990, 55990, 41450, 43450,62000, 70000, 25900};

        private static final String[] iPad= {"iPad",
                "iPad mini",
                "iPad Air",
                "iPad Pro 11-inch",
                "iPad Pro 12-inch"};

        private static final int[] iPadPrices = {18990, 28990, 34990, 44990, 60990 };

        private static final String[] Mac ={"MacBook Air",
                "MacBook Pro 13-inch", "Macbook Pro 14-inch", "MacBook Pro 16-inch",
                "iMac 24-inch" , "iMac 27-inch",
                "Mac Pro", "Mac mini",
                "Mac Studio", "Pro Display", "Studio Display"};

        static final int[] MacPrices = {53990, 70990, 115990, 145990,
                72990, 102990,
                350990, 35990,
                115990, 295990, 92990};

        //setter and getter
        public static String[] getCategories() {
                return Categories;
        }

        public void setSmartphone(String phones){
                this.smartPhones = phones;
        }
        public static String[] getSmartphones() {
                return iPhone;
        }

        public void setTablet(String tablet) {
                this.tablet = tablet;
        }
        public static String[] getTablet() {
                return iPad;
        }

        public void setLaptop(String laptop) {
                this.laptop = laptop;
        }
        public static String[] getLaptop() {
                return Mac;
        }


        public int getQproducts() {
                return qproducts;
        }

        public void setQproducts(int qproducts) {
                this.qproducts = qproducts;
        }

        public static int[] getPhonePrices() {
                return iPhonePrices;
        }

        public void setTabPrice(int tabPrice) {
                this.tabPrice = tabPrice;
        }
        public static int[] getTabletPrices() {
                return iPadPrices;
        }

        public void setLapPrice(int lapPrice) {
                this.lapPrice = lapPrice;
        }
        public static int[] getLaptopPrices() {
                return MacPrices;
        }
}



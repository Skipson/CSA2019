public class WinterMountain extends Mountain {
        private double temp = 0.0;
        public WinterMountain(int l, int w, int m, double givenTemp)   {
            super(l,w,m);
            temp = givenTemp;
        }
        public double getTemp() {
            return temp;
    }

}

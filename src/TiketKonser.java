abstract class TiketKonser implements HargaTiket {
    // Do your magic here...

    // Atribut tiket: jenis dan harga 
        protected String jenis;
        protected double harga;
    
        public TiketKonser(String jenis, double harga) {
            this.jenis = jenis;
            this.harga = harga;
        }
    
        public String getJenis() {
            return jenis;
        }
    
        public double getHarga() {
            return harga;
        }
  
 }
 
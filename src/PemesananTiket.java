class PemesananTiket {

    // Atribut PemesananTiket tidak ada jumlah seperti tugas-05 kemarin
  private String nama;
  private TiketKonser tiket;
  private String kodeBooking;
  private String tanggalPesan;

  //Memanggil method generateKodeBooking untuk kode acak pemesanan
  //Memanggil method getCurrentDate untuk tanggal user memesan
  public PemesananTiket(String nama, TiketKonser tiket) {
      this.nama = nama;
      this.tiket = tiket;
      this.kodeBooking = Main.generateKodeBooking();
      this.tanggalPesan = Main.getCurrentDate();
  }

  //Method output cetakNota
  public void cetakNota() {
      System.out.println("----- Detail Pemesanan -----");
      System.out.println("Nama Pemesan: " + nama);
      System.out.println("Kode Booking: " + kodeBooking);
      System.out.println("Tanggal Pesanan: " + tanggalPesan);
      System.out.println("Tiket yang dipesan: " + tiket.jenis);
      System.out.println("Total harga: " + tiket.harga + " USD");
  }

 }
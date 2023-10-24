class Spiller {
        private String navn;
        private Konto konto;


        public Spiller(String navn) {
            this.navn = navn;
            this.konto = new Konto(1000);
        }


        public String getNavn() {
            return navn;
        }


        public Konto getKonto() {
            return konto;
        }
    }

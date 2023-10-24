class Konto {
        private int saldo;


        public Konto(int startSaldo) {
            this.saldo = startSaldo;
        }


        public int getSaldo() {
            return saldo;
        }


        public boolean hævPenge(int beløb) {
            if (saldo >= beløb) {
                saldo -= beløb;
                return true;
            }
            return false;
        }


        public void indsætPenge(int beløb) {
            saldo += beløb;
        }
    }

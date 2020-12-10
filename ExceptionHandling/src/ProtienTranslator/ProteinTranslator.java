package ProtienTranslator;

public class ProteinTranslator {
    private String seq;

    public ProteinTranslator(String seq) {
        this.seq = seq;
    }

    public ProteinTranslator() {

    }
    public  String translate(String seq) {
        int length = seq.length();
        String[] codones = new String[length/3];
        int j = 3;
        int k = 0;
        for (int i = 0; i < seq.length(); i += 3) {
            String con = seq.substring(i, j+i);
            codones[k] = con;
            k++;
        }

        String[] protein={"Methionine","Phenylalanine","Leucine","Serine","Tyrosine","Cysteine","Trytophan","STOP"};
        System.out.printf("%s%20s\n","codones","Protein");
        for (String codone:codones) {
            if(codone.matches("AUG")){
                System.out.printf("AUG",protein[0]);
            }
            if(codone.matches("UUU")){
                System.out.printf("UUU",protein[1]);
            }
            if(codone.matches("UUC")){
                System.out.printf("UUC",protein[1]);
            }
            if(codone.matches("UUA")){
                System.out.printf("UUA",protein[2]);
            }
            if(codone.matches("UUG")){
                System.out.printf("UUG",protein[2]);
            }
            if(codone.matches("UCU")){
                System.out.printf("UCU",protein[3]);
            }
            if(codone.matches("UCC")){
                System.out.printf("UCC",protein[3]);

            }
            if(codone.matches("UCA")){
                System.out.printf("UCA",protein[3]);
            }
            if(codone.matches("UCG")){
                System.out.printf("UCG",protein[3]);
            }
            if(codone.matches("UAU")){
                System.out.printf("UAU",protein[4]);
            }
            if(codone.matches("UAC")){
                System.out.printf("UAC",protein[4]);
            }
            if(codone.matches("UGU")){
                System.out.printf("UGU",protein[5]);
            }
            if(codone.matches("UGC")){
                System.out.printf("UGC",protein[5]);
            }

            if(codone.matches("UGG")){
                System.out.printf("UGG",protein[6]);
            }
            if(codone.matches("UAA")){
                System.out.printf("UAA",protein[7]);
            }
            if(codone.matches("UAG")){
                System.out.printf("UAG",protein[7]);
            }
            if(codone.matches("UGA")){
                System.out.printf("UGA",protein[7]);
            }
        }
        return " ";
    }

}

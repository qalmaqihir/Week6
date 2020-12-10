package ProtienTranslator;

import java.util.Arrays;

public class ProteinTest {

    public static void main(String[] args) {
        System.out.println(translate("AUGUUUUCUUGA"));
        //todo: This is working good,, I dont know why i am using the class one

    }
    public static String translate(String seq) {
        int length = seq.length();
        String[] codones = new String[length/3];
        int j = 3;
        int k = 0;
        for (int i = 0; i < seq.length(); i += 3) {
            String con = seq.substring(i, j+i);
            codones[k] = con;
            k++;
        }
        System.out.printf("%s%20s\n","codones","Protein");
        String[] protein={"Methionine","Phenylalanine","Leucine","Serine","Tyrosine","Cysteine","Trytophan","STOP"};
        for (String codone:codones) {
            if(codone.matches("AUG")){
                System.out.printf("%s%20s\n","AUG",protein[0]);
            }
            if(codone.matches("UUU")){
                System.out.printf("%s%20s\n","UUU",protein[0]);
            }
            if(codone.matches("UUC")){
                System.out.printf("%s%20s\n","UUC",protein[1]);
            }
            if(codone.matches("UUA")){
                System.out.printf("%s%20s\n","UUA",protein[2]);
            }
            if(codone.matches("UUG")){
                System.out.printf("%s%20s\n","UUG",protein[2]);
            }
            if(codone.matches("UCU")){
                System.out.printf("%s%20s\n","UCU",protein[3]);
            }
            if(codone.matches("UCC")){
                System.out.printf("UCC",protein[3]);

            }
            if(codone.matches("UCA")){
                System.out.printf("%s%20s\n","UCA",protein[3]);
            }
            if(codone.matches("UCG")){
                System.out.printf("%s%20s\n","UCG",protein[3]);
            }
            if(codone.matches("UAU")){
                System.out.printf("%s%20s\n","UAU",protein[4]);
            }
            if(codone.matches("UAC")){
                System.out.printf("%s%20s\n","UAC",protein[4]);
            }
            if(codone.matches("UGU")){
                System.out.printf("%s%20s\n","UGU",protein[5]);
            }
            if(codone.matches("UGC")){
                System.out.printf("%s%20s\n","UGC",protein[5]);
            }

            if(codone.matches("UGG")){
                System.out.printf("%s%20s\n","UGG",protein[6]);
            }
            if(codone.matches("UAA")){
                System.out.printf("%s%20s\n","UAA",protein[7]);
            }
            if(codone.matches("UAG")){
                System.out.printf("%s%20s\n","UAG",protein[7]);
            }
            if(codone.matches("UGA")){
                System.out.printf("%s%20s\n","UGA",protein[7]);
            }
        }
        System.out.println("Condes: ");
        System.out.println(Arrays.toString(codones));
        return " ";
    }
}

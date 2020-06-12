package com.github.robertomanfreda.java12.numberformats;

import com.github.robertomanfreda.ITopic;

import java.text.NumberFormat;
import java.util.Locale;

public class NumbersFormat implements ITopic {

    public NumbersFormat() {
        postConstruct();
    }

    @Override
    public void postConstruct() {
        String intro = "\nE’ stato introdotto il supporto alla notazione compatta alla classe NumberFormat che " +
                "permette di formattare un numero in varie notazioni compatte in base al Locale impostato.";
        System.out.println(intro);
    }

    @Override
    public void exec() {
        System.out.println();
        compactNumberFormatting(2000);
        compactNumberFormatting(20000000);
        compactNumberFormatting(2000000000);
    }

    private static void compactNumberFormatting(final long numberToFormat) {
        final NumberFormat nfDefault = NumberFormat.getCompactNumberInstance();
        final NumberFormat nfItShort = NumberFormat.getCompactNumberInstance(Locale.ITALY, NumberFormat.Style.SHORT);
        final NumberFormat nfItLong = NumberFormat.getCompactNumberInstance(Locale.ITALY, NumberFormat.Style.LONG);
        final NumberFormat nfFrShort = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        final NumberFormat nfFrLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println("Numero da formattare '" + numberToFormat + "':");
        System.out.println("\tDefault:  " + nfDefault.format(numberToFormat));
        System.out.println("\tIT/Short: " + nfItShort.format(numberToFormat));
        System.out.println("\tIT/Long: " + nfItLong.format(numberToFormat));
        System.out.println("\tUS/Short: " + nfFrShort.format(numberToFormat));
        System.out.println("\tUS/Long:  " + nfFrLong.format(numberToFormat));

    }
}


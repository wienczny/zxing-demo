package com.github.test.zxing.demo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.DataMatrixWriter;

import java.awt.image.BufferedImage;

class Test {
    public static void main(final String[] args) {
        final DataMatrixWriter dataMatrixWriter = new DataMatrixWriter();
        final BitMatrix bitMatrix = dataMatrixWriter.encode(Test.class.getCanonicalName(), BarcodeFormat.DATA_MATRIX, 26, 26);
        final BufferedImage bufferedImage = MatrixToImageWriter.toBufferedImage(bitMatrix);
    }
}

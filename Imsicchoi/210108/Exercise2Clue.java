package Eighth;

public class Exercise2Clue {
    public static void main(String[] args) {
        // 128  64  32  16  8  4  2  1
        //  1   1   1   1   1  1  0  0

        //  0   0   0   0   0  1  0  0       4
        //  1   1   1   1   1  0  1  1      ~4

        // 63 - 32 + 16 + ... + 1
        // 0011 1111     63
        // 0000 0011      3 -> ~3   1111 1100
        // 0011 1111     63
        // 1111 1100     ~3  AND
        // ---------------------
        // 0011 1100     60
        System.out.println("63 & ~3 = " + (63 & ~3));
        // 0000 0111     7 -> ~7    1111 1000
        // 1111 1000    ~7
        // 0100 0001    65  AND
        // --------------------
        // 0100 0000    64
        System.out.println("65 & ~7 = " + (65 & ~7));
        // 0000 1111    15 -> ~15   1111 0000
        // 1111 0000   ~15
        // 0011 1111    63 AND
        // -------------------
        // 0011 0000    48
        System.out.println("63 & ~15 = " + (63 & ~15));
        System.out.println("65 & ~31 = " + (65 & ~31));

        // 1 0000 0010   258
        // 1 1111 1000    ~7  AND
        // ----------------------
        // 1 0000 0000   256
        System.out.println("258 & ~7 = " + (258 & ~7));

        // 1111 1111    255
        // 1111 0000    ~15   AND
        // ----------------------
        // 1111 0000    128 + 64 + 32 + 16 = 240
        System.out.println("255 & ~15 = " + (255 & ~15));
        System.out.println("258 & ~31 = " + (258 & ~31));
        System.out.println("255 & ~63 = " + (255 & ~63));
    }
}
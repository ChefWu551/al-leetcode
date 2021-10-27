package main.java.com.yuefeng;

// 位图：使用位来存储记录整数是否存在，
// 例如，存储0到1亿的1000万个数字，应该怎么存储问题，如果int数组进行存储，那么内存占用：4byte * 10^7 = 38.1 MB
// 如果使用位存储，1位对应一个数字，1byte对应16位，那么只需要(1亿个数字) 10^8 bit = 1.25^10^7 byte = 11.9 MB
// 如果是判断某个url是否存在与1000万个URL之中呢呢，每个url对应64byte，使用布隆过滤可以极大舒缓内存计算不足，效率远远比数组高，且节省的内存空间比hashmap多
// 思考：如何给1亿个整数（整数值位于1到1亿之间）进行排序，使用快排时间复杂度如何？还有没有更快，更省内存的方法？
import java.util.BitSet;

// 布隆过滤：使用位图进行存储，有K个计算hash值得算法，如果计算后的hash值均对应位图上是true则判断存在
// 此外布隆过滤存在误判的行为，需要误判有容错机制，可以极大节省计算内存空间
// java: BitSet容器
public class BitMap { // Java中char类型占16bit，也即是2个字节

    BitSet b = new BitSet();
    private char[] bytes;
    private int nbits;

    public BitMap(int nbits) {
        this.nbits = nbits;
        this.bytes = new char[nbits/16+1];
    }

    public void set(int k) {
        if (k > nbits) return;
        int byteIndex = k / 16;
        int bitIndex = k % 16;
        bytes[byteIndex] |= (1 << bitIndex);
    }

    public boolean get(int k) {
        if (k > nbits) return false;
        int byteIndex = k / 16;
        int bitIndex = k % 16;
        return (bytes[byteIndex] & (1 << bitIndex)) != 0;
    }
}

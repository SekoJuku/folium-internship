package friday.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ByteArray {
    private List<Byte> byteList;

    public ByteArray() {
        byteList = new ArrayList<>();
    }

    public ByteArray(int size) {
        byteList = new ArrayList<>(size);
    }

    public void add(Byte b) {
        byteList.add(b);
    }

    public int size() {
        return byteList.size();
    }

    public Byte get(int index) {
        return byteList.get(index);
    }


}

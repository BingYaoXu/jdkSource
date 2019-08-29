package mytest.hash;

/**
 * @description:模拟hashmap键hash冲突
 */
public class Key {
    int i;

    public Key(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
//        return this.i;
//        return 1;
        return 1;
    }
}

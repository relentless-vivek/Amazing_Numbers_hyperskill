class Holder {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}

class Main {
    final static int VALUE_NUM = 256;

    public static void main(String... args) {
        Holder holder = new Holder();
        holder.set(VALUE_NUM);

        // correct the line to make the code compile
        Integer value = (Integer) holder.get();

        // do not change
        System.out.println(value);
    }
}
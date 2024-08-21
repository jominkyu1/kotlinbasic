import org.jetbrains.annotations.NotNull;

public class MoneyJava implements Comparable<MoneyJava> {
    private final long amount;

    public MoneyJava(long amount){
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull MoneyJava o) {
        //같으면 0, 첫번째 파라미터가 더 크면 양수, 두번째 파라미터가 더 크면 음수
        return Long.compare(this.amount, o.amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return this.amount == ((MoneyJava) obj).amount;
    }
}

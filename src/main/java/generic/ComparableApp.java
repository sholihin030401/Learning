package generic;

import org.jetbrains.annotations.NotNull;

public class ComparableApp implements Comparable<ComparableApp>{

    private String prodi;
    private int usia;

    public ComparableApp(String prodi, int usia) {
        this.prodi = prodi;
        this.usia = usia;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    @Override
    public int compareTo(@NotNull ComparableApp o) {
        return this.prodi.compareTo(o.prodi);
    }

    @Override
    public String toString() {
        return "ComparableApp{" +
                "prodi='" + prodi + '\'' +
                ", usia=" + usia +
                '}';
    }
}
